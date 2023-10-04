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
                    float fSvar = (float) Math.sqrt (fX);
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
                    float fSvar = (float) (fX * 0.01 * fY);
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
                    float fSvar = (float) Math.sqrt (fX * fX + fY * fY);
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
                    float fSvar =  (float) (Math.PI * (fX/2) * (fX/2));
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
                    float fSvar = (float) (Math.PI * (fX/2)* (fX/2) * fY);
                    textAnswer.setText(String.valueOf(fSvar));
                }
                catch (NumberFormatException e) {
                    String error = getString(R.string.error);
                    textAnswer.setText(error);
                }
            }
        });
    //    private void calculate() {
        //       String input1Str = editText0.getText().toString();
        //      String input2Str = editText1.getText().toString();

        //        if (input1Str.isEmpty() || input2Str.isEmpty()) {
        //          textAnswer.setText("Fyll i båda fälten.");
        //         return;
        //      }

        //    try {
        //      double input1 = Double.parseDouble(input1Str);
        //        double input2 = Double.parseDouble(input2Str);
        //       double result = 0;

        //       String operator = operatorSpinner.getSelectedItem().toString(); // Lägg till en spinner för att välja operation

        //      switch (operator) {
        //          case "Addition":
        //              result = input1 + input2;
        //              break;
        //          case "Subtraktion":
        //              result = input1 - input2;
        //             break;
        //         case "Division":
        //            if (input2 != 0) {
        //              result = input1 / input2;
        //             } else {
        //                textAnswer.setText("Kan inte dividera med noll.");
        //              return;
                        }
    //         break;
    //        case "multiplication":
    //         result = input1 * input2;
    //          break;
    //     case "root":
    //           if (input2 >= 0) {
    //                result = Math.sqrt(input2);
    //             } else {
        //                textAnswer.setText("Kan inte ta roten ur ett negativt tal.");
    //                return;
    //             }
//              break;
    //            case "Procent":
                            //               result = (input1 * input2) / 100;
    //              break;
    //          case "Pythagoras sats":
    //                 result = Math.sqrt((input1 * input1) + (input2 * input2));
    //                  break;
    //              case "Cirkelns area":
    //                  result = Math.PI * input1 * input1;
    //                  break;
    //              case "Cylinderns volym":
    //                  result = Math.PI * input1 * input1 * input2;
    //                  break;
    //              default:
    //                   textAnswer.setText("Ogiltig operation vald.");
    //                  return;
                }

                // Visa resultatet
//       textAnswer.setText("Resultat: " + result);
//      } catch (NumberFormatException e) {
//          textAnswer.setText("Felaktig inmatning. Ange giltiga nummer.");
//           }
//       }

//   }


//}




// }
//}

