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

import static com.example.explicitintentcodelab.MainActivity.EXTRA_MESSAGE;

public class SecondActivity extends AppCompatActivity {

    Button button2;
    EditText text2;
    TextView matter2, head2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        button2 = findViewById(R.id.button2);
        text2 = findViewById(R.id.text2);
        matter2 = findViewById(R.id.matter2);
        head2 = findViewById(R.id.head2);

        Intent intent = getIntent();
        String text_value = intent.getStringExtra(EXTRA_MESSAGE);
        matter2.setText(text_value);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_value = text2.getText().toString();
                if(!text_value.isEmpty()) {
                    Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                    intent.putExtra(EXTRA_MESSAGE,text_value);
                    startActivity(intent);
                }  else {
                    Toast.makeText(SecondActivity.this, "Fill all the details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}