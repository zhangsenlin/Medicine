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

public class WaiKe extends Activity{

	private ListView listView;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.waikelistview);
        
        
        listView = (ListView) findViewById(R.id.listview);
        
        
        final int[] icon = new int []{R.drawable.waike1,R.drawable.waike2
        		,R.drawable.waike3,R.drawable.waike4,R.drawable.waike5,
        		R.drawable.waike6,R.drawable.waike7,R.drawable.waike8};
        
        
        final String[] waikeArr = new String[]{
    			"糖友如何处理伤口","捏鼻子喝药容易呛","跌打损伤用药"
    			,"过度喝酒危害","熬夜减弱身体免疫","对症你吃对药了吗？"	
    			,"输液时别自己调速度","服药最常犯的8个错误"
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
			        	Toast.makeText(getBaseContext(), "view==null", 1).show();
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
					Intent intent = new Intent(WaiKe.this,DieDa.class);
					intent.putExtra("waikeItem", (position)+"");
					startActivity(intent);
				}
				
			});
	}

}
