package com.example.medicine;

import java.util.Timer;
import java.util.TimerTask;

import com.example.medicine.login.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class WelcomeUI extends Activity{

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.welcomeui);
		
		Timer timer = new Timer();
		
		TimerTask ts = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent intent = new Intent(WelcomeUI.this,Login.class);
				startActivity(intent);
				WelcomeUI.this.finish();
			}
		};
		timer.schedule(ts, 1000*3);
	} 
}
