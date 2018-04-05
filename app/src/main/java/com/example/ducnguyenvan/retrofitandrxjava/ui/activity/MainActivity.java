package com.example.ducnguyenvan.retrofitandrxjava.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.ducnguyenvan.retrofitandrxjava.R;

public class MainActivity extends AppCompatActivity {

    private Button btnLoadPosts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoadPosts = (Button) findViewById(R.id.btn_all_posts);
        //lambda expressions refer to http://androidsrc.net/java8-lambda-expression-tutorial-android/
        btnLoadPosts.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, PostsActivity.class));
        });
    }
}
