package com.example.benvc.tipcalculator;
/**
 * Created by benvc on 2016-09-19.
 */

public class Calculate {
    int TypeMath = 0;
    String txtString = "NULL";
    public String doCalc(String num, String num2){
        /**
         * Math int Type:
         * 0 - None
         * 1 - Subtract
         * 2 - Add
         * 3 - Multiply
         * 4 - Divide
         */
        double Number1 = 0;
        double Number2;
        try {
            Number1 = Double.parseDouble(num);
            Number2 = Double.parseDouble(num2);
        }catch(Exception E){
            Number2 = 0;
        }



        if(TypeMath ==1){
            Number1 = Number1 - Number2;
            txtString = "" + Number1;
        }else if(TypeMath == 2){
            Number1 = Number1 + Number2;
            txtString = "" + Number1;
        }else if(TypeMath == 3){
            Number1 = Number1 * Number2;
            txtString = "" + Number1;
        }else if(TypeMath ==4){
            if(Number1 == 0 || Number2 == 0){
                txtString = "ERROR";
            }else {
                Number1 = Number1 / Number2;
                txtString = "" + Number1;
            }
        }



        return txtString;
    }
}
