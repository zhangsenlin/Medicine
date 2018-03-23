package com.example.medicine.person_center;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.example.medicine.R;

public class SoftWareInstroduce extends Activity{

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.softwareintroduce);
    }
}
