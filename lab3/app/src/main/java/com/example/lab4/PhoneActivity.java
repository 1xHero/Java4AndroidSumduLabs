package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhoneActivity extends AppCompatActivity implements View.OnClickListener{


    Button bt00nMap;
    EditText phoneNumberBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone);

        bt00nMap = (Button) findViewById(R.id.btnPhone);
        phoneNumberBox = (EditText) findViewById(R.id.phoneNumber);
        bt00nMap.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumberBox.getText().toString()));
        startActivity(intent);
    }
}