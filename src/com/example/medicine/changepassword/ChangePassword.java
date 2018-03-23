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
 * �˺�����Ҫ���ڸ���������߼�������
 * ���ظ�������Ľ��棬���в���
 * 
 * 1��Ϊ�����������͸��ĳɹ���ť��ֵ
 * 2���ж������������ĺϷ���
 * 3���Ӹ������ý����ȡ�����name��Ϊ�������
 * 4���������ݿ⣬���и��Ĳ�����
 * 5,�����ĳɹ�������������
 * @author Administrator
 *
 */
public class ChangePassword extends Activity implements OnClickListener{

	//��������ʱ����ʼ�������������
	public EditText InputNewpassword,AgainInputNewpassword;
	//��ʼ�����ɹ����ĵİ�ť
	public Button SuccessChange;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.changepassword);
        
        //Ϊ�ؼ�����ֵ
        initView();
        
        //���ÿؼ��ĵ���¼�
        SetOnClick();
    }
	public void initView(){
		//��������ʱ����ʼ�������������,��Ϊ�丶��ʼֵ
		InputNewpassword = (EditText) findViewById(R.id.changepassword_password);
		AgainInputNewpassword = (EditText) findViewById(R.id.changepassword_againpassword);
		//���ø��ĳɹ��İ�ť
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
			
			if(password!="" && againpassword!=""){//�ж�������������Ƿ�Ϊ��ֵ
				if(!InputNewpassword.equals(AgainInputNewpassword)){//�ж�������������Ƿ�һ��
					Toast.makeText(ChangePassword.this, "���벻һ�£�����������", 1).show();
				}else{
					//�Ӹ������õĽ����ȡ���λ���û�name,ʹ���������м�
					Intent intent1 =getIntent();
					AccountDao ac = new AccountDao(this);
					//����AccountDao��update��������������
					ac.update(intent1.getStringExtra("name_tochangepassword"), password);
					
					//���ĳɹ�������������
					Intent intent = new Intent(ChangePassword.this,MainActivity.class);
					startActivity(intent);
					Toast.makeText(ChangePassword.this, "���ĳɹ�", 1).show();
				}
			}else{
				Toast.makeText(ChangePassword.this, "���벻��Ϊ��", 1).show();
			}
		}
	}
}
