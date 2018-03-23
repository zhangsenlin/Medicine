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
 * ������Ҫʵ�֣�
 * 1���ж�������˻����������Ƿ��Ա�ע��
 * 2���ж�����ĺϷ���
 * 3��ע����������
 * @author Administrator
 *
 */
public class Login extends Activity implements OnClickListener{

	private Button enter;
	public TextView newaccount;
	private ImageView image;
	
	boolean flag = false;//�ж��˺������Ƿ�һ��
	
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
    	//����logͼƬ͸��
//    	image.setAlpha(0);
    }
	public void initLoginView(){
		//��¼��ť
		enter = (Button) findViewById(R.id.enter_content);
		
		image = (ImageView) findViewById(R.id.log);
		//ע�����˻�
		newaccount = (TextView) findViewById(R.id.new_account);
		
		EditText_name = (EditText) findViewById(R.id.user_name);
		EditText_password = (EditText) findViewById(R.id.user_password);
		
		accountdao = new AccountDao(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//��¼��ť
		if(v.getId()==R.id.enter_content){
			String name="",password="";
			String inputname,inputpassword;
			
			inputname = EditText_name.getText().toString();
			inputpassword = EditText_password.getText().toString();
			//��AccountDao��query�����в�ѯ����
			Cursor cursor = accountdao.query(inputname.trim(), inputpassword.trim());
			if(inputname!="" && inputpassword!=""){
				if(cursor.moveToNext()){
					Toast.makeText(Login.this, "��¼�ɹ�", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(Login.this,MainActivity.class);
					//�����ݴ�����Activity�У��Ա�������Ϣ����ʾ����
					intent.putExtra("loginname", inputname);
					intent.putExtra("loginpassword", inputpassword);
					startActivity(intent);
				}else{
					Toast.makeText(Login.this, "�������˻���ƥ��", Toast.LENGTH_SHORT).show();
				}
			}else{
				Toast.makeText(Login.this, "�˻��������벻��Ϊ�գ�", Toast.LENGTH_SHORT).show();
			}
		}
		//ע�����Activity
		if(v.getId()==R.id.new_account){
			Intent intent = new Intent(Login.this,NewAccount.class);
			startActivity(intent);
		}
	}
	//���س���ֱ���˳�����
	public void onBackPressed(){
		System.exit(0);
	}
 
}
