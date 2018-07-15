package com.example.ayogeshwaran.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jokesdisplayer.ShowJokesActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showJoke(View view) {
        new GetJokeTask() {
            @Override
            protected void onPostExecute(String joke) {
                if (joke != null) {
                    Intent intent = new Intent(MainActivity.this,
                            ShowJokesActivity.class);
                    intent.putExtra(ShowJokesActivity.JOKE_TO_DISPLAY, joke);
                    startActivity(intent);
                }
            }
        }.execute();

    }


}
