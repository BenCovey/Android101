package com.example.benvc.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.benvc.fragments.R.string.FragmentOne;
import static com.example.benvc.fragments.R.string.FragmentTwo;


public class fragment_main_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_main_activity);

    }

    public void selectFrag(View v){
        Fragment fr;
        if(v == findViewById(R.id.button2)){
            fr = new fragment_two();
        }else{
            fr = new fragment_one();
        }
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment,fr);
        ft.commit();
    }


}
