package com.example.cameraaccess;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private static final int image_id = 101;

    Button capture;
    ImageView display;
    Bitmap bitmap;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        MainActivity preactivity = (MainActivity) getLastNonConfigurationInstance();
        if(preactivity != null) {
            this.bitmap = preactivity.bitmap;
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        capture = findViewById(R.id.capture);
        display = findViewById(R.id.display);

        capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, image_id);
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

            if(requestCode == image_id) {
                Bitmap photo = (Bitmap) data.getExtras().get("data");

                display.setImageBitmap(photo);
            }

    }
}