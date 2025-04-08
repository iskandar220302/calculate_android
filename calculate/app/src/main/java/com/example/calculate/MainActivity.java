package com.example.calculate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button plus, minus, multiply, division;
    private EditText num1, num2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        division = findViewById(R.id.division);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        result = findViewById(R.id.result);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float first_num = Float.parseFloat(num1.getText().toString());
                float second_num = Float.parseFloat(num2.getText().toString());
                float result_plus = first_num + second_num;
                result.setText(String.valueOf(result_plus));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float first_num = Float.parseFloat(num1.getText().toString());
                float second_num = Float.parseFloat(num2.getText().toString());
                float result_minus = first_num - second_num;
                result.setText(String.valueOf(result_minus));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float first_num = Float.parseFloat(num1.getText().toString());
                float second_num = Float.parseFloat(num2.getText().toString());
                float result_multiply = first_num * second_num;
                result.setText(String.valueOf(result_multiply));
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float first_num = Float.parseFloat(num1.getText().toString());
                float second_num = Float.parseFloat(num2.getText().toString());
                float result_plus = first_num + second_num;
                result.setText(String.valueOf(result_plus));
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float first_num = Float.parseFloat(num1.getText().toString());
                float second_num = Float.parseFloat(num2.getText().toString());
                float result_division = first_num / second_num;
                result.setText(String.valueOf(result_division));
            }
        });
    }

    public void newActivity(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}