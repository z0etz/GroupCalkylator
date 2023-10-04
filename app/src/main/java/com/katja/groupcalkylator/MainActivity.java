package com.katja.groupcalkylator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.groupcalkylator.R;

// Ibrahim, Katja, Goran, Alex, Dennis
// Ja, visst är vi bara 5 i gruppen och inte 6?
//TestGoran

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
    }
}

