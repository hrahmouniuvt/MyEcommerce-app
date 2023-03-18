package com.example.myecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private Button createAccountButton;
    private EditText inputNmae, inputPhoneNumber, inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        createAccountButton = (Button) findViewById(R.id.register_btn);
        inputNmae = (EditText) findViewById(R.id.register_username_input);
        inputPassword = (EditText) findViewById(R.id.register_password_input);
        inputPhoneNumber = (EditText) findViewById(R.id.register_phone_number_input);
    }
}