package com.example.benvc.sharedprefdemo;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.*;
import android.util.Log;

/**
 * Created by benvc on 2016-10-24.
 */

public class DBAdapter {
    public static final String KEY_ROWID = "_id";
    public static final String KEY_NAME = "_name";
    public static final String KEY_EMAIL = "_email";
    public static final String TAG = "DBAdapter";
    public static final String DATABASE_NAME = "MyDB";
    public static final String DATABASE_TABLE = "contacts";
    public static final int DATABASE_VERSION = 2;
    public static final String DATABASE_CREATE =
            "create table contacts(_id integer primary key autoincrement," +
                    "name text not null, email text not null);";
    private final Context context;
    private final DataBaseHelper DBHelper;
    private SQLiteDatabase db;
    public DBAdapter(Context ctx){
        this.context = ctx;
        DBHelper = new DataBaseHelper(context);
    }

    private static class DataBaseHelper extends SQLiteOpenHelper{
        DataBaseHelper(Context context){
            super(context,DATABASE_NAME,null,DATABASE_VERSION);
        }//end DatabaseHelp

        public void onCreate(SQLiteDatabase db){
            try{
                db.execSQL(DATABASE_CREATE);
            }catch(SQLException e){
                e.printStackTrace();
            }//end try catch

        }//end onCreate

        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
            Log.w(TAG,"Upgrade database from version " + oldVersion + " to " + newVersion + ", which will destroy all old data.");
            db.execSQL("DROP TABLE IF EXISTS IN contacts");
            onCreate(db);
        }//end onUpgrade

    }//end DatabaseHelp method

    public DBAdapter open() throws SQLException{
        db = DBHelper.getWritableDatabase();
        return this;
    }//end DBAdapter

    public void close(){
        DBHelper.close();
    }

    //insert a contact into database
    public long insertContact(String name,String email){
        ContentValues initialValues = new ContentValues();
        initialValues.put(KEY_NAME,name);
        initialValues.put(KEY_EMAIL,email);
        return db.insert(DATABASE_TABLE,null,initialValues);
    }
    //delete a particular contact
    public boolean deleteContact(long rowID){
        return db.delete(DATABASE_TABLE,KEY_ROWID + "=" +rowID,null)>0;
    }
    //retrieve all the contacts
    //retrieve a single contact
    //update a contact

}
