package com.example.xinthe.contactsapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by xinthe on 8/6/2016.
 */
public class DBHelper extends SQLiteOpenHelper {
    final static String DATABASE_NAME="phonebook";
    final static int DATABASE_VERSION=1;
    final static String TABLE_CONTACTS="contacts";
    final static String CONTACTS_ID="_id";
    final static String CONTACTS_NAME="name";
    final static String CONTACTS_PHONE="phone";
    final static String CONTACTS_EMAIL="email";
    final static String QUERY_DROP_CONTACT = "DROP TABLE IF NOT EXISTS"+TABLE_CONTACTS;
    final  static String QUERY_CREATE_CONTACT="CREATE TABLE IF NOT EXISTS"+TABLE_CONTACTS+"("+CONTACTS_ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"+CONTACTS_NAME+"TEXT,"+CONTACTS_PHONE+"TEXT,"+CONTACTS_EMAIL+"TEXT)";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(QUERY_CREATE_CONTACT);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(QUERY_DROP_CONTACT);
    }

   public long insertContact(ContactHolder values){
       SQLiteDatabase db = getWritableDatabase();
       ContentValues val = new ContentValues();
       val.put(CONTACTS_NAME,values.name);
       val.put(CONTACTS_PHONE,values.phoneNumber);
       val.put(CONTACTS_EMAIL,values.email);
       Long ret = db.insert(TABLE_CONTACTS,null,val);
       return ret;
   }
    }

