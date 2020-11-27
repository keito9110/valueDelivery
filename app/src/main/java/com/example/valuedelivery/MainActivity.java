package com.example.valuedelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
    public void btnInput(View view) {
        EditText inname = (EditText)findViewById(R.id.extinput);
        Intent intent = new Intent(MainActivity.this,Secondactivity.class);
        String msg = inname.getText().toString();
        if(!msg.equals("")){
            intent.putExtra("msg",msg);
        }
        startActivity(intent);
    }


}
