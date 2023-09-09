package com.example.android_buoi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        Intent intent = getIntent();
//        String message = intent.getStringExtra("UserName");
//        int age = intent.getIntExtra("age", -1);
        UserModel userModel = (UserModel) intent.getSerializableExtra("UserModel");
        Toast.makeText(this, "" + userModel.toString(), Toast.LENGTH_SHORT).show();

    }
}