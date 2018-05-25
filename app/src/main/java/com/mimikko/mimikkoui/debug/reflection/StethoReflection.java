package com.mimikko.mimikkoui.debug.reflection;

import android.content.Context;
import android.util.Log;

import com.facebook.stetho.Stetho;

public class StethoReflection {
    private static final String TAG = "StethoReflection";

    public void initStetho(Context context){
        Log.d(TAG,"initStetho context="+context);
        //chrome://inspect
        Stetho.initializeWithDefaults(context);
    }

}