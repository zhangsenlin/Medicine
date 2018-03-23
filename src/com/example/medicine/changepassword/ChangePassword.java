package com.example.medicine.changepassword;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.medicine.MainActivity;
import com.example.medicine.R;
import com.example.medicine.login_data.AccountDao;

/**
 * 此函数主要用于更改密码的逻辑操作，
 * 加载更改密码的界面，进行操作
 * 
 * 1、为新输入的密码和更改成功按钮赋值
 * 2、判断新输入的密码的合法性
 * 3、从个人设置界面获取本活动的name，为密码设键
 * 4、启用数据库，进行更改操作，
 * 5,、更改成功，返回主界面
 * @author Administrator
 *
 */
public class ChangePassword extends Activity implements OnClickListener{

	//更改密码时，初始化输入的新密码
	public EditText InputNewpassword,AgainInputNewpassword;
	//初始化，成功更改的按钮
	public Button SuccessChange;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.changepassword);
        
        //为控件赋初值
        initView();
        
        //设置控件的点击事件
        SetOnClick();
    }
	public void initView(){
		//更改密码时，初始化输入的新密码,并为其付初始值
		InputNewpassword = (EditText) findViewById(R.id.changepassword_password);
		AgainInputNewpassword = (EditText) findViewById(R.id.changepassword_againpassword);
		//设置更改成功的按钮
		SuccessChange = (Button) findViewById(R.id.changepassword_success);
	}
	private void SetOnClick() {
		// TODO Auto-generated method stub
		SuccessChange.setOnClickListener(this);
	}
	@SuppressLint("ShowToast") @Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.changepassword_success){
			InputNewpassword = (EditText) findViewById(R.id.changepassword_password);
			AgainInputNewpassword = (EditText) findViewById(R.id.changepassword_againpassword);
			
			String password = InputNewpassword.getText().toString().trim();
			String againpassword = AgainInputNewpassword.getText().toString().trim();
			
			if(password!="" && againpassword!=""){//判断新输入的密码是否为空值
				if(!InputNewpassword.equals(AgainInputNewpassword)){//判断新输入的密码是否一致
					Toast.makeText(ChangePassword.this, "密码不一致，请重新输入", 1).show();
				}else{
					//从个人设置的界面获取本次活动的用户name,使更改密码有键
					Intent intent1 =getIntent();
					AccountDao ac = new AccountDao(this);
					//调用AccountDao的update方法来更改密码
					ac.update(intent1.getStringExtra("name_tochangepassword"), password);
					
					//更改成功，返回主界面
					Intent intent = new Intent(ChangePassword.this,MainActivity.class);
					startActivity(intent);
					Toast.makeText(ChangePassword.this, "更改成功", 1).show();
				}
			}else{
				Toast.makeText(ChangePassword.this, "密码不能为空", 1).show();
			}
		}
	}
}
