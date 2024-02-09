package com.maha.ascapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DashboardActivity extends AppCompatActivity {

    ImageButton menuBtn;
    Button sciBtn,techBtn,comBtn,artBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().hide();

        menuBtn = findViewById(R.id.menuBtn);
        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openMenu();
            }});

        sciBtn = findViewById(R.id.buttonScience);
        sciBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openSci();
            }});

        techBtn = findViewById(R.id.buttonTech);
        techBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openTech();
            }});


        comBtn = findViewById(R.id.buttonCom);
        comBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openCom();
            }});


        artBtn = findViewById(R.id.buttonArts);
        artBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openArt();
            }});



    }
    public void openMenu(){
        Intent intent=new Intent(this,ProfileActivity.class);
        startActivity(intent);}

    public void openSci(){
        Intent intent=new Intent(this,ScienceActivity.class);
        startActivity(intent);}

    public void openTech(){
        Intent intent=new Intent(this,TechnologyActivity.class);
        startActivity(intent);}

    public void openCom(){
        Intent intent=new Intent(this,CommerceActivity.class);
        startActivity(intent);}

    public void openArt(){
        Intent intent=new Intent(this,ArtsActivity.class);
        startActivity(intent);}

    //Back Press Exit
    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(DashboardActivity.this);
        alertDialog.setTitle("Confirm Exit");
        alertDialog.setMessage(" \"Are you sure you want to exit?\"");
        alertDialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }
        });
        alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.show();
    }

}

