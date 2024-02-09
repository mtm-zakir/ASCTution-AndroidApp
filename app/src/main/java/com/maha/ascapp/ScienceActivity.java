package com.maha.ascapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ScienceActivity extends AppCompatActivity {

    ImageButton menuBtn;
    Button matBtn,chemBtn,phyBtn,bioBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        getSupportActionBar().hide();

        menuBtn = findViewById(R.id.menuBtn);
        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openMenu();
            }});

        matBtn = findViewById(R.id.buttonMaths);
        matBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openTutor();
            }});

        chemBtn = findViewById(R.id.buttonChemistry);
        chemBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openTutor();
            }});


        phyBtn = findViewById(R.id.buttonPhysics);
        phyBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openTutor();
            }});


        bioBtn = findViewById(R.id.buttonBiology);
        bioBtn.setOnClickListener(new View.OnClickListener() {
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

