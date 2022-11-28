package kynvfhn.fsoft.sharingdagger2_car;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

import kynvfhn.fsoft.sharingdagger2_car.component.CarComponent;
import kynvfhn.fsoft.sharingdagger2_car.component.DaggerCarComponent;
import kynvfhn.fsoft.sharingdagger2_car.databinding.ActivityMainBinding;
import kynvfhn.fsoft.sharingdagger2_car.model.Car;
import kynvfhn.fsoft.sharingdagger2_car.model.Wheels;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Inject
    Car car;

    @Inject
    Wheels wheels;
    //private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CarComponent component = DaggerCarComponent.create();
//        Car car =component.getCar();
//        Wheels wheels =  component.getWheels();

        component.inject(this);
        car.driver();
        wheels.display();
    }
}