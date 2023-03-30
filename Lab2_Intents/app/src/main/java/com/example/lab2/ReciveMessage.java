package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ReciveMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitvity_rcv_msg);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        System.out.println(msg);
        TextView msgBox = (TextView) findViewById(R.id.resciveMsgBox);
        msgBox.setText(msg);
    }





}