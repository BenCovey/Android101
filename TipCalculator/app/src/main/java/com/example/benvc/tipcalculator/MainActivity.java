package com.example.benvc.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.*;
import android.view.View.OnClickListener;




public class MainActivity extends AppCompatActivity {
    Calculate Calcobj = new Calculate();
    //Buttons
    Button btnZero;
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnCE;
    Button btnPlusMinus;
    Button btnPeriod;
    Button btnBack;
    Button btnAdd;
    Button btnMinus;
    Button btnDivide;
    Button btnMultiply;
    Button btnCalc;
    //Text View
    TextView txtOutput;
    //Variables for Digits
    String rephrase = "0"; //Meant solely for use of backspace. Is to check to make sure string has a value
    String strNumber = "0";
    String strFirstNum = null;
    String strSecondNum = null;
    Integer intMathType;//Using Integer to point to the type of math being done (i.e Addition, Multiplication, Division... etc)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCalc = (Button) findViewById(R.id.btnEquals);
        btnPeriod = (Button) findViewById(R.id.btnPeriod);
        btnZero = (Button) findViewById(R.id.btn0);
        btnOne = (Button) findViewById(R.id.btn1);
        btnTwo = (Button) findViewById(R.id.btn2);
        btnThree = (Button) findViewById(R.id.btn3);
        btnFour = (Button) findViewById(R.id.btn4);
        btnFive = (Button) findViewById(R.id.btn5);
        btnSix = (Button) findViewById(R.id.btn6);
        btnSeven = (Button) findViewById(R.id.btn7);
        btnEight = (Button) findViewById(R.id.btn8);
        btnNine = (Button) findViewById(R.id.btn9);
        btnCE = (Button) findViewById(R.id.btnAC);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        txtOutput = (TextView) findViewById(R.id.txtScreen);
        btnPlusMinus = (Button) findViewById(R.id.btnPlusminus);
        btnBack = (Button) findViewById(R.id.btnBack);

        final OnClickListener oclCalc = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strFirstNum != null){
                    strSecondNum = strNumber.replace(strFirstNum + " ", "");
                    strSecondNum = strSecondNum.replace("-", "");
                    strSecondNum = strSecondNum.replace("+", "");
                    strSecondNum = strSecondNum.replace("÷", "");
                    strSecondNum = strSecondNum.replace("x", "");
                    strNumber = "" + Calcobj.doCalc(strFirstNum, strSecondNum);
                    txtOutput.setText(strNumber);
                    strFirstNum = strNumber;
                    strSecondNum = null;
                }
            }
        };

        OnClickListener oclMinus = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strFirstNum == null && strSecondNum == null){
                    strFirstNum = strNumber;
                    Calcobj.TypeMath = 1;
                    strNumber = strNumber + " - ";
                    txtOutput.setText(strNumber);
                    if(strNumber.contains("+")){
                        strSecondNum = strNumber.replace(strFirstNum + " + ", "");}
                    if(strNumber.contains("-")){
                        strSecondNum = strNumber.replace(strFirstNum + " - ", "");}
                    if(strNumber.contains("÷")){
                        strSecondNum = strNumber.replace(strFirstNum + " ÷ ", "");}
                    if(strNumber.contains("x")){
                        strSecondNum = strNumber.replace(strFirstNum + " x ", "");}
                    txtOutput.setText(strNumber);
                    if(strSecondNum.equals("")){
                        strSecondNum = null;
                    }
                }else if (strSecondNum == null){
                    if(strNumber.contains("+")){
                        strSecondNum = strNumber.replace(strFirstNum + " + ", "");}
                    if(strNumber.contains("-")){
                        strSecondNum = strNumber.replace(strFirstNum + " - ", "");}
                    if(strNumber.contains("÷")){
                        strSecondNum = strNumber.replace(strFirstNum + " ÷ ", "");}
                    if(strNumber.contains("x")){
                        strSecondNum = strNumber.replace(strFirstNum + " x ", "");}
                    txtOutput.setText(strNumber);
                }else{
                    try{
                        strNumber = "" + Calcobj.doCalc(strFirstNum, strSecondNum);
                        strFirstNum = strNumber;
                        Calcobj.TypeMath = 1;
                        strNumber = strNumber + " - ";
                        txtOutput.setText(strNumber);
                        strSecondNum = null;
                    }catch(Exception e){
                        strFirstNum = null;
                        strSecondNum = null;
                        strNumber = "0";
                        txtOutput.setText(strNumber);
                    }
                }

            }
        };

        OnClickListener oclAdd = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strFirstNum == null && strSecondNum == null){
                    strFirstNum = strNumber;
                    Calcobj.TypeMath = 2;
                    strNumber = strNumber + " + ";
                    txtOutput.setText(strNumber);
                    if(strNumber.contains("+")){
                        strSecondNum = strNumber.replace(strFirstNum + " + ", "");}
                    if(strNumber.contains("-")){
                        strSecondNum = strNumber.replace(strFirstNum + " - ", "");}
                    if(strNumber.contains("÷")){
                        strSecondNum = strNumber.replace(strFirstNum + " ÷ ", "");}
                    if(strNumber.contains("x")){
                        strSecondNum = strNumber.replace(strFirstNum + " x ", "");}
                    txtOutput.setText(strNumber);
                    if(strSecondNum.equals("")){
                        strSecondNum = null;
                    }
                }else if (strSecondNum == null){
                    if(strNumber.contains("+")){
                    strSecondNum = strNumber.replace(strFirstNum + " + ", "");}
                    if(strNumber.contains("-")){
                    strSecondNum = strNumber.replace(strFirstNum + " - ", "");}
                    if(strNumber.contains("÷")){
                    strSecondNum = strNumber.replace(strFirstNum + " ÷ ", "");}
                    if(strNumber.contains("x")){
                    strSecondNum = strNumber.replace(strFirstNum + " x ", "");}
                    txtOutput.setText(strNumber);
                }else{
                    try{
                        strNumber = "" + Calcobj.doCalc(strFirstNum, strSecondNum);
                        strFirstNum = strNumber;
                        Calcobj.TypeMath = 2;
                        strNumber = strNumber + " + ";
                        txtOutput.setText(strNumber);
                        strSecondNum = null;
                    }catch(Exception e){
                        strFirstNum = null;
                        strSecondNum = null;
                        strNumber = "0";
                        txtOutput.setText(strNumber);
                    }
                }

            }
        };

        OnClickListener oclMultiply = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strFirstNum == null && strSecondNum == null){
                    strFirstNum = strNumber;
                    Calcobj.TypeMath = 3;
                    strNumber = strNumber + " x ";
                    txtOutput.setText(strNumber);
                    if(strNumber.contains("+")){
                        strSecondNum = strNumber.replace(strFirstNum + " + ", "");}
                    if(strNumber.contains("-")){
                        strSecondNum = strNumber.replace(strFirstNum + " - ", "");}
                    if(strNumber.contains("÷")){
                        strSecondNum = strNumber.replace(strFirstNum + " ÷ ", "");}
                    if(strNumber.contains("x")){
                        strSecondNum = strNumber.replace(strFirstNum + " x ", "");}
                    txtOutput.setText(strNumber);
                    if(strSecondNum.equals("")){
                        strSecondNum = null;
                    }
                }else if (strSecondNum == null){
                    strSecondNum = strNumber.replace(strFirstNum + " + ", "");
                    strSecondNum = strNumber.replace(strFirstNum + " - ", "");
                    strSecondNum = strNumber.replace(strFirstNum + " ÷ ", "");
                    strSecondNum = strNumber.replace(strFirstNum + " x ", "");
                    strSecondNum = strSecondNum.replace("x","");
                    txtOutput.setText(strNumber);
                }else{
                    try{
                        strNumber = "" + Calcobj.doCalc(strFirstNum, strSecondNum);
                        strFirstNum = strNumber;
                        Calcobj.TypeMath = 3;
                        strNumber = strNumber + " x ";
                        txtOutput.setText(strNumber);
                        strSecondNum = null;
                    }catch(Exception e){
                        strFirstNum = null;
                        strSecondNum = null;
                        strNumber = "0";
                        txtOutput.setText(strNumber);
                    }
                }

            }
        };


        OnClickListener oclDivide = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strFirstNum == null && strSecondNum == null){
                    strFirstNum = strNumber;
                    Calcobj.TypeMath = 4;
                    strNumber = strNumber + " ÷ ";
                    txtOutput.setText(strNumber);
                    if(strNumber.contains("+")){
                        strSecondNum = strNumber.replace(strFirstNum + " + ", "");}
                    if(strNumber.contains("-")){
                        strSecondNum = strNumber.replace(strFirstNum + " - ", "");}
                    if(strNumber.contains("÷")){
                        strSecondNum = strNumber.replace(strFirstNum + " ÷ ", "");}
                    if(strNumber.contains("x")){
                        strSecondNum = strNumber.replace(strFirstNum + " x ", "");}
                    txtOutput.setText(strNumber);
                    if(strSecondNum.equals("")){
                        strSecondNum = null;
                    }
                }else if (strSecondNum == null){
                    if(strNumber.contains("+")){
                        strSecondNum = strNumber.replace(strFirstNum + " + ", "");}
                    if(strNumber.contains("-")){
                        strSecondNum = strNumber.replace(strFirstNum + " - ", "");}
                    if(strNumber.contains("÷")){
                        strSecondNum = strNumber.replace(strFirstNum + " ÷ ", "");}
                    if(strNumber.contains("x")){
                        strSecondNum = strNumber.replace(strFirstNum + " x ", "");}
                    txtOutput.setText(strNumber);
                }else{
                    try{
                        strNumber = "" + Calcobj.doCalc(strFirstNum, strSecondNum);
                        strFirstNum = strNumber;
                        Calcobj.TypeMath = 4;
                        strNumber = strNumber + " ÷ ";
                        txtOutput.setText(strNumber);
                        strSecondNum = null;
                    }catch(Exception e){
                        strFirstNum = null;
                        strSecondNum = null;
                        strNumber = "0";
                        txtOutput.setText(strNumber);
                    }
                }

            }
        };


        OnClickListener oclPlusMinus = new OnClickListener() {
            @Override
            public void onClick(View v) {
            if(strNumber.startsWith("-")){
                strNumber = strNumber.substring(1);
                txtOutput.setText(strNumber);
            }else {
                strNumber = "-" + strNumber;
                txtOutput.setText(strNumber);
            }
            }
        };
        OnClickListener oclPeriod = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!strNumber.contains(".")){
                    strNumber = strNumber + ".";
                    txtOutput.setText(strNumber);
                }
            }
        };
        OnClickListener oclBack = new OnClickListener(){
            @Override
            public void onClick(View v) {
                if (strNumber != null && strNumber.length() > 1) {
                    rephrase = strNumber.substring(0, strNumber.length() - 1);
                    strNumber = rephrase;
                    txtOutput.setText(strNumber);

                    if(!strNumber.contains("-")||!strNumber.contains("+")||!strNumber.contains("÷")||!strNumber.contains("x")){
                        intMathType = 0;
                        strFirstNum = null;
                        strSecondNum = null;
                    }

                }else{
                    strNumber = "0";
                    txtOutput.setText(strNumber);
                    strFirstNum = null;
                    intMathType = 0;
                }
            }

        };
        OnClickListener oclClear = new OnClickListener() {
            @Override
            public void onClick(View v) {
                strNumber = "0";
                strFirstNum = null;
                strSecondNum = null;
                Calcobj.TypeMath = 0;
                txtOutput.setText(strNumber);
            }
        };

        OnClickListener oclZero = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strNumber.equals("0") || strNumber.equals("0.0") ) {
                    strNumber = "0";
                    txtOutput.setText(strNumber);
                }else if(strNumber.contains("ERROR")){
                    strNumber = "0";
                    strFirstNum = null;
                    strSecondNum = null;
                    txtOutput.setText(strNumber);
                }else{
                    strNumber += "0";
                    txtOutput.setText(strNumber);
                }
            }
        };
        OnClickListener oclOne = new OnClickListener() {
            @Override

            public void onClick(View v) {
                if(strNumber.equals("0") || strNumber.equals("0.0") ) {
                    strNumber = "1";
                    txtOutput.setText(strNumber);
                }else if(strNumber.contains("ERROR")){
                    strNumber = "1";
                    strFirstNum = null;
                    strSecondNum = null;
                    txtOutput.setText(strNumber);
                }else{
                    strNumber = strNumber + "1";
                    txtOutput.setText(strNumber);
                }
            }
        };
        OnClickListener oclTwo = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strNumber.equals("0") || strNumber.equals("0.0") ) {
                    strNumber = "2";
                    txtOutput.setText(strNumber);
                }else if(strNumber.contains("ERROR")){
                    strNumber = "2";
                    strFirstNum = null;
                    strSecondNum = null;
                    txtOutput.setText(strNumber);
                }else{
                    strNumber += "2";
                    txtOutput.setText(strNumber);
                }
            }
        };
        OnClickListener oclThree = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strNumber.equals("0") || strNumber.equals("0.0") ) {
                    strNumber = "3";
                    txtOutput.setText(strNumber);
                }else if(strNumber.contains("ERROR")){
                    strNumber = "3";
                    strFirstNum = null;
                    strSecondNum = null;
                    txtOutput.setText(strNumber);
                }else{
                    strNumber += "3";
                    txtOutput.setText(strNumber);
                }
            }

        };
        OnClickListener oclFour = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strNumber.equals("0") || strNumber.equals("0.0") ) {
                    strNumber = "4";
                    txtOutput.setText(strNumber);
                }else if(strNumber.contains("ERROR")){
                    strNumber = "4";
                    strFirstNum = null;
                    strSecondNum = null;
                    txtOutput.setText(strNumber);
                }else{
                    strNumber += "4";
                    txtOutput.setText(strNumber);
                }
            }

        };
        OnClickListener oclFive = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strNumber.equals("0") || strNumber.equals("0.0") ) {
                    strNumber = "5";
                    txtOutput.setText(strNumber);
                }else if(strNumber.contains("ERROR")){
                    strNumber = "5";
                    strFirstNum = null;
                    strSecondNum = null;
                    txtOutput.setText(strNumber);
                }else{
                    strNumber += "5";
                    txtOutput.setText(strNumber);
                }
            }

        };
        OnClickListener oclSix = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strNumber.equals("0") || strNumber.equals("0.0") ) {
                    strNumber = "6";
                    txtOutput.setText(strNumber);
                }else if(strNumber.contains("ERROR")){
                    strNumber = "6";
                    strFirstNum = null;
                    strSecondNum = null;
                    txtOutput.setText(strNumber);
                }else{
                    strNumber += "6";
                    txtOutput.setText(strNumber);
                }
            }

        };
        OnClickListener oclSeven = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strNumber.equals("0") || strNumber.equals("0.0") ) {
                    strNumber = "7";
                    txtOutput.setText(strNumber);
                }else if(strNumber.contains("ERROR")){
                    strNumber = "7";
                    strFirstNum = null;
                    strSecondNum = null;
                    txtOutput.setText(strNumber);
                }else{
                    strNumber += "7";
                    txtOutput.setText(strNumber);
                }
            }

        };
        OnClickListener oclEight = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strNumber.equals("0") || strNumber.equals("0.0") ) {
                    strNumber = "8";
                    txtOutput.setText(strNumber);
                }else if(strNumber.contains("ERROR")){
                    strNumber = "8";
                    strFirstNum = null;
                    strSecondNum = null;
                    txtOutput.setText(strNumber);
                }else{
                    strNumber += "8";
                    txtOutput.setText(strNumber);
                }
            }

        };
        OnClickListener oclNine = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(strNumber.equals("0") || strNumber.equals("0.0") ) {
                    strNumber = "9";
                    txtOutput.setText(strNumber);
                }else if(strNumber.contains("ERROR")){
                    strNumber = "9";
                    strFirstNum = null;
                    strSecondNum = null;
                    txtOutput.setText(strNumber);
                }else{
                    strNumber += "9";
                    txtOutput.setText(strNumber);
                }
            }

        };
        btnCalc.setOnClickListener(oclCalc);
        btnBack.setOnClickListener(oclBack);
        btnPlusMinus.setOnClickListener(oclPlusMinus);
        btnCE.setOnClickListener(oclClear);
        btnZero.setOnClickListener(oclZero);
        btnOne.setOnClickListener(oclOne);
        btnTwo.setOnClickListener(oclTwo);
        btnThree.setOnClickListener(oclThree);
        btnFour.setOnClickListener(oclFour);
        btnFive.setOnClickListener(oclFive);
        btnSix.setOnClickListener(oclSix);
        btnSeven.setOnClickListener(oclSeven);
        btnEight.setOnClickListener(oclEight);
        btnNine.setOnClickListener(oclNine);
        btnPeriod.setOnClickListener(oclPeriod);
        btnMinus.setOnClickListener(oclMinus);
        btnAdd.setOnClickListener(oclAdd);
        btnDivide.setOnClickListener(oclDivide);
        btnMultiply.setOnClickListener(oclMultiply);
        }

}
