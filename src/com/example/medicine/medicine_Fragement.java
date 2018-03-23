package com.example.medicine;

import com.example.medicine.checkmedicine.WeaknessCheck;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class medicine_Fragement extends Fragment{

	//顶部搜索栏组件
	private EditText medicine_searchtext;
	private TextView medicinesearchbutton_medicine;
	String input;
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container,Bundle savedInstanceState){
		View medicineLayout = inflater.inflate(R.layout.medicine_fragement, container,false);		
		
		
		
		medicine_searchtext = (EditText)medicineLayout.findViewById(R.id.searchmedicine_text);
		medicinesearchbutton_medicine= (TextView)medicineLayout.findViewById(R.id.begin_searchmedicine);
		
    	
    	
    	medicinesearchbutton_medicine.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				input = medicine_searchtext.getText().toString().trim();
				if(!input.equals("")){
					medicine_searchtext.setText("");
					Intent intent = new Intent(getActivity(),WeaknessCheck.class);
        			intent.putExtra("Weakness", input);
        			startActivity(intent);
				}else{
					Toast.makeText(getActivity(), "输入不要为空哦~", 1).show();
				}
			}
		});
		
		return medicineLayout;	
	}
}
