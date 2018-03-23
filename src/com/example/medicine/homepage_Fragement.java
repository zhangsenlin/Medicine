package com.example.medicine;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class homepage_Fragement extends Fragment{

	public View onCreateView(LayoutInflater inflater,
			ViewGroup container,Bundle savedInstanceState){
		View homepageLayout = inflater.inflate(R.layout.homepage_fragement, container,false);		
		return homepageLayout;	
	}
}
