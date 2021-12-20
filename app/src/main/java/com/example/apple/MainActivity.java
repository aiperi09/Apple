package com.example.apple;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private TextInputEditText username, password;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListener();

        Glide.with(this).load(R.drawable.photo21).into(image);


        button.setOnClickListener(v -> {
            if (username.getText().toString().length() < 6 ) {
                Toast.makeText(this, "Имя пользователя должно быть больше 6 символов", Toast.LENGTH_SHORT).show();
            }else if(password.getText().toString().length() < 6){
                Toast.makeText(this,"Имя пользователя не должно быть не меньше 6 символов",Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }

        });
    }

    private void initListener() {
        image = findViewById(R.id.image);
        username = findViewById(R.id.user);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);
    }
}