package com.example.medicine.checkmedicine;

import com.example.medicine.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MedicinePart extends Activity{

	public View onCreateView(LayoutInflater inflater,
			ViewGroup container,Bundle savedInstanceState){
		View meLayout = inflater.inflate(R.layout.me_fragement, container,false);		
		return meLayout;	
	}
}
