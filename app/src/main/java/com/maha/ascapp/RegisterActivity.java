package com.maha.ascapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    DBHelper DB;
    Button createButton;
    EditText firstname, lastname , username , password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();

        firstname = (EditText) findViewById(R.id.first_name);
        lastname = (EditText) findViewById(R.id.last_name);
        username = (EditText) findViewById(R.id.user_name);
        password = (EditText) findViewById(R.id.password);
        createButton = findViewById(R.id.register_button);
        DB = new DBHelper(this);

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstnames = firstname.getText().toString();
                String lastnames = lastname.getText().toString();
                String usernames = username.getText().toString();
                String passwords = password.getText().toString();

                if (firstnames.equals("") || lastnames.equals("") || usernames.equals("") || passwords.equals(""))
                    Toast.makeText(RegisterActivity.this, "Fields Cannot Be Empty", Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkemail = DB.checkusername(usernames);
                    if (checkemail==false) {
                        Boolean insert = DB.insertData(firstnames,lastnames,usernames,passwords);
                        if (insert==true) {
                            Toast.makeText(RegisterActivity.this, "Account Create Successful", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(RegisterActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else Toast.makeText(RegisterActivity.this, "User Already Exist", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}