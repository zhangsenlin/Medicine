package com.example.medicine.HospitalBMap;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.model.LatLng;
import com.example.medicine.R;


public class HospitalMap extends Activity{
	
	//现实地图	View
	MapView mMapView = null;  
	private LocationManager locationManager;
	private String provider;
	private BaiduMap mBaiduMap;
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);   
        //在使用SDK各组件之前初始化context信息，传入ApplicationContext  
        //注意该方法要再setContentView方法之前实现  
        SDKInitializer.initialize(getApplicationContext());  
        setContentView(R.layout.hospitalmap);  
        //获取地图控件引用  
        mMapView = (MapView) findViewById(R.id.AmapView);
        mBaiduMap = mMapView.getMap();
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        
        //获取所有可用的位置提供器
        List<String> providerList = locationManager.getProviders(true);
        if(providerList.contains(LocationManager.GPS_PROVIDER)){
        	provider = LocationManager.GPS_PROVIDER;
        }else if(providerList.contains(LocationManager.NETWORK_PROVIDER)){
        	provider =  LocationManager.NETWORK_PROVIDER;
        }else{
        	//当前没有可用的位置提供器，
        	Toast.makeText(getApplicationContext(), "No Location provider to use", 1).show();
        	return;
        }
        Location location = locationManager.getLastKnownLocation(provider);
        if(location!=null){
        	showLocation(location);
        }
    }  
    private void showLocation(Location location) {
		// TODO Auto-generated method stub
//		MapController controller = mMapView.getController();
//    	GeoPoint point = new GeoPoint((int)(location.getLatitude()*1E6), 
//    			(int)(location.getLongitude()*1E6));
    	LatLng cenpt = new LatLng((int)(location.getLatitude()*1E6),
    			(int)(location.getLongitude()*1E6));
    	MapStatus mMapStatus = new MapStatus.Builder()  
        .target(cenpt)  
        .zoom(18)  
        .build();  
		//定义MapStatusUpdate对象，以便描述地图状态将要发生的变化  
		MapStatusUpdate mMapStatusUpdate = MapStatusUpdateFactory.newMapStatus(mMapStatus);  
		//改变地图状态  
		mBaiduMap.setMapStatus(mMapStatusUpdate); 
		
	}
	@Override  
    protected void onDestroy() {  
        super.onDestroy();  
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理  
        mMapView.onDestroy();  
    }  
    @Override  
    protected void onResume() {  
        super.onResume();  
        //在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理  
        mMapView.onResume();  
        }  
    @Override  
    protected void onPause() {  
        super.onPause();  
        //在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理  
        mMapView.onPause();  
        }  
    }