package com.example.medicine.checkmedicine;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.medicine.R;

public class Check_MuchResult extends Activity{

	private EditText Check_Weakness;
	private EditText Check1,Check2,Check3,Check4,Check5;
	
	private Button Checkbutton;
	private TextView result;
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.check_muchresult);
        initView();
        
        
        Checkbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String text1 = Check1.getText().toString().trim();
		        String text2 = Check2.getText().toString().trim();
		        String text3 = Check3.getText().toString().trim();
		        String text4 = Check4.getText().toString().trim();
		        String text5 = Check5.getText().toString().trim();
		        String weakness = Check_Weakness.getText().toString().trim();
		        
		        int index=0;
//		        List<String> c1 = new ArrayList<String>();
//		        List<String> c2 = new ArrayList<String>();
//		        HSSFCell one;
//		        HSSFCell two;
//				try {
//					String path = "e:\\6.xls";
//					
//					File file = new File(path);
//					InputStream is;
//					is = new FileInputStream(file);
//					HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
//					for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
//						HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
//						if (hssfSheet == null) {
//							continue;
//						}
//						// 获取当前工作薄的每一行
//						for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
//							HSSFRow hssfRow = hssfSheet.getRow(rowNum);
//							if (hssfRow != null) {
//								one = hssfRow.getCell(0);
//								//读取第一列数据
//								two = hssfRow.getCell(1);
//								//读取第二列数据
//								c1.add(one.toString());
//								c2.add(two.toString());
//							}
//						}
//					}
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					Toast.makeText(getBaseContext(), e.getMessage()+"",1).show();
//				}
//				
//				for(String ss : c1){
//					if(ss.contains(weakness)){
//						break;
//					}
//					index++;
//				}
//				String Normal = c2.get(index);
		        MedicineData md = new MedicineData();
		        String check_much[] = md.getCheck_much();
		        String check_much_medial[] = md.getCheck_much_medial();
		        for(int i=0;i<check_much.length;i++){
		        	if(weakness.equals(check_much[i])){
		        		index = i;
		        		break;
		        	}
		        }
				String much = "";
				if(!check_much_medial[index].contains(text1)){
					much+="\n"+text1;
				}
				if(!check_much_medial[index].contains(text2)){
					much+="\n"+text2;
				}
				if(!check_much_medial[index].contains(text3)){
					much+="\n"+text3;
				}
				if(!check_much_medial[index].contains(text4)){
					much+="\n"+text4;
				}
				if(!check_much_medial[index].contains(text5)){
					much+="\n"+text5;
				}
				if(much.equals("")){
					result.setText("无过度检查项");
				}else{
					result.setText("过度检查项有："+much);
				}
			}
		});
        
	}
	private void initView() {
		// TODO Auto-generated method stub
		Check_Weakness = (EditText) findViewById(R.id.input_jibing);
		Check1 = (EditText) findViewById(R.id.input_jianchaxiang1);
		Check2 = (EditText) findViewById(R.id.input_jianchaxiang2);
		Check3 = (EditText) findViewById(R.id.input_jianchaxiang3);
		Check4 = (EditText) findViewById(R.id.input_jianchaxiang4);
		Check5 = (EditText) findViewById(R.id.input_jianchaxiang5);
		
		Checkbutton =  (Button) findViewById(R.id.begin_Check);
		result = (TextView) findViewById(R.id.Check_result);
	}
	
	
	// 转换数据格式
//    private String getValue(HSSFCell hssfCell) {
//        if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
//            return String.valueOf(hssfCell.getBooleanCellValue());
//        } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
//            return String.valueOf(hssfCell.getNumericCellValue());
//        } else {
//            return String.valueOf(hssfCell.getStringCellValue());
//        }
//    }
}
