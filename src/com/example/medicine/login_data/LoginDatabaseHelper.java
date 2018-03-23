package com.example.medicine.login_data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * 此类：
 * 1、创建account表，包括名字和密码
 * 
 * @author Administrator
 *
 */
public class LoginDatabaseHelper extends SQLiteOpenHelper{		
		private Context mContext;
		public LoginDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
	        super(context, name, factory, version);
	    }

	    @Override
	    public void onCreate(SQLiteDatabase sqLiteDatabase) {
	               String sql="create table account(id integer primary key autoincrement," +
	                       "name varchar(3),"+"password varchar(3),"+"sex varchar(3))";
	        sqLiteDatabase.execSQL(sql);
	    }

	    @Override
	    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

	    }

}
