package com.example.projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginScreen extends AppCompatActivity {

    private Button startButton;
    private EditText loginInput;
    private EditText passInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        startButton = findViewById(R.id.GetStartedButton);
        startButton.setEnabled(false);
        loginInput = findViewById(R.id.editTextNumber);
        passInput = findViewById(R.id.editTextTextPassword);

        buttonConfig();

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goHomeScreen();
            }
        });
    }

    public void buttonConfig() {
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // do nothing
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // enable the button if both the Login and Password EditViews have content
                if (!loginInput.getText().toString().isEmpty() && !passInput.getText().toString().isEmpty()) {
                    startButton.setEnabled(true);
                    startButton.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#AA40FD")));
                } else {
                    startButton.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // do nothing
            }
        };

        loginInput.addTextChangedListener(textWatcher);
        passInput.addTextChangedListener(textWatcher);
    }

    public void goHomeScreen() {
        Intent intent = new Intent(this, homeScreen.class);
        startActivity(intent);
    }
}