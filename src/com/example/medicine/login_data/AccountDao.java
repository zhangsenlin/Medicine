package com.example.medicine.login_data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * 此函数：
 * 1、创建Login.db数据库
 * 2、往student表中  插入数据方法
 * 3、query、queryname方法 查询数据库方法,
 * 4、update方法，更改密码所用
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

  //     往student表中  插入数据方法
  public  void insert(String name,String password,String sex){
//      获取数据库写的权限 一般都是更新
      SQLiteDatabase sqLiteDatabase= dbhelper.getWritableDatabase();
      String sql="insert into account(name,password,sex)values(?,?,?)";
      sqLiteDatabase.execSQL(sql,new String[]{name,password,sex});
  }

  //    查询数据库方法,  使用数据库读数据库权限的时候，不能调用sqLiteDatabase.close();
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
  //为ChangePassword类的修改密码设置的方法
  public void update(String name,String newpassword){
	  SQLiteDatabase sqLiteDatabase= dbhelper.getWritableDatabase();
	  ContentValues values = new ContentValues();
	  values.put("password", newpassword);
	  sqLiteDatabase.update("Login", values, "name = ?", new String [] {name});
  }
}