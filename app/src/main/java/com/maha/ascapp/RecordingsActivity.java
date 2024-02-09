package com.maha.ascapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecordingsActivity extends AppCompatActivity {
    Button joinBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recordings);
        getSupportActionBar().hide();

        joinBtn = findViewById(R.id.buttonJoin);
        joinBtn.setOnClickListener(new View.OnClickListener() {
            @Override    public void onClick(View view) {
                openDetail();
            }});
    }

    public void openDetail(){
        Intent intent=new Intent(this,DetailsActivity.class);
        overridePendingTransition(0,0);
        startActivity(intent);}
}