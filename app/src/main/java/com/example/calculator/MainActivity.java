package com.example.calculator;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonPlus, buttonMinus, buttonRazdel,
            buttonUmnoj, buttonTochka, buttonC, buttonRavno;
    EditText editText;
    float firstNum, secondNum;
    boolean plus, minus, umnoj, delit;

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
        buttonTochka = (Button) findViewById(R.id.buttonTochka);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonUmnoj = (Button) findViewById(R.id.buttonUmnoj);
        buttonRazdel = (Button) findViewById(R.id.buttonDelet);
        buttonC = (Button) findViewById(R.id.buttonAc);
        buttonRavno = (Button) findViewById(R.id.buttonRavno);
        editText = (EditText) findViewById(R.id.editText);


        button1.setOnClickListener(v -> editText.setText(editText.getText() + "1"));
        button2.setOnClickListener(v -> editText.setText(editText.getText() + "2"));
        button3.setOnClickListener(v -> editText.setText(editText.getText() + "3"));
        button4.setOnClickListener(v -> editText.setText(editText.getText() + "4"));
        button5.setOnClickListener(v -> editText.setText(editText.getText() + "5"));
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    firstNum = Float.parseFloat(editText.getText() + "");
                    plus = true;
                    editText.setText(null);
                }
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = Float.parseFloat(editText.getText() + "");
                minus = true;
                editText.setText(null);
            }
        });
        buttonUmnoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = Float.parseFloat(editText.getText() + "");
                umnoj = true;
                editText.setText(null);
            }
        });
        buttonRazdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNum = Float.parseFloat(editText.getText() + "");
                delit = true;
                editText.setText(null);
            }
        });
        buttonRavno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondNum = Float.parseFloat(editText.getText() + "");
                if (plus == true) {
                    editText.setText(firstNum + secondNum + "");
                    plus = false;
                }
                if (minus == true) {
                    editText.setText(firstNum - secondNum + "");
                    minus = false;
                }
                if (umnoj == true) {
                    editText.setText(firstNum * secondNum + "");
                    umnoj = false;
                }
                if (delit == true) {
                    editText.setText(firstNum / secondNum + "");
                    delit = false;
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
        buttonTochka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });
    }
}