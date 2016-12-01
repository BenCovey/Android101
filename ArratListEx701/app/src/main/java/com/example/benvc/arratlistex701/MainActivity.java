package com.example.benvc.arratlistex701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create array list
        ArrayList<Object> arl = new ArrayList<Object>();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(20);
        Integer i3 = new Integer(30);
        Integer i4 = new Integer(40);
        String s1 = "my string";

        System.out.println("The Content of the arrayLst is: " + arl);
        System.out.println("The size of the arrayList is: " +arl.size());
        //regular form
        arl.add(i1);
        arl.add(i2);
        arl.add(i3);
        arl.add(i4);

        System.out.println("The Content of the arrayLst is: " + arl);
        System.out.println("The size of the arrayList is: " +arl.size());

        arl.remove(3);
    }
}
