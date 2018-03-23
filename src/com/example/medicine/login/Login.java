package com.example.medicine.login;

import com.example.medicine.MainActivity;
import com.example.medicine.R;
import com.example.medicine.login_data.AccountDao;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 此类主要实现：
 * 1、判断输入的账户名和密码是否以被注册
 * 2、判断输入的合法性
 * 3、注册界面的引入
 * @author Administrator
 *
 */
public class Login extends Activity implements OnClickListener{

	private Button enter;
	public TextView newaccount;
	private ImageView image;
	
	boolean flag = false;//判断账号密码是否一致
	
	public EditText EditText_name,EditText_password;
	
	public String retuString;
	
	public AccountDao accountdao;
	
	private ImageView Welcomeimage;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login);
    	initLoginView();
        enter.setOnClickListener(this);
        newaccount.setOnClickListener(this);
        Welcomeimage = (ImageView) findViewById(R.id.welcomeimage);
        
        AlphaAnimation   alpha = new AlphaAnimation(1.0f, 0.0f);  
        alpha.setDuration(6000);  
        alpha.setFillAfter(true);  
        Welcomeimage.setAnimation(alpha);
    	//设置log图片透明
//    	image.setAlpha(0);
    }
	public void initLoginView(){
		//登录按钮
		enter = (Button) findViewById(R.id.enter_content);
		
		image = (ImageView) findViewById(R.id.log);
		//注册新账户
		newaccount = (TextView) findViewById(R.id.new_account);
		
		EditText_name = (EditText) findViewById(R.id.user_name);
		EditText_password = (EditText) findViewById(R.id.user_password);
		
		accountdao = new AccountDao(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//登录按钮
		if(v.getId()==R.id.enter_content){
			String name="",password="";
			String inputname,inputpassword;
			
			inputname = EditText_name.getText().toString();
			inputpassword = EditText_password.getText().toString();
			//从AccountDao的query方法中查询数据
			Cursor cursor = accountdao.query(inputname.trim(), inputpassword.trim());
			if(inputname!="" && inputpassword!=""){
				if(cursor.moveToNext()){
					Toast.makeText(Login.this, "登录成功", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(Login.this,MainActivity.class);
					//把数据传入主Activity中，以备个人信息中显示所用
					intent.putExtra("loginname", inputname);
					intent.putExtra("loginpassword", inputpassword);
					startActivity(intent);
				}else{
					Toast.makeText(Login.this, "密码与账户不匹配", Toast.LENGTH_SHORT).show();
				}
			}else{
				Toast.makeText(Login.this, "账户名或密码不能为空！", Toast.LENGTH_SHORT).show();
			}
		}
		//注册界面Activity
		if(v.getId()==R.id.new_account){
			Intent intent = new Intent(Login.this,NewAccount.class);
			startActivity(intent);
		}
	}
	//按回车键直接退出程序
	public void onBackPressed(){
		System.exit(0);
	}
 
}
