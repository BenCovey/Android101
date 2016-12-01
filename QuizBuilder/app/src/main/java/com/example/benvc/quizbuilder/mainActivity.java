package com.example.benvc.quizbuilder;


import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import android.view.View.OnClickListener;

public class mainActivity extends AppCompatActivity {
    int question;
    int score;
    int qnumber = 1;
    Button Next;
    Button Choice1;
    Button Choice2;
    Button Choice3;
    Button Choice4;
    Button back;
    TextView Def;
    TextView ChoiceA;
    TextView ChoiceB;
    TextView ChoiceC;
    TextView ChoiceD;
    ArrayList<String[]> a = new ArrayList<String[]>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        Def = (TextView) findViewById(R.id.tvDefintion);
        back = (Button) findViewById(R.id.btnBack);
        Choice1 = (Button) findViewById(R.id.btnOne);
        Choice2 = (Button) findViewById(R.id.btnTwo);
        Choice3 = (Button) findViewById(R.id.btnThree);
        Choice4 = (Button) findViewById(R.id.btnFour);
        Next = (Button) findViewById(R.id.btnNext);
        ChoiceA = (TextView) findViewById(R.id.tvChoice1);
        ChoiceB = (TextView) findViewById(R.id.tvChoice2);
        ChoiceC = (TextView) findViewById(R.id.tvChoice3);
        ChoiceD = (TextView) findViewById(R.id.tvChoice4);
        // I N T E N T S
        Intent intent = getIntent();
        String value = intent.getStringExtra("key");
        //Set welcome Message via TOAST
        Toast.makeText(this, "Welcome " + value, Toast.LENGTH_LONG).show();

        //D I S A B L E     N E X T
        Next.setEnabled(false);
        //B U F F E R E D   R E A D E R
        AssetManager am = getApplicationContext().getAssets();
        InputStream is = null;
        try {
            is = am.open("quiz.txt");
            System.out.println("File in assets is open");

        } catch (IOException e) {
            System.out.println("Error opening file");
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String s;
        try {
            while ((s = br.readLine()) != null) {
                String[] list = s.split(",");

                a.add(list);

            }//end loop
        } catch (IOException e) {
            System.out.println("Error reading line from file");
        }//end catch

        //TEST SETS //TODO
        question = 0;
        Next();



        //O N C L I C K L I S T E N E R S

       OnClickListener Back = new OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent myIntent = new Intent(mainActivity.this, nameScreen.class);
               mainActivity.this.startActivity(myIntent);
           }
       };



        OnClickListener next = new OnClickListener() {
            @Override
            public void onClick(View v) {
                Next();
                Choice1.setEnabled(true);
                Choice2.setEnabled(true);
                Choice3.setEnabled(true);
                Choice4.setEnabled(true);
                Next.setEnabled(false);
            }
        };

        final OnClickListener ChoiceOne = new OnClickListener() {
            @Override
            public void onClick(View v) {
                String button = ChoiceA.getText().toString();
                button.replace(" ", "");
                if (button.equals(a.get(question - 1)[1])) {
                    Toast.makeText(mainActivity.this, "Correct. Press Next to Continue", Toast.LENGTH_SHORT).show();
                    Choice1.setEnabled(false);
                    Choice2.setEnabled(false);
                    Choice3.setEnabled(false);
                    Choice4.setEnabled(false);
                    Next.setEnabled(true);
                    score++;
                    qnumber++;
                } else {
                    Toast.makeText(mainActivity.this, "Incorrect. Press Next to Continue", Toast.LENGTH_SHORT).show();
                    Choice1.setEnabled(false);
                    Choice2.setEnabled(false);
                    Choice3.setEnabled(false);
                    Choice4.setEnabled(false);
                    Next.setEnabled(true);
                    qnumber++;
                }
            }
        };

        OnClickListener ChoiceTwo = new OnClickListener() {
            @Override
            public void onClick(View v) {
                String button = ChoiceB.getText().toString();
                button.replace(" ", "");
                if (button.equals(a.get(question - 1)[1])) {
                    Toast.makeText(mainActivity.this, "Correct. Press Next to Continue", Toast.LENGTH_SHORT).show();
                    Choice1.setEnabled(false);
                    Choice2.setEnabled(false);
                    Choice3.setEnabled(false);
                    Choice4.setEnabled(false);
                    Next.setEnabled(true);
                    score++;
                    qnumber++;
                } else {
                    Toast.makeText(mainActivity.this, "Incorrect. Press Next to Continue", Toast.LENGTH_SHORT).show();
                    Choice1.setEnabled(false);
                    Choice2.setEnabled(false);
                    Choice3.setEnabled(false);
                    Choice4.setEnabled(false);
                    Next.setEnabled(true);
                    qnumber++;
                }
            }
        };

        OnClickListener ChoiceThree = new OnClickListener() {
            @Override
            public void onClick(View v) {
                String button = ChoiceC.getText().toString();
                button.replace(" ", "");
                if (button.equals(a.get(question - 1)[1])) {
                    Toast.makeText(mainActivity.this, "Correct. Press Next to Continue", Toast.LENGTH_SHORT).show();
                    Choice1.setEnabled(false);
                    Choice2.setEnabled(false);
                    Choice3.setEnabled(false);
                    Choice4.setEnabled(false);
                    Next.setEnabled(true);
                    score++;
                    qnumber++;
                } else {
                    Toast.makeText(mainActivity.this, "Incorrect. Press Next to Continue", Toast.LENGTH_SHORT).show();
                    Choice1.setEnabled(false);
                    Choice2.setEnabled(false);
                    Choice3.setEnabled(false);
                    Choice4.setEnabled(false);
                    Next.setEnabled(true);
                    qnumber++;
                }
            }
        };

        OnClickListener ChoiceFour = new OnClickListener() {
            @Override
            public void onClick(View v) {
                String button = ChoiceD.getText().toString();
                button.replace(" ", "");
                if (button.equals(a.get(question - 1)[1])) {
                    Toast.makeText(mainActivity.this, "Correct. Press Next to Continue", Toast.LENGTH_SHORT).show();
                    Choice1.setEnabled(false);
                    Choice2.setEnabled(false);
                    Choice3.setEnabled(false);
                    Choice4.setEnabled(false);
                    Next.setEnabled(true);
                    score++;
                    qnumber++;
                } else {
                    Toast.makeText(mainActivity.this, "Incorrect. Press Next to Continue", Toast.LENGTH_SHORT).show();
                    Choice1.setEnabled(false);
                    Choice2.setEnabled(false);
                    Choice3.setEnabled(false);
                    Choice4.setEnabled(false);
                    Next.setEnabled(true);
                    qnumber++;
                }
            }
        };

        // S E T    U P     O C L'S
        Choice1.setOnClickListener(ChoiceOne);
        Choice2.setOnClickListener(ChoiceTwo);
        Choice3.setOnClickListener(ChoiceThree);
        Choice4.setOnClickListener(ChoiceFour);
        Next.setOnClickListener(next);
        back.setOnClickListener(Back);

    }

    void Next() {

         if(question != 9) {
            Def.setText(a.get(question)[0]);
             Def.setText(a.get(question)[0]);
             String c1 = (a.get(question)[1]);
             String c2 = (a.get(question)[2]);
             String c3 = (a.get(question)[3]);
             String c4 = (a.get(question)[4]);
             int answer2;
             int answer3;
             int answer4;
             Random rn1 = new Random();
             Random rn2 = new Random();
             Random rn3 = new Random();
             Random rn4 = new Random();
             int answer1 = rn1.nextInt(4) + 1;
             //LOOP
             do{
                 answer2 = rn2.nextInt(4) + 1;
             }while(answer1 == answer2);
             //LOOP
             do{
                 answer3 = rn3.nextInt(4) + 1;
             }while(answer1 == answer3 || answer2 == answer3);
             //LOOP
             do{
                 answer4 = rn4.nextInt(4) + 1;
             }while(answer1 == answer4 || answer2 == answer4 || answer3 == answer4);

             if(answer1 == 1){
                 ChoiceA.setText(c1);
             }else if(answer1 == 2){
                 ChoiceB.setText(c1);
             }else if(answer1 == 3){
                 ChoiceC.setText(c1);
             }else if(answer1 == 4){
                 ChoiceD.setText(c1);
             }
             if(answer2 == 1){
                 ChoiceA.setText(c2);
             }else if(answer2 == 2){
                 ChoiceB.setText(c2);
             }else if(answer2 == 3){
                 ChoiceC.setText(c2);
             }else if(answer2 == 4){
                 ChoiceD.setText(c2);
             }
             if(answer3 == 1){
                 ChoiceA.setText(c3);
             }else if(answer3 == 2){
                 ChoiceB.setText(c3);
             }else if(answer3 == 3){
                 ChoiceC.setText(c3);
             }else if(answer3 == 4){
                 ChoiceD.setText(c3);
             }
             if(answer4 == 1){
                 ChoiceA.setText(c4);
             }else if(answer4 == 2){
                 ChoiceB.setText(c4);
             }else if(answer4 == 3){
                 ChoiceC.setText(c4);
             }else if(answer4 == 4){
                 ChoiceD.setText(c4);
             }
             question += 1;
        }else{
             Choice1.setEnabled(false);
             Choice2.setEnabled(false);
             Choice3.setEnabled(false);
             Choice4.setEnabled(false);
             Next.setEnabled(false);
             ChoiceA.setText("");
             ChoiceB.setText("");
             ChoiceC.setText("");
             ChoiceD.setText("");
             Choice1.setActivated(false);
             Choice2.setActivated(false);
             Choice3.setActivated(false);
             Choice4.setActivated(false);
             Def.setText("Congratulations you scored " + score + "/" + "10");
             Def.append("To reattempt press Back.");
        }

    }


}

