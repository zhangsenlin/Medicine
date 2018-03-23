package com.example.medicine;


import java.text.SimpleDateFormat;
import java.util.Date;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class YiYao extends Activity{

	private ListView listView;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.waikelistview);
        
        
        listView = (ListView) findViewById(R.id.listview);
        
        
        final int[] icon = new int []{R.drawable.yiyao1,R.drawable.yiyao2
        		,R.drawable.yiyao3,R.drawable.yiyao4,R.drawable.yiyao5,
        		R.drawable.yiyao6,R.drawable.yiyao7,R.drawable.yiyao8,R.drawable.yiyao9};
        
        
        final String[] waikeArr = new String[]{
    			"预防老慢支 多吃”白食“","消化药品选用","老中医教你如何自制膏方"
    			,"怎样区分药品和保健品","高血压患者慎重用药","乌鸡白凤丸","药物伤肝的五大原因",
    			"胃药，肠药别再犯糊涂","亲切的药物也暗藏“杀机”"
    		};
		       BaseAdapter adapter  = new BaseAdapter() {
				
				@SuppressLint("ViewHolder") @Override
				public View getView(int position, View convertView, ViewGroup parent) {
					// TODO Auto-generated method stub
					View view = convertView;
//					Info info = new Info();
					TextView textView1,textView2;
					ImageView imageView = null;
			        if(view == null){
			        	//获取时间
			        	 SimpleDateFormat   formatter   =   new   SimpleDateFormat   ("yyyy年MM月dd日   HH:mm:ss");     
			        	  Date curDate =  new Date(System.currentTimeMillis());
			        	  String   time   =   formatter.format(curDate); 
			            view = LayoutInflater.from(getBaseContext()).inflate(R.layout.waikeitem_item, null);
			            textView1 = (TextView)view.findViewById(R.id.waiketopic);
			            textView2  = (TextView)view.findViewById(R.id.waiketime);
			            imageView = (ImageView) view.findViewById(R.id.waikeimage);
			            textView1.setText(waikeArr[position]);
			            textView2.setText(time);
			            imageView.setImageResource(icon[position]);
			        }else{
			        	
			        }
					return view;  
				}
				
				@Override
				public long getItemId(int position) {
					// TODO Auto-generated method stub
					return position;
				}
				
				@Override
				public Object getItem(int position) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public int getCount() {
					// TODO Auto-generated method stub
					return waikeArr.length;
				}
			}; 
	
			listView.setAdapter(adapter);
			listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(YiYao.this,ZhongYi.class);
					startActivity(intent);
				}
				
			});
	}

}
