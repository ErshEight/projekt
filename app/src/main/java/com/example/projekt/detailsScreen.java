package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class detailsScreen extends AppCompatActivity {

    private ImageButton returnButton;
    private Button reserveButton;
    private Button loveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_screen);

        returnButton = findViewById(R.id.backButton);
        reserveButton = findViewById(R.id.reserveButton);
        loveButton = findViewById(R.id.favouriteButton);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });

        reserveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishReserving();
            }
        });
    }

    public void goBack() {
        Intent intent = new Intent(this, homeScreen.class);
        startActivity(intent);
    }

    public void finishReserving() {
        Intent intent = new Intent(this, successScreen.class);
        startActivity(intent);
    }
}