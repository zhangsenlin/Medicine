package com.example.medicine.HospitalAMap;

import android.app.Activity;
import android.content.Context;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.amap.api.maps.AMap;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.LocationSource.OnLocationChangedListener;
import com.amap.api.maps.MapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.MyLocationStyle;
import com.example.medicine.R;


@SuppressWarnings("unused")
public class HospitalMap extends Activity{
	
	//现实地图	View
	MapView mMapView = null;  
	private AMap aMap;
	private LocationManager locationManager;
	private String provider;
	
	private Animation centerMark;
	private ImageView centerImage,locate;
	
	private UiSettings mUiSettings;
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);   
        //在使用SDK各组件之前初始化context信息，传入ApplicationContext  
        //注意该方法要再setContentView方法之前实现  
        setContentView(R.layout.hospitalmap);  
        //获取地图控件引用  
        mMapView = (MapView) findViewById(R.id.AmapView);
        mMapView.onCreate(savedInstanceState);
        
        centerMark = AnimationUtils.loadAnimation(this, R.drawable.ic_launcher);
        
        centerImage = (ImageView) findViewById(R.drawable.search);
        locate= (ImageView) findViewById(R.drawable.setting);
        initView();
    }
	private void initView() {
		// TODO Auto-generated method stub
		if(aMap==null){
			aMap = mMapView.getMap();
			mUiSettings = aMap.getUiSettings();
		}

	}

}