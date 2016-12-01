package com.example.w0068332.myintent701;

import android.os.Bundle;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;

public class ActivityTwo extends MainActivity {
    TextView txtStuffRec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtStuffRec = (TextView) findViewById(R.id.txtStuffRec);


        String myStuff = "";
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            myStuff = extras.getString("KEY");
            txtStuffRec.setText(myStuff);
        }
    };
}//end method onCreate





