package com.example.medicine.checkmedicine;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.medicine.GanMaoLing;
import com.example.medicine.MainActivity;
import com.example.medicine.R;

public class MedicineClass extends Activity{

	private String[] group;

    private int[] icon;

    private String[][] itemArray;

    private ExpandableListView expandableListView;
    //获取数据类
    private MedicineData md;
    
    public void init(){
    	Intent intent = getIntent();
    	String data = intent.getStringExtra("medicine");
    	md = new MedicineData();
    	switch (data) {
		case "classify_medicine":
			group = md.getGroupString();
			
			itemArray = md.getItemString();
			break;

		case "common_medicine":
					
			group = md.CommonMedicineGroup();
			
			itemArray = md.getCommonMedicineChild();
					break;
		case "part_medicine":
			
			group = md.getPartMedicineGroup();
			
			itemArray = md.getmedialMedicineChild();
			break;
		default:
			break;
		}
    	
    	icon = new int[]{R.drawable.up,R.drawable.down};
    	
    	
    };
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.medicineclass);
        MedicineData medicineData = new MedicineData();
        // 随便一堆测试数据
        init();


ExpandableListAdapter adapter = new BaseExpandableListAdapter() {
			
			@Override
			public boolean isChildSelectable(int arg0, int arg1) {
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public boolean hasStableIds() {
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public View getGroupView(int groupPosition, boolean isExpanded, View conView, ViewGroup parent) {
				// TODO Auto-generated method stub
				View view = conView;
		        GroupHolder holder = null;
		        if(view == null){
		            holder = new GroupHolder();
		            view = LayoutInflater.from(getBaseContext()).inflate(R.layout.medicineclassgroup, null);
		            holder.groupName = (TextView)view.findViewById(R.id.grouptext);
		            holder.arrow = (ImageView)view.findViewById(R.id.groupimage);
		            view.setTag(holder);
		        }else{
		            holder = (GroupHolder)view.getTag();
		        }

		        //判断是否已经打开列表
		        if(isExpanded){
		            holder.arrow.setBackgroundResource(icon[1]);
		        }else{
		            holder.arrow.setBackgroundResource(icon[0]);
		        }

		        holder.groupName.setText(group[groupPosition]);
				return view;
			}
			
			@Override
			public long getGroupId(int position) {
				// TODO Auto-generated method stub
				return position;
			}
			
			@Override
			public int getGroupCount() {
				// TODO Auto-generated method stub
				return group.length;
			}
			
			@Override
			public Object getGroup(int position) {
				// TODO Auto-generated method stub
				return group[position];
			}
			
			@Override
			public int getChildrenCount(int position) {
				// TODO Auto-generated method stub
				return itemArray[position].length;
			}
			
			@Override
			public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View conView,
					ViewGroup parent) {
				// TODO Auto-generated method stub
				
				View view = conView;
		        ChildHolder holder = null;
		        if(view == null){
		            holder = new ChildHolder();
		            view = LayoutInflater.from(getBaseContext()).inflate(R.layout.medicineclasschild, null);
		            holder.childName = (TextView)view.findViewById(R.id.itemtext);
//		            holder.sound = (ImageView)view.findViewById(R.id.iv_sound);
//		            holder.divider = (ImageView)view.findViewById(R.id.iv_divider);
		            view.setTag(holder);
		        }else{
		            holder = (ChildHolder)view.getTag();
		        }

		        if(childPosition == 0){
//		            holder.divider.setVisibility(View.GONE);
		        }

//		        holder.sound.setBackgroundResource(R.drawable.sound);
		        holder.childName.setText(itemArray[groupPosition][childPosition]);

		        return view;
			}
			
			@Override
			public long getChildId(int group, int child) {
				// TODO Auto-generated method stub
				return child;
			}
			
			@Override
			public Object getChild(int group, int child) {
				// TODO Auto-generated method stub
				return itemArray[group][child];
			}
		};
		expandableListView = (ExpandableListView) findViewById(R.id.medicineclass);
		expandableListView.setGroupIndicator(null);//不要自带的图标了！！！
		expandableListView.setAdapter(adapter);
		
		expandableListView.setOnChildClickListener(new OnChildClickListener() {
			
			@Override
			public boolean onChildClick(ExpandableListView parent, View v,
					int groupPosition, int childPosition, long id) {
				// TODO Auto-generated method stub
				if(itemArray[groupPosition][childPosition]=="999感冒灵"){
					Intent intent = new Intent(MedicineClass.this,GanMaoLing.class);
					
//					intent.putExtra("Weakness", itemArray[groupPosition][childPosition]);
					startActivity(intent);
				}else{
					
					Intent intent = new Intent(MedicineClass.this,WeaknessCheck.class);
					
					intent.putExtra("Weakness", itemArray[groupPosition][childPosition]);
					startActivity(intent);
				}
				
				return false;
			}
		});
    }
    class GroupHolder{
        public TextView groupName;
        public ImageView arrow;
    }

    class ChildHolder{
        public TextView childName;
    }
    
    

}