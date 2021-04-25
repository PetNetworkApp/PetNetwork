package com.example.petnetwork;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("KHHH0k4tN7tbLt2XHSsa0CYJckIoId6IWwahlp8A")
                .clientKey("toPSk2pcQLeZnB5jlQDmM5oKngw1sX8dDNO6Y6OP")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
