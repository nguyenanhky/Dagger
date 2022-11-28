package kynvfhn.fsoft.sharingdagger2_car.model;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.d("Car","Diesel engine started");
    }

}
