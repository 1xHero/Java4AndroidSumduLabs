package com.example.lab1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BeerExpert extends AppCompatActivity {

    private String beerColor;
    private int beerIndex;

    public void setBeerColor(String beerColor) {
        this.beerColor = beerColor;
    }

    private int getBeerIndexByColor(){
        String beerType = this.beerColor;

        if (beerType.equals("light")){
            this.beerIndex = 0;
        } else if (beerType.equals("amber")){
            this.beerIndex = 1;
        }else if (beerType.equals("brown")){
            this.beerIndex = 2;
        }else if (beerType.equals("dark")){
            this.beerIndex = 3;
        }
        return this.beerIndex;
    }

    public String giveBeerAdviser(){

        String[] beers = {"Lvivske 1715", "FAX", "Kozel Cherny","Dunkel"};

        String msg = "You should to try, " + beers[
                this.getBeerIndexByColor()
                ];
        return msg;

    }
}
