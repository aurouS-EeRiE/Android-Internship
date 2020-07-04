package com.example.registarationform;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class details extends AppCompatActivity {

    TextView roll_1, name_1, phone_1, email_1, password_1, gender_1, branch_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_main);

        roll_1 = findViewById(R.id.roll_1);
        name_1 = findViewById(R.id.name_1);
        phone_1 = findViewById(R.id.phone_1);
        email_1 = findViewById(R.id.email_1);
        password_1 = findViewById(R.id.password_1);
        gender_1 = findViewById(R.id.gender_1);
        branch_1 = findViewById(R.id.branch_1);

        roll_1.setText("Roll No : "+getIntent().getStringExtra("roll_2"));
        name_1.setText("Name : "+getIntent().getStringExtra("name_2"));
        phone_1.setText("Phone No : "+getIntent().getStringExtra("phone_2"));
        email_1.setText("Email ID : "+getIntent().getStringExtra("email_2"));
        password_1.setText("Password : "+getIntent().getStringExtra("password_2"));
        gender_1.setText("Gender : "+getIntent().getStringExtra("gender_2"));
        branch_1.setText("Branch : "+getIntent().getStringExtra("branch_2"));
    }
}