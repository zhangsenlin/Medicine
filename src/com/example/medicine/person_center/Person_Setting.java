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
 * 此函数主要用于加载个人设置界面及相关操作
 * 1、设置退出界面
 * 2、引入修改密码的活动并为其传入本次name
 * @author Administrator
 *
 */
public class Person_Setting extends Activity implements OnClickListener{

	//初始化 个人界面的账户名。。
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
    	//从主界面获取账户名字等信息
    	//并为控件赋值
    	display_name = (TextView) findViewById(R.id.personsetting_name);
    	display_sex = (TextView) findViewById(R.id.personsetting_sex);
    	intent = getIntent();
    	display_name.setText(intent.getStringExtra("name"));
//    	display_sex.setText(intent.getStringExtra("password"));
    	display_sex.setText("男");
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
		//退出按钮，直接返回至登录的界面
		if(v.getId()==R.id.exit){
			Intent intent = new Intent(Person_Setting.this,Login.class);
			startActivity(intent);
			Toast.makeText(Person_Setting.this, "退出成功", 1).show();
		}else if(v.getId()==R.id.update_paddword){
			
			//启动更改密码的Activity
			Intent intent = new Intent(Person_Setting.this,ChangePassword.class);
			Intent intent1 = getIntent();
			
			//把本活动的账户名传入更改密码的Activity，以便于更改密码
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

