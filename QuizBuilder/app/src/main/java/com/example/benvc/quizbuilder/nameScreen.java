package com.example.benvc.quizbuilder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class nameScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_screen);


        final Button Continue = (Button) findViewById(R.id.btnContinue);
        final EditText Name = (EditText) findViewById(R.id.txtName);
        Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(nameScreen.this,mainActivity.class);
                String value = "" + Name.getText();
                if(value != "") {
                    myIntent.putExtra("key", value); //Optional parameters
                    nameScreen.this.startActivity(myIntent);
                }else{
                    Toast.makeText(nameScreen.this, "Please Enter a name.", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}
