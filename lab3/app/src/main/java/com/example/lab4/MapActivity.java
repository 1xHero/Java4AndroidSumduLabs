package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MapActivity extends AppCompatActivity implements View.OnClickListener{

    Button bt00nMap;
    EditText editC00rd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        bt00nMap = (Button) findViewById(R.id.btnPhone);
        editC00rd = (EditText) findViewById(R.id.phoneNumber);
        bt00nMap.setOnClickListener((View.OnClickListener) this);
    }


    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:"+editC00rd.getText().toString()));
        startActivity(intent);
    }
}