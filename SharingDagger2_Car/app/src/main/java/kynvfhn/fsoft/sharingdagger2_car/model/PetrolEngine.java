package kynvfhn.fsoft.sharingdagger2_car.model;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    @Inject
    public PetrolEngine() {

    }

    @Override
    public void start() {
        Log.d("Car","Petrol engine started");

    }
}
