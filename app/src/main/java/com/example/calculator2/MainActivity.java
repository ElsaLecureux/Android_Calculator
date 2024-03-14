package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private EditText input1;
    private EditText input2;

    private Double firstNumber;

    private Double secondNumber;

    private Boolean calculate;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1= (EditText) findViewById(R.id.input1);
        input2= (EditText) findViewById(R.id.input2);

}

    public Boolean settings (View view) {
        input1= (EditText) findViewById(R.id.input1);
        input2= (EditText) findViewById(R.id.input2);
        result = (TextView) findViewById(R.id.result);

        if(input1.getText().toString().equals(null) || input1.getText().toString().equals("")) {
            input1.setText("enter a number");
            return calculate = false;
        }
        else if (input2.getText().toString().equals(null) || input2.getText().toString().equals("")) {
            input2.setText("enter a number");
            return calculate = false;
        } else {
            String firstNumberString = input1.getText().toString();
            firstNumber = Double.parseDouble(firstNumberString);

            String secondNumberString = input2.getText().toString();
            secondNumber = Double.parseDouble(secondNumberString);

            return calculate = true;
        }

    }

    public void moveButtons() {
        button = (Button) findViewById(R.id.plus);
    }

    public void calculateSum(View view) {
        settings(view);
        if (calculate) {
            Double additionResult = firstNumber + secondNumber;

            result.setText(additionResult.toString());
        }
        else {

        }
    }

    public void calculateSubtraction(View view) {

        settings(view);
        if (calculate) {
            Double subtractionResult = firstNumber - secondNumber;

            result.setText(subtractionResult.toString());
        }
    }

    public void calculateMultiplication(View view) {

        settings(view);
        if (calculate) {
            Double multiplicationResult = firstNumber * secondNumber;

            result.setText(multiplicationResult.toString());
        }
    }

    public void calculateDivision(View view) {

        settings(view);
        if (calculate) {
            Double additionResult = firstNumber / secondNumber;

            result.setText(additionResult.toString());
        }
    }

    public void calculateModulo(View view) {

        settings(view);
        if (calculate) {
            Double additionResult = firstNumber % secondNumber;

            result.setText(additionResult.toString());
        }
    }

    public void calculatePower(View view) {

        settings(view);
        if (calculate) {
            Double additionResult = Math.pow(firstNumber, secondNumber);

            result.setText(additionResult.toString());
        }
    }


}