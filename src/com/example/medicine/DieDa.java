package com.example.medicine;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DieDa extends Activity implements OnClickListener{

	private ImageView imageView,ImageContent;
	private TextView textView,texttitle,textcontent;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dieda);
        
        String[] waikeArr = new String[]{
    			"糖友如何处理伤口","捏鼻子喝药容易呛","跌打损伤用药"
    			,"过度喝酒危害","熬夜减弱身体免疫","对症你吃对药了吗？"	
    			,"输液时别自己调速度","服药最常犯的8个错误"
    		};
        ImageContent = (ImageView) findViewById(R.id.waikeImage);
        imageView = (ImageView) findViewById(R.id.diedaback);
        textView = (TextView) findViewById(R.id.time);
        texttitle = (TextView) findViewById(R.id.waikeTitle);
        textcontent = (TextView) findViewById(R.id.waikeContent);
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日    HH:mm:ss     ");       
        Date curDate = new Date(System.currentTimeMillis());//获取当前时间       
        String str = formatter.format(curDate);
        textView.setText(str);
        
        imageView.setOnClickListener(this);
        
        Intent intent = getIntent();
        String ItemStr = intent.getStringExtra("waikeItem");
        if(ItemStr==null){
        	Toast.makeText(getBaseContext(), "ItemStr==null", 1).show();
        	ItemStr = "0";
        }
        switch (ItemStr) {
		case "0":
			texttitle.setText(waikeArr[0]);
			ImageContent.setImageResource(R.drawable.waike1);
			textcontent.setText(R.string.dieda_detailtext0);
			break;

		case "1":
			texttitle.setText(waikeArr[1]);
			ImageContent.setImageResource(R.drawable.waike2);
			textcontent.setText(R.string.dieda_detailtext1);
			break;
				
		case "2":
			texttitle.setText(waikeArr[2]);
			ImageContent.setImageResource(R.drawable.waike3);
			textcontent.setText(R.string.dieda_detailtext2);
		break;
		
		case "3":
			texttitle.setText(waikeArr[3]);
			ImageContent.setImageResource(R.drawable.waike4);
			textcontent.setText(R.string.dieda_detailtext3);
		break;
		
		case "4":
			texttitle.setText(waikeArr[4]);
			ImageContent.setImageResource(R.drawable.waike5);
			textcontent.setText(R.string.dieda_detailtext4);
		break;
		
		case "5":
			texttitle.setText(waikeArr[5]);
			ImageContent.setImageResource(R.drawable.waike6);
			textcontent.setText(R.string.dieda_detailtext5);
		break;
		
		case "6":
			texttitle.setText(waikeArr[6]);
			ImageContent.setImageResource(R.drawable.waike7);
			textcontent.setText(R.string.dieda_detailtext6);
		break;
		case "7":
			texttitle.setText(waikeArr[7]);
			ImageContent.setImageResource(R.drawable.waike8);
			textcontent.setText(R.string.dieda_detailtext7);
			break;
		default:
			break;
		}
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.diedaback:
			DieDa.this.finish();
			break;

		default:
			break;
		}
	}
}
