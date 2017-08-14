package com.cleanarchitect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cleanarchitect.deps.DaggerDeps;
import com.cleanarchitect.deps.Deps;
import com.cleanarchitect.networking.NetworkModule;

import java.io.File;

/**
 * Created by android on 8/14/2017.
 */


public class BaseApp extends AppCompatActivity {

    Deps deps;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        File cacheFile = new File(getCacheDir(), "responses");
        deps = DaggerDeps.builder().networkModule(new NetworkModule(cacheFile)).build();

    }

    public Deps getDeps() {
        return deps;
    }
}
