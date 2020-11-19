package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("PMf6R7tiKOTtVfmwXjFr7uYrW04CUGosd6aHNPon")
                .clientKey("nMaPyUEhVNO1x1XsvI4j7r79WGE4bMvPerUSbf04")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
