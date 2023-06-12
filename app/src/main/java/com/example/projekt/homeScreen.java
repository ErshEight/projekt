package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homeScreen extends AppCompatActivity {

    private Button favButton;
    private Button profButton;
    private Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        favButton = findViewById(R.id.favouriteButton);
        profButton = findViewById(R.id.profileButton);
        searchButton = findViewById(R.id.searchButton);

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

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearchScreen();
            }
        });
    }

    public void openFavScreen() {
        Intent intent = new Intent(this, favouritesScreen.class);
        startActivity(intent);
    }

    public void openProfScreen() {
        Intent intent = new Intent(this, borrowsScreen.class);
        startActivity(intent);
    }

    public void openSearchScreen() {
        Intent intent = new Intent(this, searchScreen.class);
        startActivity(intent);
    }
}