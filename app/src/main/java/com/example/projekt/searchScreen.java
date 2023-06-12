package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class searchScreen extends AppCompatActivity {

    private ImageButton returnButton;
    private Button homeButton;
    private Button favButton;
    private Button profButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_screen);

        returnButton = findViewById(R.id.returnButton);
        favButton = findViewById(R.id.favouriteButton);
        profButton = findViewById(R.id.profileButton);
        homeButton = findViewById(R.id.homeButton);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });

        favButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFavScreen();
            }
        });

        profButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfScreen();
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeScreen();
            }
        });
    }

    public void goBack() {
        Intent intent = new Intent(this, homeScreen.class);
        startActivity(intent);
    }

    public void openFavScreen() {
        Intent intent = new Intent(this, favouritesScreen.class);
        startActivity(intent);
    }

    public void openProfScreen() {
        Intent intent = new Intent(this, borrowsScreen.class);
        startActivity(intent);
    }

    public void openHomeScreen() {
        Intent intent = new Intent(this, homeScreen.class);
        startActivity(intent);
    }
}