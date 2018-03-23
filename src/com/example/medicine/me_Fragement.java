package com.example.medicine;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class me_Fragement extends Fragment{

	public View onCreateView(LayoutInflater inflater,
			ViewGroup container,Bundle savedInstanceState){
		View meLayout = inflater.inflate(R.layout.me_fragement, container,false);		
		return meLayout;	
	}
}
