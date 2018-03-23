package com.example.medicine;

import com.example.medicine.checkmedicine.Check_MuchResult;
import com.example.medicine.checkmedicine.WeaknessCheck;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class doctor_Fragement extends Fragment{

	//顶部搜索栏组件
	private EditText doctor_searchtext;
	private TextView doctorsearchbutton_medicine;
	
	private RelativeLayout layout;
	String input;
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container,Bundle savedInstanceState){
		View doctorLayout = inflater.inflate(R.layout.doctor_fragement, container,false);		
		
		
		doctor_searchtext = (EditText)doctorLayout.findViewById(R.id.searchdoctor_text);
		doctorsearchbutton_medicine= (TextView)doctorLayout.findViewById(R.id.doctor_begin_searchdoctor);
		
		layout = (RelativeLayout) doctorLayout.findViewById(R.id.health_three);
		
    	doctorsearchbutton_medicine.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input = doctor_searchtext.getText().toString().trim();
				if(!input.equals("")){
					doctor_searchtext.setText("");
					Intent intent = new Intent(getActivity(),WeaknessCheck.class);
        			intent.putExtra("Weakness", input);
        			startActivity(intent);
				}else{
					Toast.makeText(getActivity(), "输入不要为空哦~", 1).show();
				}
			}
		});
    	
    	layout.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getActivity(),Check_MuchResult.class);
				startActivity(intent);
			}
		});
    	
    	
		return doctorLayout;	
	}
}
