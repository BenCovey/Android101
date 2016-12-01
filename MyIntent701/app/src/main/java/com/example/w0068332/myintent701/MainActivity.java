package com.example.w0068332.myintent701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.os.*;
import android.app.Activity;
import android.view.View.OnClickListener;//listener
import android.content.Intent;//needed for using intents
import android.provider.ContactsContract;//contacts manager
import android.net.Uri;//used for URLs
import android.widget.*;//for buttons
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends AppCompatActivity {

    Button btnGoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGoto = (Button)findViewById(R.id.btnGoto);
        btnGoto.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("ActivityTwo"));

                Intent i = new Intent("ActivityTwo");
                Bundle extras = new Bundle();
                extras.putString("KEY","stuff");
                i.putExtras(extras);

                startActivity(i,l);
            }
        });
    }//end method onCreate
}//end main
