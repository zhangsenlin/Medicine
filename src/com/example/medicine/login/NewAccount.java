package com.example.medicine.login;

import java.util.ArrayList;
import java.util.List;

import com.example.medicine.Chat;
import com.example.medicine.MainActivity;
import com.example.medicine.R;
import com.example.medicine.login_data.AccountDao;
import com.example.medicine.login_data.LoginDatabaseHelper;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class NewAccount extends Activity{

	
	private EditText inputname;//用户名
	private RadioGroup radiogroup;
	private EditText inputpassword;//密码
	private EditText inputagainpassword;//二次输入密码
	private Button newaccount;//注册按钮
	
	public String name,sex,password,againpassword;
	
	public AccountDao accountdao;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.newaccount);
    	initLoginView();//初始化控件    	
    	judgeLogin();//判断是否登录
    }
	public void initLoginView(){
		inputname = (EditText) findViewById(R.id.newaccount_name);
		radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
		inputpassword = (EditText) findViewById(R.id.newaccount_password);
		inputagainpassword = (EditText) findViewById(R.id.newaccount_againpassword);
		//刚一开始为空
		inputname.setText("");
		inputpassword.setText("");
		inputagainpassword.setText("");
		
		newaccount = (Button) findViewById(R.id.newaccount);				
		accountdao = new AccountDao(this);
	}
	public void InputAssignment(){
		name = inputname.getText().toString();
		
		for(int i=0;i<radiogroup.getChildCount();i++){  
            RadioButton radioButton = (RadioButton)radiogroup.getChildAt(i);  
            if(radioButton.isChecked()){  
            	sex = radioButton.getText().toString().trim();  
            	break;
            }  
        } 
		password = inputpassword.getText().toString();
		againpassword = inputagainpassword.getText().toString();
	}
	public void judgeLogin(){
		//注册按钮
		newaccount.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				InputAssignment();//获取输入的内容
				name = inputname.getText().toString().trim();
				password = inputpassword.getText().toString().trim();
				againpassword = inputagainpassword.getText().toString().trim();
				Cursor cursor = accountdao.queryname(name);
				List<String> name_array = new ArrayList<>();
				
				//判断用户名是否重复
				boolean isRepeat = false;
				//对输入的信息进行检查
				if(name!="" && password!=""){
					//获取数据库所有用户名信息，
					if(cursor.moveToNext()){
						String _name = cursor.getString(cursor.getColumnIndex("name"));
						name_array.add(_name);
					}
					//遍历用户名，检查用户名输入是否重复
					for(String allname : name_array){
						if(allname.equals(name)){
							Toast.makeText(NewAccount.this, "此账户已存在！请重新输入", Toast.LENGTH_SHORT).show();
							isRepeat = true;
							break;
						}
					}
					if(!password.equals(againpassword)){
						Toast.makeText(NewAccount.this, "两次密码不一致！", 1).show();
					}
					if(!isRepeat && password.equals(againpassword)){
						accountdao.insert(name, password,sex);
						Intent intent = new Intent(NewAccount.this,Login.class);
						startActivity(intent);
						Toast.makeText(NewAccount.this, "恭喜你 ，注册成功！", 1).show();
						NewAccount.this.finish();
					}
				}else{
					Toast.makeText(NewAccount.this, "密码或账户名不能为空！", 1).show();
				}
				
			}
		});
	}
}
