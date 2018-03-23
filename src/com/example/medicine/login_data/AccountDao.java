package com.example.medicine.login_data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * �˺�����
 * 1������Login.db���ݿ�
 * 2����student����  �������ݷ���
 * 3��query��queryname���� ��ѯ���ݿⷽ��,
 * 4��update������������������
 * @author Administrator
 *
 */
public class AccountDao {
	Context context;
	LoginDatabaseHelper dbhelper;
   public AccountDao(Context context) {
      this.context = context;
      dbhelper=new LoginDatabaseHelper(context,"Login.db",null,1);
  }

  //     ��student����  �������ݷ���
  public  void insert(String name,String password,String sex){
//      ��ȡ���ݿ�д��Ȩ�� һ�㶼�Ǹ���
      SQLiteDatabase sqLiteDatabase= dbhelper.getWritableDatabase();
      String sql="insert into account(name,password,sex)values(?,?,?)";
      sqLiteDatabase.execSQL(sql,new String[]{name,password,sex});
  }

  //    ��ѯ���ݿⷽ��,  ʹ�����ݿ�����ݿ�Ȩ�޵�ʱ�򣬲��ܵ���sqLiteDatabase.close();
  public Cursor query(String name,String password){
      SQLiteDatabase sqLiteDatabase= dbhelper.getReadableDatabase();
      String sql="select*from account where name=?and password=?";
      return sqLiteDatabase.rawQuery(sql,new String[]{name,password});
  }
  
  //
  public Cursor queryname(String name){
	  SQLiteDatabase sqLiteDatabase= dbhelper.getReadableDatabase();
	  String sql="select*from account where name=?";
	  return sqLiteDatabase.rawQuery(sql,new String[]{name});
  }
  //ΪChangePassword����޸��������õķ���
  public void update(String name,String newpassword){
	  SQLiteDatabase sqLiteDatabase= dbhelper.getWritableDatabase();
	  ContentValues values = new ContentValues();
	  values.put("password", newpassword);
	  sqLiteDatabase.update("Login", values, "name = ?", new String [] {name});
  }
}