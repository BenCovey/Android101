package com.example.benvc.listview;

import android.view.*;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomerList extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] web;
    private final Integer[] imageID;

    public CustomerList(Activity context, String[]web,Integer[]imageID){
        super(context,R.layout.main_activity,web);
        this.context = context;
        this.web = web;
        this.imageID = imageID;
    }

    public View getView(int position,View view, ViewGroup parent){
        LayoutInflater inflater = context..getLayoutInflater();
        View rowView = inflater.inflate(R.layout.main_activity,null,true);
        TextView txtTitle = (TextView)rowView.findViewById(R.id.txt);
        ImageView imageView = (ImageView)rowView.findViewById(R.id.img);


}
