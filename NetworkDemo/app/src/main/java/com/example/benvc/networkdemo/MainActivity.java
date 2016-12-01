package com.example.benvc.networkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.view.View;
import android.content.*;
import android.widget.*;
import android.net.*;


//add these lines to the manifest
//<uses-permission android:name="android.permission.INTERNET"/>
//<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
public class MainActivity extends AppCompatActivity {
    Button btnNetTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNetTest = (Button)findViewById(R.id.btnNetTest);
        btnNetTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isNetworkAvailable()){
                    Toast.makeText(MainActivity.this, "Connected", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Not Connected", Toast.LENGTH_SHORT).show();
                }
            }//end onClick
        });//End On Click Listener
    }//end on Create

    public boolean isNetworkAvailable(){
        ConnectivityManager cm = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        if(networkInfo != null && networkInfo.isConnected()){
            return true;
        }//end if
        return false;
    }//end method

}//end class
