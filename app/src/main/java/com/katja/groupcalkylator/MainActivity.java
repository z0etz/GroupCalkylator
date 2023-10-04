package com.katja.groupcalkylator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


// Ibrahim, Katja, Goran, Alex, Dennis
// Ja, visst är vi bara 5 i gruppen och inte 6?
//TestGoran

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
    }
}

