package com.example.medicine.checkmedicine;

import com.example.medicine.R;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

public class WeaknessCheck extends Activity{
	

	public String weakNess;
	
	private TextView jianjie,huanbingbili,yiganrenqun,chuanranfangshi,jiuzhenkeshi;
	private TextView zhiliaofangshi,zhiliaozhouqi,zhiyulv,changyongyaopin,zhiliaofeiyong;
	private TextView wenxintishi,bingyin,yufang,bingfazheng,zhengzhuang,jiancha,zhenduanjianbie;
	private TextView zhiliao,huli,yinshibaojian;
	
	private TextView content;
	protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.weaknesstopic);
        MedicineData medicineData = new MedicineData();
        // 随便一堆测试数据
        initView();
        
//        jianjie.setOnClickListener(this);
//        huanbingbili.setOnClickListener(this);
//        yiganrenqun.setOnClickListener(this);
//        chuanranfangshi.setOnClickListener(this);
//        jiuzhenkeshi.setOnClickListener(this);
//        zhiliaofangshi.setOnClickListener(this);
//        zhiliaozhouqi.setOnClickListener(this);
//        zhiyulv.setOnClickListener(this);
//        changyongyaopin.setOnClickListener(this);
//        zhiliaofeiyong.setOnClickListener(this);
//        wenxintishi.setOnClickListener(this);
//        bingyin.setOnClickListener(this);
//        yufang.setOnClickListener(this);
//        bingfazheng.setOnClickListener(this);
//        jiancha.setOnClickListener(this);
//        zhengzhuang.setOnClickListener(this);
//        zhenduanjianbie.setOnClickListener(this);
//        zhiliao.setOnClickListener(this);
//        huli.setOnClickListener(this);
//        yinshibaojian.setOnClickListener(this);
        
        final MedicineData md = new MedicineData();
        jianjie.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				initTextColor();
				switch (getIntent().getStringExtra("Weakness")) {
				case "感冒":
					content.setText(md.ganmao[0]);
					break;
				case "高血压":
					content.setText(md.gaoxueyan[0]);
					break;
				case "冠心病":
					content.setText(md.guanxinbing[0]);
					break;
				default:
					content.setText("暂无");
					break;
				}
				jianjie.setTextColor(Color.parseColor("#0000ff"));
			}
		});
        huanbingbili.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				initTextColor();
				switch (getIntent().getStringExtra("Weakness")) {
				case "感冒":
					content.setText(md.ganmao[1]);
					break;
				case "高血压":
					content.setText(md.gaoxueyan[1]);
					break;
				case "冠心病":
					content.setText(md.guanxinbing[1]);
					break;
				default:
					content.setText("暂无");
					break;
				}
				huanbingbili.setTextColor(Color.parseColor("#0000ff"));
			}
		});
        yiganrenqun.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				initTextColor();
				switch (getIntent().getStringExtra("Weakness")) {
				case "感冒":
					content.setText(md.ganmao[2]);
					break;
				case "高血压":
					content.setText(md.gaoxueyan[2]);
					break;
				case "冠心病":
					content.setText(md.guanxinbing[2]);
					break;
				default:
					content.setText("暂无");
					break;
				}
				yiganrenqun.setTextColor(Color.parseColor("#0000ff"));
			}
		});
        chuanranfangshi.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				initTextColor();
				switch (getIntent().getStringExtra("Weakness")) {
				case "感冒":
					content.setText(md.ganmao[3]);
					break;
				case "高血压":
					content.setText(md.gaoxueyan[3]);
					break;
				case "冠心病":
					content.setText(md.guanxinbing[3]);
					break;
				default:
					content.setText("暂无");
					break;
				}
				chuanranfangshi.setTextColor(Color.parseColor("#0000ff"));
			}
		});
        jiuzhenkeshi.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				initTextColor();
				switch (getIntent().getStringExtra("Weakness")) {
				case "感冒":
					content.setText(md.ganmao[4]);
					break;
				case "高血压":
					content.setText(md.gaoxueyan[4]);
					break;
				case "冠心病":
					content.setText(md.guanxinbing[4]);
					break;
				default:
					content.setText("暂无");
					break;
				}
				jiuzhenkeshi.setTextColor(Color.parseColor("#0000ff"));
			}
		});
        zhiliaofangshi.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				initTextColor();
				switch (getIntent().getStringExtra("Weakness")) {
				case "感冒":
					content.setText(md.ganmao[5]);
					break;
				case "高血压":
					content.setText(md.gaoxueyan[5]);
					break;
				case "冠心病":
					content.setText(md.guanxinbing[5]);
					break;
				default:
					content.setText("暂无");
					break;
				}
				zhiliaofangshi.setTextColor(Color.parseColor("#0000ff"));
			}
		});
        zhiliaozhouqi.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				initTextColor();
				switch (getIntent().getStringExtra("Weakness")) {
				case "感冒":
					content.setText(md.ganmao[6]);
					break;
				case "高血压":
					content.setText(md.gaoxueyan[6]);
					break;
				case "冠心病":
					content.setText(md.guanxinbing[6]);
					break;
				default:
					content.setText("暂无");
					break;
				}
				zhiliaozhouqi.setTextColor(Color.parseColor("#0000ff"));
			}
		});
        zhiyulv.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				initTextColor();
				switch (getIntent().getStringExtra("Weakness")) {
				case "感冒":
					content.setText(md.ganmao[7]);
					break;
				case "高血压":
					content.setText(md.gaoxueyan[7]);
					break;
				case "冠心病":
					content.setText(md.guanxinbing[7]);
					break;
				default:
					content.setText("暂无");
					break;
				}
				zhiyulv.setTextColor(Color.parseColor("#0000ff"));
			}
		});
        changyongyaopin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				initTextColor();
				switch (getIntent().getStringExtra("Weakness")) {
				case "感冒":
					content.setText(md.ganmao[8]);
					break;
				case "高血压":
					content.setText(md.gaoxueyan[8]);
					break;
				case "冠心病":
					content.setText(md.guanxinbing[8]);
					break;
				default:
					content.setText("暂无");
					break;
				}
				changyongyaopin.setTextColor(Color.parseColor("#0000ff"));
			}
		});
        zhiliaofeiyong.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				initTextColor();
				switch (getIntent().getStringExtra("Weakness")) {
				case "感冒":
					content.setText(md.ganmao[9]);
					break;
				case "高血压":
					content.setText(md.gaoxueyan[9]);
					break;
				case "冠心病":
					content.setText(md.guanxinbing[9]);
					break;
				default:
					content.setText("暂无");
					break;
				}
				zhiliaofeiyong.setTextColor(Color.parseColor("#0000ff"));
			}
		});
        wenxintishi.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				initTextColor();
				switch (getIntent().getStringExtra("Weakness")) {
				case "感冒":
					content.setText(md.ganmao[10]);
					break;
				case "高血压":
					content.setText(md.gaoxueyan[10]);
					break;
				case "冠心病":
					content.setText(md.guanxinbing[10]);
					break;
				default:
					content.setText("暂无");
					break;
				}
				wenxintishi.setTextColor(Color.parseColor("#0000ff"));
			}
		});
        bingyin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				initTextColor();
				switch (getIntent().getStringExtra("Weakness")) {
				case "感冒":
					content.setText(md.ganmao[11]);
					break;
				case "高血压":
					content.setText(md.gaoxueyan[11]);
					break;
				case "冠心病":
					content.setText(md.guanxinbing[11]);
					break;
				default:
					content.setText("暂无");
					break;
				}
				bingyin.setTextColor(Color.parseColor("#0000ff"));
			}
		});
        
        yufang.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				initTextColor();
				switch (getIntent().getStringExtra("Weakness")) {
				case "感冒":
					content.setText(md.ganmao[12]);
					break;
				case "高血压":
					content.setText(md.gaoxueyan[12]);
					break;
				case "冠心病":
					content.setText(md.guanxinbing[12]);
					break;
				default:
					content.setText("暂无");
					break;
				}
				yufang.setTextColor(Color.parseColor("#0000ff"));
			}
		});
        bingfazheng.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				initTextColor();
				switch (getIntent().getStringExtra("Weakness")) {
				case "感冒":
					content.setText(md.ganmao[13]);
					break;
				case "高血压":
					content.setText(md.gaoxueyan[13]);
					break;
				case "冠心病":
					content.setText(md.guanxinbing[13]);
					break;
				default:
					content.setText("暂无");
					break;
				}
				bingfazheng.setTextColor(Color.parseColor("#0000ff"));
			}
		}); 
        zhengzhuang.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				initTextColor();
				switch (getIntent().getStringExtra("Weakness")) {
				case "感冒":
					content.setText(md.ganmao[14]);
					break;
				case "高血压":
					content.setText(md.gaoxueyan[14]);
					break;
				case "冠心病":
					content.setText(md.guanxinbing[14]);
					break;
				default:
					content.setText("暂无");
					break;
				}
				zhengzhuang.setTextColor(Color.parseColor("#0000ff"));
			}
		});
		 jiancha.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					initTextColor();
					switch (getIntent().getStringExtra("Weakness")) {
					case "感冒":
						content.setText(md.ganmao[15]);
						break;
					case "高血压":
						content.setText(md.gaoxueyan[15]);
						break;
					case "冠心病":
						content.setText(md.guanxinbing[15]);
						break;
					default:
						content.setText("暂无");
						break;
					}
					jiancha.setTextColor(Color.parseColor("#0000ff"));
				}
			});
		 zhenduanjianbie.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					initTextColor();
					switch (getIntent().getStringExtra("Weakness")) {
					case "感冒":
						content.setText(md.ganmao[16]);
						break;
					case "高血压":
						content.setText(md.gaoxueyan[16]);
						break;
					case "冠心病":
						content.setText(md.guanxinbing[16]);
						break;
					default:
						content.setText("暂无");
						break;
					}
					zhenduanjianbie.setTextColor(Color.parseColor("#0000ff"));
				}
			});
		 
		 zhiliao.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					initTextColor();
					switch (getIntent().getStringExtra("Weakness")) {
					case "感冒":
						content.setText(md.ganmao[17]);
						break;
					case "高血压":
						content.setText(md.gaoxueyan[17]);
						break;
					case "冠心病":
						content.setText(md.guanxinbing[17]);
						break;
					default:
						content.setText("暂无");
						break;
					}
					zhiliao.setTextColor(Color.parseColor("#0000ff"));
				}
			}); 
		 huli.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					initTextColor();
					switch (getIntent().getStringExtra("Weakness")) {
					case "感冒":
						content.setText(md.ganmao[18]);
						break;
					case "高血压":
						content.setText(md.gaoxueyan[18]);
						break;
					case "冠心病":
						content.setText(md.guanxinbing[18]);
						break;
					default:
						content.setText("暂无");
						break;
					}
					huli.setTextColor(Color.parseColor("#0000ff"));
				}
			});
			 yinshibaojian.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						initTextColor();
						switch (getIntent().getStringExtra("Weakness")) {
						case "感冒":
							content.setText(md.ganmao[19]);
							break;
						case "高血压":
							content.setText(md.gaoxueyan[19]);
							break;
						case "冠心病":
							content.setText(md.guanxinbing[19]);
							break;
						default:
							content.setText("暂无");
							break;
						}
						yinshibaojian.setTextColor(Color.parseColor("#0000ff"));
					}
				});
			 
        
//        final String[] data = null;
//		final Handler handler = new Handler(){
//			public void handleMessage(Message msg){
//					initTextColor();
//					content.setText((String)msg.obj);
//					switch (msg.what) {
//					case 1:
//						jianjie.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 2:
//						huanbingbili.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 3:
//						yiganrenqun.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 4:
//						chuanranfangshi.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 5:
//						jiuzhenkeshi.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 6:
//						zhiliaofangshi.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 7:
//						zhiliaozhouqi.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 8:
//						zhiyulv.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 9:
//						changyongyaopin.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 10:
//						zhiliaofeiyong.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 11:
//						wenxintishi.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 12:
//						bingyin.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 13:
//						yufang.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 14:
//						bingfazheng.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 15:
//						zhengzhuang.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 16:
//						jiancha.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 17:
//						zhenduanjianbie.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 18:
//						zhiliao.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 19:
//						huli.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					case 20:
//						yinshibaojian.setTextColor(Color.parseColor("#0000ff"));
//						break;
//					default:
//						break;
//					}
//			}
//		};
//        jianjie.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[0]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[0]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[0]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(1,getData[0]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        huanbingbili.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[1]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[1]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[1]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
//						
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(2,getData[1]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        yiganrenqun.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[2]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[2]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[2]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(3,getData[2]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        
//        chuanranfangshi.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[3]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[3]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[3]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(4,getData[3]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        
//        
//        jiuzhenkeshi.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[4]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[4]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[4]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(5,getData[4]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//     
//        zhiliaofangshi.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[5]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[5]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[5]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(6,getData[5]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        
//        
//        zhiliaozhouqi.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[6]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[6]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[6]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(7,getData[6]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        
//        
//        zhiyulv.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[7]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[7]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[7]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(8,getData[7]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        
//        changyongyaopin.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[8]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[8]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[8]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(9,getData[8]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        
//        zhiliaofeiyong.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[9]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[9]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[9]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(10,getData[9]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        
//        wenxintishi.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[10]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[10]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[10]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(11,getData[10]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        
//        bingyin.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[11]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[11]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[11]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(12,getData[11]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        
//        yufang.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[12]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[12]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[12]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(13,getData[12]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        
//        bingfazheng.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[13]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[13]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[13]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(14,getData[13]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//		
//        zhengzhuang.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[14]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[14]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[14]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(15,getData[14]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        jiancha.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[15]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[15]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[15]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(16,getData[15]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        zhenduanjianbie.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[16]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[16]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[16]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(17,getData[16]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        zhiliao.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[17]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[17]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[17]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(18,getData[17]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        huli.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[18]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[18]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[18]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(19,getData[18]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
//        yinshibaojian.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				new Thread(new Runnable() {
//					public void run() {
//						
//						MedicineData md = new MedicineData();
//						switch (getIntent().getStringExtra("Weakness")) {
//						case "感冒":
//							handler.obtainMessage(1,md.ganmao[19]).sendToTarget();
//							break;
//						case "高血压":
//							handler.obtainMessage(1,md.gaoxueyan[19]).sendToTarget();					
//							break;
//						case "冠心病":
//							handler.obtainMessage(1,md.guanxinbing[19]).sendToTarget();
//							break;
//						default:
//							handler.obtainMessage(1,"暂无").sendToTarget();
//							break;
//						}
////						String getData[];
////						GetWeaknessDetial gwd = new GetWeaknessDetial();
////						getData = gwd.getContent(getIntent().getStringExtra("Weakness"));
////						handler.obtainMessage(20,getData[19]).sendToTarget();//
//					}
//				}).start();
//			}
//		});
    }
	public void initTextColor(){
		jianjie.setTextColor(Color.parseColor("#000000"));
		huanbingbili.setTextColor(Color.parseColor("#000000"));
		yiganrenqun.setTextColor(Color.parseColor("#000000"));
		chuanranfangshi.setTextColor(Color.parseColor("#000000"));
		jiuzhenkeshi.setTextColor(Color.parseColor("#000000"));
		zhiliaofangshi.setTextColor(Color.parseColor("#000000"));
		zhiliaozhouqi.setTextColor(Color.parseColor("#000000"));
		zhiyulv.setTextColor(Color.parseColor("#000000"));
		changyongyaopin.setTextColor(Color.parseColor("#000000"));
		zhiliaofeiyong.setTextColor(Color.parseColor("#000000"));
		
		wenxintishi.setTextColor(Color.parseColor("#000000"));
		bingyin.setTextColor(Color.parseColor("#000000"));
		yufang.setTextColor(Color.parseColor("#000000"));
		bingfazheng.setTextColor(Color.parseColor("#000000"));
		zhengzhuang.setTextColor(Color.parseColor("#000000"));
		jiancha.setTextColor(Color.parseColor("#000000"));
		zhenduanjianbie.setTextColor(Color.parseColor("#000000"));
		zhiliao.setTextColor(Color.parseColor("#000000"));
		huli.setTextColor(Color.parseColor("#000000"));
		yinshibaojian.setTextColor(Color.parseColor("#000000"));
		content.setText("");
	}
	public void initView(){
		jianjie = (TextView) findViewById(R.id.jianjie);
		huanbingbili = (TextView) findViewById(R.id.huanbingbili);
		yiganrenqun = (TextView) findViewById(R.id.yiganrenqun);
		chuanranfangshi = (TextView) findViewById(R.id.chuanranfangshi);
		jiuzhenkeshi = (TextView) findViewById(R.id.jiuzhenkeshi);
		zhiliaofangshi = (TextView) findViewById(R.id.zhiliaofangshi);
		zhiliaozhouqi = (TextView) findViewById(R.id.zhiliaozhouqi);
		zhiyulv = (TextView) findViewById(R.id.zhiyulv);
		changyongyaopin = (TextView) findViewById(R.id.changyongyaopin);
		zhiliaofeiyong = (TextView) findViewById(R.id.zhiliaofeiyong);
		
		wenxintishi = (TextView) findViewById(R.id.wenxintishi);
		bingyin = (TextView) findViewById(R.id.bingyin);
		yufang = (TextView) findViewById(R.id.yufang);
		bingfazheng = (TextView) findViewById(R.id.bingfazheng);
		zhengzhuang = (TextView) findViewById(R.id.zhengzhuang);
		jiancha = (TextView) findViewById(R.id.jiancha);
		zhenduanjianbie = (TextView) findViewById(R.id.zhenduanjianbie);
		zhiliao = (TextView) findViewById(R.id.zhiliao);
		huli = (TextView) findViewById(R.id.huli);
		yinshibaojian = (TextView) findViewById(R.id.yinshibaojian);
		
		content = (TextView) findViewById(R.id.weaknesscontent);
	}

	
}
