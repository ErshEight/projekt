package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class borrowsScreen extends AppCompatActivity {

    private ImageButton returnButton;
    private Button homeButton;
    private Button favButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrows_screen);

        returnButton = findViewById(R.id.backButton);
        favButton = findViewById(R.id.favouriteButton);
        homeButton = findViewById(R.id.homeButton);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeScreen();
            }
        });

        favButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFavScreen();
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeScreen();
            }
        });
    }

    public void openFavScreen() {
        Intent intent = new Intent(this, favouritesScreen.class);
        startActivity(intent);
    }

    public void openHomeScreen() {
        Intent intent = new Intent(this, homeScreen.class);
        startActivity(intent);
    }
}