package com.maha.ascapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CommerceActivity extends AppCompatActivity {
    ImageButton menuBtn;
    Button busBtn,accBtn,ecoBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commerce);
        getSupportActionBar().hide();

        menuBtn = findViewById(R.id.menuBtn);
        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openMenu();
            }});

        busBtn = findViewById(R.id.buttonBus);
        busBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openTutor();
            }});

        accBtn = findViewById(R.id.buttonAcc);
        accBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openTutor();
            }});


        ecoBtn = findViewById(R.id.buttonEco);
        ecoBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openTutor();
            }});


    }
    public void openMenu(){
        Intent intent=new Intent(this,ProfileActivity.class);
        startActivity(intent);}

    public void openTutor(){
        Intent intent=new Intent(this, TutorDetailsActivity.class);
        startActivity(intent);}

}

