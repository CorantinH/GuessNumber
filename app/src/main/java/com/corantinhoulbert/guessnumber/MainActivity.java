package com.corantinhoulbert.guessnumber;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
        Button button0;
        Button button1;
        Button button2;
        Button button3;
        Button button4;
        Button button5;
        Button button6;
        Button button7;
        Button button8;
        Button button9;
        TextView textInsert;
        TextView textResult;
        int Aleat;
        private boolean maj = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button0 = (Button) findViewById(R.id.button0);
         button1 = (Button) findViewById(R.id.button1);
         button2 = (Button) findViewById(R.id.button2);
         button3 = (Button) findViewById(R.id.button3);
         button4 = (Button) findViewById(R.id.button4);
         button5 = (Button) findViewById(R.id.button5);
         button6 = (Button) findViewById(R.id.button6);
         button7 = (Button) findViewById(R.id.button7);
         button8 = (Button) findViewById(R.id.button8);
         button9 = (Button) findViewById(R.id.button9);
         textInsert = (TextView) findViewById(R.id.textInsert);
         textResult = (TextView) findViewById(R.id.textResult);

         Aleat =  (int) (Math.random() * 100);
         textInsert.setText("" + Aleat);

         button0.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    chiffreclick("0");
                    if (textInsert.getText().toString().length() > 2) {
                textInsert.setText("");
                textResult.setText("");
            }
                }
            });

         button1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    chiffreclick("1");
                    if (textInsert.getText().toString().length() > 2) {
                textInsert.setText("");
                textResult.setText("");
            }
                }
            });

         button2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    chiffreclick("2");
                    if (textInsert.getText().toString().length() > 2) {
                textInsert.setText("");
                textResult.setText("");
            }
                }
            });

         button3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    chiffreclick("3");
                    if (textInsert.getText().toString().length() > 2) {
                textInsert.setText("");
                textResult.setText("");
            }
                }
            });

         button4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    chiffreclick("4");
                    if (textInsert.getText().toString().length() > 2) {
                textInsert.setText("");
                textResult.setText("");
            }
                }
            });

         button5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    chiffreclick("5");
                    if (textInsert.getText().toString().length() > 2) {
                textInsert.setText("");
                textResult.setText("");
            }
                }
            });

         button6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    chiffreclick("6");
                    if (textInsert.getText().toString().length() > 2) {
                textInsert.setText("");
                textResult.setText("");
            }
                }
            });

         button7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    chiffreclick("7");
                    if (textInsert.getText().toString().length() > 2) {
                textInsert.setText("");
                textResult.setText("");
            }
                }
            });

         button8.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    chiffreclick("8");
                     if (textInsert.getText().toString().length() > 2) {
                textInsert.setText("");
                textResult.setText("");
            }
                }
            });

         button9.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    chiffreclick("9");
                    if (textInsert.getText().toString().length() > 2) {
                textInsert.setText("");
                textResult.setText("");
            }
                }
            });



         }



         public void chiffreclick(String str) {
            if(maj){
                maj = false;
            }else{
                if(!textInsert.getText().equals("0")  )
                    str = textInsert.getText() + str;

            }
            textInsert.setText(str);

            if (Integer.parseInt(textInsert.getText().toString()) > Aleat){
            textResult.setText("-" + str);
            }

             if (Integer.parseInt(textInsert.getText().toString()) < Aleat){
            textResult.setText("+" + str);
            }

            if (Integer.parseInt(textInsert.getText().toString())  == Aleat){
            textResult.setText("BRAVO");
            Aleat =  (int) (Math.random() * 100);
            }
            }
        }
