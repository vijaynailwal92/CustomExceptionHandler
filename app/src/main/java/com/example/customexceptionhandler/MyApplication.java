package com.example.customexceptionhandler;

import android.app.Application;


public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //----------custom exception handler
        new UCEHandler.Builder(getApplicationContext()).setTrackActivitiesEnabled(true).
                addCommaSeparatedEmailAddresses("comma separated email addresses").build();


    }
}
