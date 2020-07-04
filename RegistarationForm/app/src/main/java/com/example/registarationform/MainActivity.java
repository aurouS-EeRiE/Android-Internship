package com.example.registarationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText roll, name, phone, email, password;
    Spinner gender, branch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.submit);
        roll = findViewById(R.id.roll);
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        gender = findViewById(R.id.gender);
        branch = findViewById(R.id.branch);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String roll_value = roll.getText().toString();
                String name_value = name.getText().toString();
                String phone_value = phone.getText().toString();
                String email_value = email.getText().toString();
                String password_value = password.getText().toString();
                String gender_value = gender.getSelectedItem().toString();
                String branch_value = branch.getSelectedItem().toString();
                if(!roll_value.isEmpty() && !name_value.isEmpty() && !phone_value.isEmpty() && !email_value.isEmpty() && !password_value.isEmpty()){
                    Intent intent = new Intent(MainActivity.this, details.class);
                    intent.putExtra("roll_2",roll_value);
                    intent.putExtra("name_2",name_value);
                    intent.putExtra("phone_2",phone_value);
                    intent.putExtra("email_2",email_value);
                    intent.putExtra("password_2",password_value);
                    intent.putExtra("gender_2",gender_value);
                    intent.putExtra("branch_2",branch_value);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Fill all the details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}