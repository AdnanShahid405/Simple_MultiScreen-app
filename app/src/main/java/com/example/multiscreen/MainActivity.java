package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MSG = "com.example.MyApplication4.Order";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void placeorder(View view)
    {
        Intent intent=new Intent(this,Orderactivity.class);
        EditText editText=findViewById(R.id.editTextText);
        EditText editText1=findViewById(R.id.editTextText2);
        EditText editText2= findViewById(R.id.editTextText3);
        String message = editText.getText().toString() + "," + editText1.getText().toString() +"&"+ editText2.getText().toString();
        intent.putExtra(MSG,message);
        startActivity(intent);
    }
}