package com.cleanarchitect.deps;

import com.cleanarchitect.home.HomeActivity;
import com.cleanarchitect.networking.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by android on 8/14/2017.
 */
@Singleton
@Component(modules = {NetworkModule.class,})
public interface Deps {
    void inject(HomeActivity homeActivity);
}