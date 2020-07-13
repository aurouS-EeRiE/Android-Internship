package com.example.explicitintentcodelab;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    EditText text1;
    TextView matter1, head1;

    public static final String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        text1 = findViewById(R.id.text1);
        matter1 = findViewById(R.id.matter1);
        head1 = findViewById(R.id.head1);

        head1.setVisibility(View.INVISIBLE);
        matter1.setVisibility(View.INVISIBLE);

        Intent intent = getIntent();
        String text_value = intent.getStringExtra(EXTRA_MESSAGE);
        if(text_value != null) {
            head1.setVisibility(View.VISIBLE);
            matter1.setVisibility(View.VISIBLE);
            matter1.setText(text_value);
        }

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_value = text1.getText().toString();
                if(!text_value.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra(EXTRA_MESSAGE,text_value);
                    startActivity(intent);
                }  else {
                Toast.makeText(MainActivity.this, "Fill all the details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}