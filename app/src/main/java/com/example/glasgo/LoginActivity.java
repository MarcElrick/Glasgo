package com.example.glasgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startHomepageAuthActivity(View view){
        Intent homepageIntent = new Intent(this, HomeAuthenticatedActivity.class);
        startActivity(homepageIntent);
    }

    public void startHomepageGuestActivity(View view){
        Intent homepageIntent = new Intent(this, HomeGuestActivity.class);
        startActivity(homepageIntent);
    }
}
