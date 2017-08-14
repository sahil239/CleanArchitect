package com.cleanarchitect.home;

/**
 * Created by android on 8/14/2017.
 */


import com.cleanarchitect.models.CityListResponse;

/**
 * Created by ennur on 6/25/16.
 */
public interface HomeView {
    void showWait();

    void removeWait();

    void onFailure(String appErrorMessage);

    void getityListSuccess(CityListResponse cityListResponse);

}