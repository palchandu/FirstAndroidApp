package com.example.myblog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    private TextView msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        msg=findViewById(R.id.textView);
        Intent intent=getIntent();
        String message=intent.getStringExtra("my_message");
        msg.setText(message);
    }
}