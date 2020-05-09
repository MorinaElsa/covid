package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String USER_EMAIL = "arian@xhezairi.com";
    private final String USER_PASS = "123321";

    private EditText emailField, passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailField = findViewById(R.id.emailField);
        passwordField = findViewById(R.id.passwordField);
        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(v -> {
            String email = emailField.getText().toString();
            String pass = passwordField.getText().toString();

            if (!email.equals(USER_EMAIL) || !pass.equals(USER_PASS)) {
                Toast.makeText(MainActivity.this, "Wrong credentials!", Toast.LENGTH_SHORT).show();
                return;
            }

            // more expressions...
            Toast.makeText(MainActivity.this, "Welcome, you have been logged in!", Toast.LENGTH_SHORT).show();
        });

        Button btnReset = findViewById(R.id.btnReset);

        btnReset.setOnClickListener(v -> {
            emailField.setText("");
            passwordField.setText("");




        });

    }
}
