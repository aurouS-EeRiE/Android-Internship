package com.example.loginregistrationpages;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class register extends AppCompatActivity {

    Button register_final, login_final;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        login_final = findViewById(R.id.login_final);
        register_final = findViewById(R.id.register_final);

        login_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register.this, MainActivity.class);
                startActivity ( intent );
            }
        });
        register_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register.this, home.class);
                startActivity ( intent );
            }
        });
    }

}