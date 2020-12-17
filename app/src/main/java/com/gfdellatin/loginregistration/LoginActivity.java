package com.gfdellatin.loginregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class LoginActivity extends AppCompatActivity {

    private EditText userEmail, userPassword;
    private Button buttonLogin;
    private ProgressBar loginProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userEmail = findViewById(R.id.register_email);
        userPassword = findViewById(R.id.register_password);

        buttonLogin = findViewById(R.id.loginBtn);
    }
}