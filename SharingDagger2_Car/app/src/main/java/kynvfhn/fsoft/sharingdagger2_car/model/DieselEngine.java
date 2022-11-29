package kynvfhn.fsoft.sharingdagger2_car.model;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private int horsePower;


    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d("Car", "Diesel engine started. HorsePower: " + horsePower);
    }

}
