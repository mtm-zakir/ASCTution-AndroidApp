package com.maha.ascapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SemiLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi_location);
        getSupportActionBar().hide();

        Fragment fragment=new MapsFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.mapLayout,fragment).commit();
    }
}