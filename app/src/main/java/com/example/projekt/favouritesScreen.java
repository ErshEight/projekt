package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class favouritesScreen extends AppCompatActivity {

    private Button homeButton;
    private Button profButton;
    private ImageButton returnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites_screen);
        returnButton = findViewById(R.id.backButton2);
        profButton = findViewById(R.id.profileButton);
        homeButton = findViewById(R.id.homeButton);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeScreen();
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

    public void openProfScreen() {
        Intent intent = new Intent(this, borrowsScreen.class);
        startActivity(intent);
    }

    public void openHomeScreen() {
        Intent intent = new Intent(this, homeScreen.class);
        startActivity(intent);
    }
}