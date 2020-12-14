package com.example.codingburg.education.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.example.codingburg.education.R;
import com.example.codingburg.education.profiledata.ProfileDataActivity;

public class UserTypeActivity extends AppCompatActivity {
    Animation top_anumation, buttom_animation, middel_animation;
    View first, secound, third, four, five, six, seven;
    private TextView name, tag;
    private  Button b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_type);
        top_anumation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        buttom_animation = AnimationUtils.loadAnimation(this,R.anim.buttom_animation);
        middel_animation = AnimationUtils.loadAnimation(this,R.anim.middel_animation);
        first = findViewById(R.id.first_line);
        secound = findViewById(R.id.secound_line);
        third = findViewById(R.id.third_line);
        four = findViewById(R.id.fourth_line);
        five = findViewById(R.id.five_line);
        six = findViewById(R.id.six_line);
        seven = findViewById(R.id.seven_line);
        name = findViewById(R.id.name);
        tag = findViewById(R.id.tag);
        b1 = findViewById(R.id.guardian);
        b2 = findViewById(R.id.student);


        first.setAnimation(top_anumation);
        secound.setAnimation(top_anumation);
        third.setAnimation(top_anumation);
        four.setAnimation(top_anumation);
        five.setAnimation(top_anumation);
        six.setAnimation(top_anumation);
        seven.setAnimation(top_anumation);
        name.setAnimation(middel_animation);
        b1.setAnimation(middel_animation);
        b2.setAnimation(middel_animation);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PhoneNumberActivity.class);
                intent.putExtra("type", "guardian");
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PhoneNumberActivity.class);
                intent.putExtra("type", "student");
                startActivity(intent);
            }
        });
    }
}