package com.maha.ascapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {

    Button pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        getSupportActionBar().hide();
        getSupportActionBar().hide();


        pay = findViewById(R.id.buttonPay);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openDetails();
            }});

    }


    public void openDetails(){
        Intent intent=new Intent(this, DetailsActivity.class);
        Toast.makeText(PaymentActivity.this, "Payment Successful", Toast.LENGTH_SHORT).show();
        startActivity(intent);}

}

