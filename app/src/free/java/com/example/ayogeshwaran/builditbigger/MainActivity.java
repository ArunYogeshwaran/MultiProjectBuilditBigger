package com.example.ayogeshwaran.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jokesdisplayer.ShowJokesActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
    }

    public void showJoke(View view) {
        new GetJokeTask() {
            @Override
            protected void onPostExecute(String joke) {
                if (joke != null) {
                    Intent intent = new Intent(MainActivity.this, ShowJokesActivity.class);
                    intent.putExtra(ShowJokesActivity.JOKE_TO_DISPLAY, joke);
                    startActivity(intent);
                }
            }
        }.execute();

    }


}
