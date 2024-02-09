package com.maha.ascapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TechnologyActivity extends AppCompatActivity {

    ImageButton menuBtn;
    Button etecBtn,btecBtn,sftBtn,ictBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology);
        getSupportActionBar().hide();

        menuBtn = findViewById(R.id.menuBtn);
        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openMenu();
            }});

        etecBtn = findViewById(R.id.buttonEtech);
        etecBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openTutor();
            }});

        btecBtn = findViewById(R.id.buttonBtec);
        btecBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openTutor();
            }});


        sftBtn = findViewById(R.id.buttonSft);
        sftBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openTutor();
            }});


        ictBtn = findViewById(R.id.buttonIct);
        ictBtn.setOnClickListener(new View.OnClickListener() {
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

