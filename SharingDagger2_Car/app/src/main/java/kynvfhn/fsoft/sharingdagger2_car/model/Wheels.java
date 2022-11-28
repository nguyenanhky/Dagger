package kynvfhn.fsoft.sharingdagger2_car.model;

import android.util.Log;

import javax.inject.Inject;

public class Wheels {
    private Rim rim;
    private Tire tire;

    @Inject
    public Wheels(Rim rim, Tire tire) {
        this.rim = rim;
        this.tire = tire;
    }

    public void display(){
        Log.d("Car","nguyen anh ky");
    }
}
