package com.maha.ascapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button loginButton,signupButton;
    EditText username , password;
    DBHelper DB;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        loginButton = findViewById(R.id.login_button);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        DB = new DBHelper(this);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernames = username.getText().toString();
                String passwords = password.getText().toString();

                if (usernames.equals("") || passwords.equals(""))
                    Toast.makeText(LoginActivity.this, "Fields Cannot Be Empty", Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkusernamepasswords = DB.checkusernamepasswords(usernames,passwords);
                    if (checkusernamepasswords==true) {
                        Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this,DashboardActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(LoginActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });



        signupButton = findViewById(R.id.signup_button);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override  public void onClick(View view) {opensignup(); }});
    }

    public void opensignup(){
        Intent intent=new Intent(this,RegisterActivity.class);
        startActivity(intent);}

}
