package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends Activity {


    MyTask mtask;
    @SuppressLint("StaticFieldLeak")
    static TextView txtv;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("qwe", "create MainActivity: " + this.hashCode());
        txtv = (TextView) findViewById(R.id.txtv);
        mtask = (MyTask) getLastNonConfigurationInstance();
        if (mtask == null) {

            mtask = new MyTask();

            mtask.execute();

        }else{
            mtask.link(this);
        }

        Log.d("qwe", "create MyTask: " + mtask.hashCode());
    }


    @Override
    public Object onRetainNonConfigurationInstance() {
        mtask.unLink();
        return mtask;
    }


    static class MyTask extends AsyncTask<String, Integer, Void> {
        @SuppressLint("StaticFieldLeak")
        MainActivity activity;
        void link(MainActivity act) {
            activity = act;
        }
        void unLink() {
            activity = null;
        }

        @Override
        protected Void doInBackground(String... params) {
            try {
                for (int i = 0; i <= 10; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    publishProgress(i);
                    Log.d("qwe", "i = " + i
                            + ", MyTask: " + this.hashCode()
                            + ", MainActivity: " + this.hashCode());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }
        @SuppressLint("SetTextI18n")
        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            MainActivity activity = (MainActivity) txtv.getContext();
            txtv.setText("i = " + values[0]);
        }

    }
}