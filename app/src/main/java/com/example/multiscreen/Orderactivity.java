package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Orderactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderactivity);
        Intent intent=getIntent();
        String message= intent.getStringExtra(MainActivity.MSG);
        TextView textView=findViewById(R.id.textView2);
        textView.setText(message);

    }
    public void clickme(View view)
    {
        Intent intent2=new Intent(this,MainActivity.class);
        startActivity(intent2);
    }
}