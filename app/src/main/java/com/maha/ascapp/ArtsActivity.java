package com.maha.ascapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ArtsActivity extends AppCompatActivity {
    ImageButton menuBtn;
    Button geoBtn,polBtn,tamBtn,agrBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts);
        getSupportActionBar().hide();

        menuBtn = findViewById(R.id.menuBtn);
        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openMenu();
            }});

        geoBtn = findViewById(R.id.buttonGeo);
        geoBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openTutor();
            }});

        polBtn = findViewById(R.id.buttonPsci);
        polBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openTutor();
            }});


        tamBtn = findViewById(R.id.buttonTam);
        tamBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openTutor();
            }});


        agrBtn = findViewById(R.id.buttonAgri);
        agrBtn.setOnClickListener(new View.OnClickListener() {
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

