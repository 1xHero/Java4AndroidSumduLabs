package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onSendMessage(View view) {
        EditText msgBox = (EditText) findViewById(R.id.msgBox);
        String messageText = msgBox.getText().toString();
        Intent intent = new Intent(this, ReciveMessage.class);
        intent.putExtra("msg", messageText);
        startActivity(intent);
    }
}