package com.example.medicine;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.medicine.HospitalAMap.HospitalMap;
import com.example.medicine.checkmedicine.Check_MuchResult;
import com.example.medicine.checkmedicine.MedicineClass;
import com.example.medicine.person_center.Answers;
import com.example.medicine.person_center.Person_Setting;


public class MainActivity extends FragmentActivity implements OnClickListener{	
	private View doctorLayout;
	private TextView xunyiText;
	private ImageView xunyiImage;
	private View medicineLayout;
	private TextView chayaoText;
	private ImageView chayaoImage;
	private View meLayout;
	private TextView meText;
	private ImageView meImage;
	private List<Fragment> mFragments = new ArrayList<Fragment>();
	private ViewPager mViewPager;
	public FragmentManager fragmentManager;
	
	//询医界面
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        //初始化所有控件，并为其赋值
        initView();
        fragmentManager = getSupportFragmentManager();
        
        //切换各个Fragement
//        setTabSelection(0);
        mViewPager = (ViewPager) findViewById(R.id.content);
//        mAdapter =  new MyFragmentPagerAdapter(fragmentManager,mFragments);
		mViewPager.setAdapter(new MyFragmentPagerAdapter(fragmentManager,(ArrayList<Fragment>) mFragments));
		
		mViewPager.setOnPageChangeListener(new OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int position) {
				// TODO Auto-generated method stub
				//重置字体颜色
				resetTextView();
				switch (position) {
				case 0:
					
//					doctor_Fragement.removeView(view);
					xunyiText.setTextColor(Color.parseColor("#00ff00"));
					xunyiImage.setImageResource(R.drawable.doctor_lightgreen);
					break;
				case 1:
					chayaoText.setTextColor(Color.parseColor("#00ff00"));
					chayaoImage.setImageResource(R.drawable.medicine_lightgreen);
					break;
				case 2:
					meText.setTextColor(Color.parseColor("#00ff00"));
					meImage.setImageResource(R.drawable.me_lightgreen);
					break;
				default:
					break;
				}
			}
			
			private void resetTextView() {
				// TODO Auto-generated method stub
				
				xunyiImage.setImageResource(R.drawable.doctor);
				chayaoImage.setImageResource(R.drawable.medicine);
				meImage.setImageResource(R.drawable.me_32);
				
				xunyiText.setTextColor(Color.parseColor("#000000"));
				chayaoText.setTextColor(Color.parseColor("#000000"));
				meText.setTextColor(Color.parseColor("#000000"));
			}

			@Override
			public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
				// TODO Auto-generated method stub
//				/** 
//                 * 利用position和currentIndex判断用户的操作是哪一页往哪一页滑动 
//                 * 然后改变根据positionOffset动态改变TabLine的leftMargin 
//                 */  
//                if (currentIndex == 0 && position == 0)// 0->1  
//                {  
////                    LinearLayout.LayoutParams lp = (android.widget.LinearLayout.LayoutParams) mTabLine  
////                            .getLayoutParams();  
////                    lp.leftMargin = (int) (positionOffset * (screenWidth * 1.0 / 3) + currentIndex * (screenWidth / 3));  
////                    mTabLine.setLayoutParams(lp);  
//  
//                } else if (currentIndex == 1 && position == 0) // 1->0  
//                {  
////                    LinearLayout.LayoutParams lp = (android.widget.LinearLayout.LayoutParams) mTabLine  
////                            .getLayoutParams();  
////                    lp.leftMargin = (int) (-(1 - positionOffset) * (screenWidth * 1.0 / 3) + currentIndex  
////                            * (screenWidth / 3));  
////                    mTabLine.setLayoutParams(lp);  
//  
//                } else if (currentIndex == 1 && position == 1) // 1->2  
//                {  
////                    LinearLayout.LayoutParams lp = (android.widget.LinearLayout.LayoutParams) mTabLine  
////                            .getLayoutParams();  
////                    lp.leftMargin = (int) (positionOffset * (screenWidth * 1.0 / 3) + currentIndex * (screenWidth / 3));  
////                    mTabLine.setLayoutParams(lp);  
//                } else if (currentIndex == 2 && position == 1) // 2->1  
//                {  
////                    LinearLayout.LayoutParams lp = (android.widget.LinearLayout.LayoutParams) mTabLine  
////                            .getLayoutParams();  
////                    lp.leftMargin = (int) (-(1 - positionOffset) * (screenWidth * 1.0 / 3) + currentIndex  
////                            * (screenWidth / 3));  
////                    mTabLine.setLayoutParams(lp);  
//  
//                }
			}
			
			@Override
			public void onPageScrollStateChanged(int state) {
				// TODO Auto-generated method stub
				
			}
		});
		
		mViewPager.setCurrentItem(0);
    }
    public void initView(){
    	
    	doctorLayout = findViewById(R.id.doctor_Layout);
    	xunyiText = (TextView) findViewById(R.id.text_xunyi);
    	xunyiImage = (ImageView) findViewById(R.id.image_xunyi);
    	
    	medicineLayout = findViewById(R.id.medicine_Layout);
    	chayaoText = (TextView) findViewById(R.id.text_chayao);
    	chayaoImage = (ImageView) findViewById(R.id.image_chayao);

    	meLayout = findViewById(R.id.me_Layout);
    	meText = (TextView) findViewById(R.id.text_wo);
    	meImage = (ImageView) findViewById(R.id.image_wo);

    	
    	doctorLayout.setOnClickListener(new MyOnClickListener(0));
    	medicineLayout.setOnClickListener(new MyOnClickListener(1));
    	meLayout.setOnClickListener(new MyOnClickListener(2));

    	doctor_Fragement fragement1 = new doctor_Fragement();
    	medicine_Fragement fragement2 = new medicine_Fragement();
    	me_Fragement fragement3 = new me_Fragement();
    	
    	mFragments.add(fragement1);
    	mFragments.add(fragement2);
    	mFragments.add(fragement3);
    }
    
    
    public class MyOnClickListener implements View.OnClickListener{
        private int index = 0 ;
        public MyOnClickListener(int i) {
            index = i;
        }

        @Override
        public void onClick(View v) {
            mViewPager.setCurrentItem(index);
        }
    }
    public void onClick(View view){
//    	switch (view.getId()) {
//		case R.id.doctor_Layout:
//			setTabSelection(0);
//			break;
//			
//		case R.id.medicine_Layout:
//			setTabSelection(1);
//			break;
//
//		case R.id.me_Layout:
//			setTabSelection(2);
//			break;
//		}
    	//加载健康三宝的医生聊天界面
    	TabAc(view);
    }
//    private void setTabSelection(int i){
//    	clearSelection();
//    	FragmentTransaction transaction = 
//    			fragmentManager.beginTransaction();
//    	hideFragments(transaction);
//    	switch (i) {
//		case 0:
//			xunyiImage.setImageResource(R.drawable.doctor_lightgreen);
//			xunyiText.setTextColor(Color.parseColor("#8FD25E"));
//			if(doctor_Fragement == null){
//				doctor_Fragement = new doctor_Fragement();
//				transaction.add(R.id.content, doctor_Fragement);
//			}else{
//				transaction.show(doctor_Fragement);
//			}
//			break;
//			
//		case 1:
//			chayaoImage.setImageResource(R.drawable.medicine_lightgreen);
//			chayaoText.setTextColor(Color.parseColor("#8FD25E"));
//			if(medicine_Fragement == null){
//				medicine_Fragement = new medicine_Fragement();
//				transaction.add(R.id.content, medicine_Fragement);
//			}else{
//				transaction.show(medicine_Fragement);
//			}
//			break;
//		case 2:
//			meImage.setImageResource(R.drawable.me_lightgreen);
//			meText.setTextColor(Color.parseColor("#8FD25E"));
//			if(me_Fragement == null){
//				me_Fragement = new me_Fragement();
//				transaction.add(R.id.content, me_Fragement);
//			}else{
//				transaction.show(me_Fragement);
//			}
//			break;
//		}
//    	transaction.commit();
//    }
//    private void clearSelection(){
//    	
//    	xunyiImage.setImageResource(R.drawable.doctor);
//    	xunyiText.setTextColor(Color.parseColor("#82858b"));
//    	
//    	chayaoImage.setImageResource(R.drawable.medicine);
//    	chayaoText.setTextColor(Color.parseColor("#82858b"));
//
//    	meImage.setImageResource(R.drawable.me_32);
//    	meText.setTextColor(Color.parseColor("#82858b"));
//    }
//    public void hideFragments(FragmentTransaction transaction){
//    	
//    	if(doctor_Fragement != null){
//    		transaction.hide(doctor_Fragement);
//    	}
//    	if(medicine_Fragement != null){
//    		transaction.hide(medicine_Fragement);
//    	}
//    	if(me_Fragement != null){
//    		transaction.hide(me_Fragement);
//    	}
//    }
//    public class MyAdapter extends BaseAdapter{
//
//    	private Object inflater;
//		public int getCount() {
//			// TODO Auto-generated method stub
//			return 2;
//		}
//
//		public Object getItem(int arg0) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		public long getItemId(int arg0) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//
//		public View getView(int position, View convertView, ViewGroup parent) {
//			// TODO Auto-generated method stub
//			View view;
//			if(convertView == null){
//				LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
//				view = inflater.inflate(R.layout.item, null);
//			}else{
//				view = convertView;
//			}
//			return view;
//		}
//    	
//    }
    //转换各个Activity
    public void TabAc(View view){
    	
    	Intent intent9 = new Intent(MainActivity.this,MedicineClass.class);
    	switch (view.getId()) {
    	//机器人
    	case R.id.list_two:
		case R.id.health_one:
			Intent intent1 = new Intent(MainActivity.this,Chat.class);
			startActivity(intent1);
			break;

		case R.id.health_two:
			Intent intent2 = new Intent(MainActivity.this,HospitalMap.class);
			startActivity(intent2);
			break;
			//在个人设置界面内设置转换Activity
		case R.id.imagebutton_name:
			//从登录界面获取本次登陆的账户名等信息，
			//然后传给个人信息界面
			Intent intent = getIntent();
			Intent intent4 = new Intent(MainActivity.this,Person_Setting.class);
			intent4.putExtra("name", intent.getStringExtra("loginname"));
			intent4.putExtra("password", intent.getStringExtra("loginpassword"));
			startActivity(intent4);
			break;
			//个人中心**
		case R.id.medicine_zhengchangsheng:
			Intent intent5 = new Intent(MainActivity.this,ZhengChangSheng.class);
			startActivity(intent5);
			break;

			
		case R.id.list_three:
			Intent intent7 = new Intent(MainActivity.this,Check_MuchResult.class);
			startActivity(intent7);
			break;
		case R.id.list_four:
			Intent intent8 = new Intent(MainActivity.this,Answers.class);
			startActivity(intent8);
			break;
			
			//查药Fragment
		case R.id.classifymedicine:
			intent9.putExtra("medicine", "classify_medicine");
			startActivity(intent9);
			break;
			//个人药品
		case R.id.list_one:
		case R.id.commonmedicine:
			intent9.putExtra("medicine", "common_medicine");
			startActivity(intent9);
			break;
			
		case R.id.partmedicine:
			intent9.putExtra("medicine", "part_medicine");
			startActivity(intent9);
			break;
		case R.id.waike:
			Intent intent12 = new Intent(MainActivity.this,WaiKe.class);
			startActivity(intent12);
			break;
		case R.id.yiyao:
			Intent intent13 = new Intent(MainActivity.this,YiYao.class);
			startActivity(intent13);
			break;
		case R.id.changweibing:
			Intent intent14 = new Intent(MainActivity.this,ChangWeiYan.class);
			startActivity(intent14);
			break;
		}
    }
}
