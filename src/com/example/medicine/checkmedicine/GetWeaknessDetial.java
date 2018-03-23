package com.example.medicine.checkmedicine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class GetWeaknessDetial {

		
		String data[] = new String[20];
		public String[] getContent(String name){
			String driverName = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://172.20.56.130:3306/account?useSSL=false";
			
			String username = "root";
			String password = "12345";
			
			try {
				Class.forName(driverName);
				Connection connection = DriverManager.getConnection(url, username, password);
				java.sql.Statement smt = connection.createStatement();
				
				String sname = null;
				if(name==null)
				sname = "阿司匹林诱发哮喘";
				else
				sname = name;
				
				String sql = "select * from diseasedetail where NAME = '"+sname+"'";
				ResultSet rs = ((java.sql.Statement) smt).executeQuery(sql);
				
				int i=0;
				while(rs.next()){
					data[0]= rs.getString("JIANJIE");
					data[1]= rs.getString("BILI");
					data[2]= rs.getString("RENQUN");
					data[3]= rs.getString("CHUANRANFANGSHI");
					data[4]= rs.getString("KESHI");
					data[5]= rs.getString("ZHILIAOFANGSHI");
					data[6]= rs.getString("ZHILIAOZHOUQI");
					data[7]= rs.getString("ZHIYULV");
					data[8]= rs.getString("CHANGYONGYAOPIN");
					data[9]= rs.getString("FEIYONG");
					data[10]= rs.getString("TISHI");
					data[11]= rs.getString("BINGYIN");
					data[12]= rs.getString("YUFANG");
					data[13]= rs.getString("BINGFAZHENG");
					data[14]= rs.getString("ZHENGZHUANG");
					data[15]= rs.getString("JIANCHA");
					data[16]= rs.getString("ZHENDUANJIANBIE");
					data[17]= rs.getString("ZHILIAO");
					data[18]= rs.getString("HULI");
					data[19]= rs.getString("YINSHIBAOJIAN");
				}
				rs.close();
				smt.close();
				connection.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0;i<20;i++){
				if(data[i]==null){
					data[i]="暂无";
				}
			}
			return data;
		}
}
