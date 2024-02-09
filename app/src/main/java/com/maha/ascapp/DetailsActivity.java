package com.maha.ascapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity {
    Button recBtn,Location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().hide();

        Location = findViewById(R.id.buttonLocation);
        Location.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openLoc();
            }});

        recBtn = findViewById(R.id.buttonRec);
        recBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openRec();
            }});
    }

    public void openRec(){
        Intent intent=new Intent(this,RecordingsActivity.class);
        overridePendingTransition(0,0);
        startActivity(intent);}

    public void openLoc(){
        Intent intent=new Intent(this,SemiLocationActivity.class);
        startActivity(intent);}
}
