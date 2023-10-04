package com.katja.groupcalkylator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


// Ibrahim, Katja, Goran, Alex, Dennis

public class MainActivity extends AppCompatActivity {

    EditText editText0, editText1;
    Button buttonPlus, buttonMinus, buttonMultiplication,
            buttonDivision, buttonRoot, buttonPercent, buttonPhytagoras, buttonCircleArea,
            buttonCylinderVolume;
    TextView textAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText0 = findViewById(R.id.editText0);
        editText1 = findViewById(R.id.editText1);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMultiplication = findViewById(R.id.buttonMultiplication);
        buttonDivision = findViewById(R.id.buttonDivision);
        buttonRoot = findViewById(R.id.buttonRoot);
        buttonPercent = findViewById(R.id.buttonPercent);
        buttonPhytagoras = findViewById(R.id.buttonPhytagoras);
        buttonCircleArea = findViewById(R.id.buttonCircleArea);
        buttonCylinderVolume = findViewById(R.id.buttonCylinderVolume);
        textAnswer = findViewById(R.id.textAnswer);

        // Set an OnClickListeners for Buttons
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check input, count and show answer when the button is clicked
                String sX = editText0.getText().toString();
                String sY = editText1.getText().toString();
                try {
                    float fX = Float.parseFloat(sX);
                    float fY = Float.parseFloat(sY);
                    float fSvar = fX + fY;
                    textAnswer.setText(String.valueOf(fSvar));
                }
                catch (NumberFormatException e) {
                    String error = getString(R.string.error);
                    textAnswer.setText(error);
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check input, count and show answer when the button is clicked
                String sX = editText0.getText().toString();
                String sY = editText1.getText().toString();
                try {
                    float fX = Float.parseFloat(sX);
                    float fY = Float.parseFloat(sY);
                    float fSvar = fX - fY;
                    textAnswer.setText(String.valueOf(fSvar));
                }
                catch (NumberFormatException e) {
                    String error = getString(R.string.error);
                    textAnswer.setText(error);
                }
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check input, count and show answer when the button is clicked
                String sX = editText0.getText().toString();
                String sY = editText1.getText().toString();
                try {
                    float fX = Float.parseFloat(sX);
                    float fY = Float.parseFloat(sY);
                    float fSvar = fX * fY;
                    textAnswer.setText(String.valueOf(fSvar));
                }
                catch (NumberFormatException e) {
                    String error = getString(R.string.error);
                    textAnswer.setText(error);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check input, count and show answer when the button is clicked
                String sX = editText0.getText().toString();
                String sY = editText1.getText().toString();
                try {
                    float fX = Float.parseFloat(sX);
                    float fY = Float.parseFloat(sY);
                    float fSvar = fX / fY;
                    textAnswer.setText(String.valueOf(fSvar));
                }
                catch (NumberFormatException e) {
                    String error = getString(R.string.error);
                    textAnswer.setText(error);
                }
            }
        });

        buttonRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check input, count and show answer when the button is clicked
                String sX = editText0.getText().toString();
                try {
                    float fX = Float.parseFloat(sX);
                    float fSvar = 100; //Byt ut 100 mot uträkning här
                    textAnswer.setText(String.valueOf(fSvar));
                }
                catch (NumberFormatException e) {
                    String error = getString(R.string.error);
                    textAnswer.setText(error);
                }
            }
        });

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check input, count and show answer when the button is clicked
                String sX = editText0.getText().toString();
                String sY = editText1.getText().toString();
                try {
                    float fX = Float.parseFloat(sX);
                    float fY = Float.parseFloat(sY);
                    float fSvar = 100; //Byt ut 100 mot uträkning här
                    textAnswer.setText(String.valueOf(fSvar));
                }
                catch (NumberFormatException e) {
                    String error = getString(R.string.error);
                    textAnswer.setText(error);
                }
            }
        });

        buttonPhytagoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check input, count and show answer when the button is clicked
                String sX = editText0.getText().toString();
                String sY = editText1.getText().toString();
                try {
                    float fX = Float.parseFloat(sX);
                    float fY = Float.parseFloat(sY);
                    float fSvar = 100; //Byt ut 100 mot uträkning här
                    textAnswer.setText(String.valueOf(fSvar));
                }
                catch (NumberFormatException e) {
                    String error = getString(R.string.error);
                    textAnswer.setText(error);
                }
            }
        });

        buttonCircleArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check input, count and show answer when the button is clicked
                String sX = editText0.getText().toString();
                try {
                    float fX = Float.parseFloat(sX);
                    float fSvar = 100; //Byt ut 100 mot uträkning här
                    textAnswer.setText(String.valueOf(fSvar));
                }
                catch (NumberFormatException e) {
                    String error = getString(R.string.error);
                    textAnswer.setText(error);
                }
            }
        });

        buttonCylinderVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check input, count and show answer when the button is clicked
                String sX = editText0.getText().toString();
                String sY = editText1.getText().toString();
                try {
                    float fX = Float.parseFloat(sX);
                    float fY = Float.parseFloat(sY);
                    float fSvar = 100; //Byt ut 100 mot uträkning här
                    textAnswer.setText(String.valueOf(fSvar));
                }
                catch (NumberFormatException e) {
                    String error = getString(R.string.error);
                    textAnswer.setText(error);
                }
            }
        });


    }
}

