package com.example.benvc.gridviewdemo;

import android.media.ImageReader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;//viewgroup
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;
import android.content.*;//context

public class MainActivity extends AppCompatActivity {
    //the images to display
    Integer[] imageIDs = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView)findViewById(R.id.gridView);
        //adapter
        gridView.setAdapter(new ImageAdapter(this));

        //listener
        gridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getBaseContext(),"pic"+(position+1)+" selected", Toast.LENGTH_LONG).show();
            }
        });


    }//end onCreate

    public class ImageAdapter extends BaseAdapter{
        private Context context;

        public ImageAdapter(Context c){
            context = c;
        }

        public int getCount(){
            return imageIDs.length;
        }

        public Object getItem(int position){
            return position;
        }

        public long getItemID(int position){
            return position;
        }

        public View getView(int position,View convertView, ViewGroup parent){

            ImageView imageView;
            if(convertView==null) {
                imageView = new ImageView(context);
                imageView.setLayoutParams(new GridView.LayoutParams(185, 185));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(5, 5, 5, 5);
            }else{
                imageView = (ImageView) convertView;
            }
            imageView.setImageResource(imageIDs[position]);
            return imageView;
        }
    }//end ImageAdapter
}//end class
