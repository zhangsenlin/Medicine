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
    			"Ԥ������֧ ��ԡ���ʳ��","����ҩƷѡ��","����ҽ����������Ƹ෽"
    			,"��������ҩƷ�ͱ���Ʒ","��Ѫѹ����������ҩ","�ڼ��׷���","ҩ���˸ε����ԭ��",
    			"θҩ����ҩ���ٷ���Ϳ","���е�ҩ��Ҳ���ء�ɱ����"
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
			        	//��ȡʱ��
			        	 SimpleDateFormat   formatter   =   new   SimpleDateFormat   ("yyyy��MM��dd��   HH:mm:ss");     
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
