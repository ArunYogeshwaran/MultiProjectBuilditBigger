package com.example.ayogeshwaran.builditbigger;


import android.os.AsyncTask;

import com.example.ayogeshwaran.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

public class GetJokeTask extends AsyncTask<Void, Void, String> {

    @Override
    protected String doInBackground(Void... voids) {
        MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                .setRootUrl("http://192.168.0.102:8080/_ah/api/")
                .setApplicationName("backend")
                .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                    @Override
                    public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                        abstractGoogleClientRequest.setDisableGZipContent(false);
                    }
                });

        MyApi myApiService = builder.build();

        String joke = null;

        try {
            joke = myApiService.getJoke().execute().getData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return joke;
    }

}
