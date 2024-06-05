package com.example.rejectgreaterthanten;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText T1 = (EditText) findViewById(R.id.num1);
        EditText T2 = (EditText) findViewById(R.id.num2);
        TextView Result = (TextView) findViewById(R.id.textView2);
        Button B1 = (Button) findViewById(R.id.btn);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1, num2;
                num1 = Integer.parseInt(T1.getText().toString().trim());
                num2 = Integer.parseInt(T2.getText().toString().trim());
                if (num1 < 10 || num2 < 10) {
                    Result.setText("Given number is " + num1+" and "+num2);

                } else {
                    Result.setText("Number is rejected please enter a new numbers ");

                }
            }
        });
    }
}