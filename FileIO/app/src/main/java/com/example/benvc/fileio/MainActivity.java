package com.example.benvc.fileio;

import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.view.View;
import android.widget.*;
import android.view.View.*;
import java.io.*;
import android.content.*;//context
import android.content.res.*;//asset manager

public class MainActivity extends AppCompatActivity {
    Button readAMButton;
    Button readRAWButton;
    Button saveInternalButton;
    Button saveExternalButton;
    TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readAMButton = (Button) findViewById(R.id.readAMButton);
        readRAWButton = (Button) findViewById(R.id.readRAWButton);
        saveExternalButton = (Button) findViewById(R.id.saveExternalButton);
        saveInternalButton = (Button) findViewById(R.id.saveInternalButton);
        tvText = (TextView) findViewById(R.id.tvText);


        readAMButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                AssetManager am = getApplicationContext().getAssets();
                InputStream is = null;
                String str;
                try{
                    is = am.open("text.txt");
                    System.out.println("File Opened in Assets");
                }catch(IOException e){
                    System.out.println("Error Happened with File Opening.");
                }
                BufferedReader br = new BufferedReader(new InputStreamReader(is));

                try{
                    while((str = br.readLine()) != null){
                        System.out.println(str)
                        str;
                    }

                }catch(IOException e ){
                    System.out.println("Error Happened with File Reading.");
                }
            }
        });//end listener

        readRAWButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });//end listener


        saveExternalButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });//end listener

        saveInternalButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });//end listener

    }//end onCreate

    public boolean isExternalStorageWritable(){
        String state = Environment.getExternalStorageState();
        if(Environment.MEDIA_MOUNTED.equals(state)){
            return true;
        }
        return false;
    }

    public boolean isExternalStorageReadable(){
        String state = Environment.getExternalStorageState();
        if(Environment.MEDIA_MOUNTED.equals(state) || (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state))){
            return true;
        }
        return false;
    }





}//end Class