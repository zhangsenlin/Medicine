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
	
	//��ʵ��ͼ	View
	MapView mMapView = null;  
	private LocationManager locationManager;
	private String provider;
	private BaiduMap mBaiduMap;
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);   
        //��ʹ��SDK�����֮ǰ��ʼ��context��Ϣ������ApplicationContext  
        //ע��÷���Ҫ��setContentView����֮ǰʵ��  
        SDKInitializer.initialize(getApplicationContext());  
        setContentView(R.layout.hospitalmap);  
        //��ȡ��ͼ�ؼ�����  
        mMapView = (MapView) findViewById(R.id.AmapView);
        mBaiduMap = mMapView.getMap();
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        
        //��ȡ���п��õ�λ���ṩ��
        List<String> providerList = locationManager.getProviders(true);
        if(providerList.contains(LocationManager.GPS_PROVIDER)){
        	provider = LocationManager.GPS_PROVIDER;
        }else if(providerList.contains(LocationManager.NETWORK_PROVIDER)){
        	provider =  LocationManager.NETWORK_PROVIDER;
        }else{
        	//��ǰû�п��õ�λ���ṩ����
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
		//����MapStatusUpdate�����Ա�������ͼ״̬��Ҫ�����ı仯  
		MapStatusUpdate mMapStatusUpdate = MapStatusUpdateFactory.newMapStatus(mMapStatus);  
		//�ı��ͼ״̬  
		mBaiduMap.setMapStatus(mMapStatusUpdate); 
		
	}
	@Override  
    protected void onDestroy() {  
        super.onDestroy();  
        //��activityִ��onDestroyʱִ��mMapView.onDestroy()��ʵ�ֵ�ͼ�������ڹ���  
        mMapView.onDestroy();  
    }  
    @Override  
    protected void onResume() {  
        super.onResume();  
        //��activityִ��onResumeʱִ��mMapView. onResume ()��ʵ�ֵ�ͼ�������ڹ���  
        mMapView.onResume();  
        }  
    @Override  
    protected void onPause() {  
        super.onPause();  
        //��activityִ��onPauseʱִ��mMapView. onPause ()��ʵ�ֵ�ͼ�������ڹ���  
        mMapView.onPause();  
        }  
    }