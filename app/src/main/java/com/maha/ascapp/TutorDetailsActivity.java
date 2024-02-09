package com.maha.ascapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TutorDetailsActivity extends AppCompatActivity {

    ImageButton menuBtn;
    Button pay1,pay2,pay3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_details);
        getSupportActionBar().hide();
        menuBtn = findViewById(R.id.menuBtn);
        menuBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openMenu();
            }});

        pay1 = findViewById(R.id.buttonPay);
        pay1.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openPayment();
            }});

        pay2 = findViewById(R.id.buttonPay2);
        pay2.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openPayment();
            }});


        pay3 = findViewById(R.id.buttonPay3);
        pay3.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openPayment();
            }});


    }
    public void openMenu(){
        Intent intent=new Intent(this,ProfileActivity.class);
        startActivity(intent);}

    public void openPayment(){
        Intent intent=new Intent(this, PaymentActivity.class);
        startActivity(intent);}

}

