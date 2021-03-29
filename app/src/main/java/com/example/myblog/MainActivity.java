package com.example.myblog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  EditText number1;
    private  EditText number2;
    private  Button calculate_result;
    private  TextView showresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=findViewById(R.id.num1);
        number2=findViewById(R.id.num2);
        calculate_result=findViewById(R.id.calculate);
        showresult=findViewById(R.id.resultView);
        calculate_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int digit1=Integer.parseInt(number1.getText().toString());
                int digit2=Integer.parseInt(number2.getText().toString());
                String sum="Sum is :"+String.valueOf(digit1+digit2);
                Toast.makeText(getApplicationContext(),sum,Toast.LENGTH_SHORT).show();
                showresult.setText(sum);
            }
        });
    }

    public void openActivity(View view){
        Toast.makeText(getApplicationContext(),"This is a toast message",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(getApplicationContext(),Details.class);
        intent.putExtra("my_message", "Chandra Prakash Pal");
        startActivity(intent);
    }
}