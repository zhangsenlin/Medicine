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

	
	private EditText inputname;//�û���
	private RadioGroup radiogroup;
	private EditText inputpassword;//����
	private EditText inputagainpassword;//������������
	private Button newaccount;//ע�ᰴť
	
	public String name,sex,password,againpassword;
	
	public AccountDao accountdao;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.newaccount);
    	initLoginView();//��ʼ���ؼ�    	
    	judgeLogin();//�ж��Ƿ��¼
    }
	public void initLoginView(){
		inputname = (EditText) findViewById(R.id.newaccount_name);
		radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
		inputpassword = (EditText) findViewById(R.id.newaccount_password);
		inputagainpassword = (EditText) findViewById(R.id.newaccount_againpassword);
		//��һ��ʼΪ��
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
		//ע�ᰴť
		newaccount.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				InputAssignment();//��ȡ���������
				name = inputname.getText().toString().trim();
				password = inputpassword.getText().toString().trim();
				againpassword = inputagainpassword.getText().toString().trim();
				Cursor cursor = accountdao.queryname(name);
				List<String> name_array = new ArrayList<>();
				
				//�ж��û����Ƿ��ظ�
				boolean isRepeat = false;
				//���������Ϣ���м��
				if(name!="" && password!=""){
					//��ȡ���ݿ������û�����Ϣ��
					if(cursor.moveToNext()){
						String _name = cursor.getString(cursor.getColumnIndex("name"));
						name_array.add(_name);
					}
					//�����û���������û��������Ƿ��ظ�
					for(String allname : name_array){
						if(allname.equals(name)){
							Toast.makeText(NewAccount.this, "���˻��Ѵ��ڣ�����������", Toast.LENGTH_SHORT).show();
							isRepeat = true;
							break;
						}
					}
					if(!password.equals(againpassword)){
						Toast.makeText(NewAccount.this, "�������벻һ�£�", 1).show();
					}
					if(!isRepeat && password.equals(againpassword)){
						accountdao.insert(name, password,sex);
						Intent intent = new Intent(NewAccount.this,Login.class);
						startActivity(intent);
						Toast.makeText(NewAccount.this, "��ϲ�� ��ע��ɹ���", 1).show();
						NewAccount.this.finish();
					}
				}else{
					Toast.makeText(NewAccount.this, "������˻�������Ϊ�գ�", 1).show();
				}
				
			}
		});
	}
}
