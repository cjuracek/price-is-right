package com.example.cjuracek.price_is_right2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToHostLogin(View view) {
        Intent intent = new Intent (this, LoginScreen2.class);
        startActivity(intent);
    }

    public void goToClientLogin(View view) {
        Intent intent = new Intent (this, LoginScreen.class);
        startActivity(intent);
    }

}
