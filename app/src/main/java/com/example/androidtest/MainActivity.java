package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btt_login;
    private EditText et_name;
    private EditText et_psd;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_login);
        btt_login = findViewById(R.id.btt_login);
        et_name = findViewById(R.id.et_name);
        et_psd = findViewById(R.id.et_psd);
        btt_login.setOnClickListener(this);
        /*btt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                starActivity();
            }
        });*/

    }

    public void login() {
        String name = et_name.getText().toString();
        String psd = et_psd.getText().toString();
        if (TextUtils.isEmpty(name)) {
            Toast.makeText(context, "请输入用户名", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(psd)) {
            Toast.makeText(context, "请输入密码", Toast.LENGTH_SHORT).show();
            return;
        }

    }

    public void starActivity() {
        //跳转到一个目标activity
        Intent intent = new Intent(MainActivity.this, SetActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btt_login:
                login();
                break;
        }
    }
}
