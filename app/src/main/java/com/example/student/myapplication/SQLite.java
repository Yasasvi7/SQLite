package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Database.DBHandler;

public class SQLite extends AppCompatActivity {

    DBHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);
    }



}
