package com.example.codingburg.education.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.codingburg.education.R;
import com.example.codingburg.education.profiledata.GuardianProfileDataActivity;
import com.example.codingburg.education.profiledata.ProfileDataActivity;

public class OtpActivity extends AppCompatActivity {
    String getNumber;
    private  String type;
    private Button verify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_otp);
        type = getIntent().getExtras().getString("type");
        getNumber = getIntent().getExtras().getString("number");
        System.out.println(getNumber);
        verify = findViewById(R.id.verify);
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((type != "student")){
                    Intent intent = new Intent(getApplicationContext(), GuardianProfileDataActivity.class);
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(getApplicationContext(), ProfileDataActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}