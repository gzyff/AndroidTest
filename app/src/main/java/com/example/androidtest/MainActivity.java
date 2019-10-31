package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Entity;

public class MainActivity extends AppCompatActivity {
    private Button btt_login;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btt_login = findViewById(R.id.btt_login);
        btt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                starActivity();
            }
        });

    }

    public void starActivity(){
        //跳转到一个目标activity
        Intent intent = new Intent(MainActivity.this,SetActivity.class);
        startActivity(intent);
    }

}
