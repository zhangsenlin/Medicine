package com.example.medicine;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class GanMaoLing extends Activity implements OnClickListener{

	
	private ImageView imageView;
	private TextView textView;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.ganmaoling);
        
        
        imageView = (ImageView) findViewById(R.id.ganmaoling_cha);
//        textView = (TextView) findViewById(R.id.zhongyi_time);
        
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy��MM��dd��    HH:mm:ss");       
//        Date curDate = new Date(System.currentTimeMillis());//��ȡ��ǰʱ��       
//        String str = formatter.format(curDate);
//        textView.setText(str);
        
        
        imageView.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.ganmaoling_cha:
			GanMaoLing.this.finish();
			break;

		default:
			break;
		}
	}

}
