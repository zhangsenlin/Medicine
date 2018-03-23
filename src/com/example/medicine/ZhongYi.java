package com.example.medicine;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class ZhongYi extends Activity implements OnClickListener{


	private ImageView imageView;
	private TextView textView;
		protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.zhongyi);
	        
	        imageView = (ImageView) findViewById(R.id.zhongyiback);
	        textView = (TextView) findViewById(R.id.zhongyi_time);
	        
	        SimpleDateFormat formatter = new SimpleDateFormat("yyyy��MM��dd��    HH:mm:ss");       
	        Date curDate = new Date(System.currentTimeMillis());//��ȡ��ǰʱ��       
	        String str = formatter.format(curDate);
	        textView.setText(str);
	        
	        
	        imageView.setOnClickListener(this);
		}
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.zhongyiback:
				ZhongYi.this.finish();
				break;

			default:
				break;
			}
		}
}
