package com.example.codingburg.education.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.codingburg.education.R;
import com.google.android.material.textfield.TextInputLayout;

public class PhoneNumberActivity extends AppCompatActivity {
    private Button getOtp;
    private String type;
    private TextInputLayout phoneNumber;
    private EditText getPhoneNumber;
    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_phone_number);
        type = getIntent().getExtras().getString("type");
        phoneNumber = findViewById(R.id.number);
        getPhoneNumber = findViewById(R.id.phonenumber);
        getOtp = findViewById(R.id.getotp);
        getOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = getPhoneNumber.getText().toString();
                Intent intent = new Intent(getApplicationContext(), OtpActivity.class);
                intent.putExtra("number", number);
                intent.putExtra("type", type);
                startActivity(intent);
            }
        });
    }
}