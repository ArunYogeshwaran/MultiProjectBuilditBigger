package com.example.jokesdisplayer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;

public class ShowJokesActivity extends AppCompatActivity {
    public static final String JOKE_TO_DISPLAY = "joke_to_display";
    TextView jokeTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_jokes_activity);
        jokeTextView = findViewById(R.id.jokeTextView);
        String joke = getIntent().getStringExtra(JOKE_TO_DISPLAY);
        if (!TextUtils.isEmpty(joke)) {
            jokeTextView.setText(joke);
        }
    }
}
