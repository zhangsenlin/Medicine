package com.example.medicine.person_center;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medicine.MainActivity;
import com.example.medicine.R;
import com.example.medicine.changepassword.ChangePassword;
import com.example.medicine.login.Login;
/**
 * �˺�����Ҫ���ڼ��ظ������ý��漰��ز���
 * 1�������˳�����
 * 2�������޸�����Ļ��Ϊ�䴫�뱾��name
 * @author Administrator
 *
 */
public class Person_Setting extends Activity implements OnClickListener{

	//��ʼ�� ���˽�����˻�������
	public TextView display_name,display_sex;
	Intent intent;
	public Button exit;
	public RelativeLayout changepassword;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.person_setting);
        
        initView();
        SetOnClick();
        
    }
    public void initView(){
    	//���������ȡ�˻����ֵ���Ϣ
    	//��Ϊ�ؼ���ֵ
    	display_name = (TextView) findViewById(R.id.personsetting_name);
    	display_sex = (TextView) findViewById(R.id.personsetting_sex);
    	intent = getIntent();
    	display_name.setText(intent.getStringExtra("name"));
//    	display_sex.setText(intent.getStringExtra("password"));
    	display_sex.setText("��");
    	exit = (Button) findViewById(R.id.exit);
    	
    	changepassword = (RelativeLayout) findViewById(R.id.update_paddword);
    }

    public void SetOnClick(){
    	exit.setOnClickListener(this);
    	changepassword.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//�˳���ť��ֱ�ӷ�������¼�Ľ���
		if(v.getId()==R.id.exit){
			Intent intent = new Intent(Person_Setting.this,Login.class);
			startActivity(intent);
			Toast.makeText(Person_Setting.this, "�˳��ɹ�", 1).show();
		}else if(v.getId()==R.id.update_paddword){
			
			//�������������Activity
			Intent intent = new Intent(Person_Setting.this,ChangePassword.class);
			Intent intent1 = getIntent();
			
			//�ѱ�����˻���������������Activity���Ա��ڸ�������
			intent.putExtra("name_tochangepassword", intent1.getStringExtra("name"));
			startActivity(intent);
		}
		switch (v.getId()) {
		case R.id.software_introduce:
			Intent intent = new Intent(Person_Setting.this,SoftWareInstroduce.class);
			startActivity(intent);
			break;

		default:
			break;
		}
	}
}

