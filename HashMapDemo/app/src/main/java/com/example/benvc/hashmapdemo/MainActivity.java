package com.example.benvc.hashmapdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.content.Context;
import android.view.*;
import android.view.View;
import android.widget.*;//Toast
import java.util.*;//Hashmap, map, iterator

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Map<String,String> map = new HashMap<String,String>();//create hashmap
        map.put("color","RED");
        map.put("color1","BLUE");
        map.put("color2","PURPLE");
        map.put("color3","GREEN");
        map.put("color4","YELLOW");

        Iterator<String> myIterator = map.values().iterator();

        Context context = getApplicationContext();//Get context used by Toast

        while(myIterator.hasNext()){
            CharSequence text = myIterator.next();//get data
            int duration= Toast.LENGTH_LONG;//how long on the screen
            Toast toast = Toast.makeText(context,text,duration);

            toast.show();

        }//end while
        System.out.println(map.get("Color1"));
    }//end on Create
}//end class