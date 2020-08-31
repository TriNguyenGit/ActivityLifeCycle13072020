package com.example.activitylifecycle13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button mBtnNavigationScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("BBB","activity_main2");
        mBtnNavigationScreen = findViewById(R.id.buttonNavigateScreen);
        mBtnNavigationScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB","Main 2 onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Main 2 onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Main 2 onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Main 2 onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Main 2 onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Main 2 onDestroy");
    }
}