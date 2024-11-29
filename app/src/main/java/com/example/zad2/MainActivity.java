package com.example.zad2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private int[] imageIds = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3
    };


    private int currentImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageView = findViewById(R.id.imageView);
        Button previousButton = findViewById(R.id.previousButton);
        Button nextButton = findViewById(R.id.nextButton);


        imageView.setImageResource(imageIds[currentImageIndex]);


        previousButton.setOnClickListener(v -> {

            if (currentImageIndex > 0) {
                currentImageIndex--;
                imageView.setImageResource(imageIds[currentImageIndex]);
            }
        });


        nextButton.setOnClickListener(v -> {

            if (currentImageIndex < imageIds.length - 1) {
                currentImageIndex++;
                imageView.setImageResource(imageIds[currentImageIndex]);
            }
        });
    }
}
