package com.example.valuedelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        TextView tvOutput = (TextView)findViewById(R.id.txtoutput);

        Intent rintent = getIntent();

        String msg = rintent.getStringExtra("msg");
        tvOutput.setText(msg);
    }
}
