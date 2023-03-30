package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button processBeerBtn = (Button) findViewById(R.id.process_beer);
        processBeerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BeerExpert expert = new BeerExpert();

                Spinner beerColor = (Spinner) findViewById(R.id.beer_types);
                expert.setBeerColor(
                        beerColor.getSelectedItem().toString()
                );



                TextView outBeer = (TextView) findViewById(R.id.text_outer);

                outBeer.setText(
                        expert.giveBeerAdviser()
                );

            }
        });

    }
}