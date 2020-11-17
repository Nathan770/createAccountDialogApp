package com.example.createaccountdialogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nathan.createaccountlibrary.CreateAccount;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreateAccount createAccount = new CreateAccount(this);
        createAccount.show();
    }
}