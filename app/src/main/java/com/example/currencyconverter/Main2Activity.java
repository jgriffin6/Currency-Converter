package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.text.DecimalFormat;

public class Main2Activity extends AppCompatActivity {

    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView3 = (TextView) findViewById(R.id.textView3);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        double dollars = Double.valueOf(str).doubleValue();
        double pounds = dollars * 0.77;
        DecimalFormat df = new DecimalFormat("#.##");
        textView3.setText("£" +  df.format(pounds));
    }
}
