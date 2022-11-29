package kynvfhn.fsoft.sharingdagger2_car;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

import kynvfhn.fsoft.sharingdagger2_car.component.CarComponent;
import kynvfhn.fsoft.sharingdagger2_car.component.DaggerCarComponent;
import kynvfhn.fsoft.sharingdagger2_car.databinding.ActivityMainBinding;
import kynvfhn.fsoft.sharingdagger2_car.model.Car;
import kynvfhn.fsoft.sharingdagger2_car.model.DieselEngineModule;
import kynvfhn.fsoft.sharingdagger2_car.model.Wheels;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Inject
    Car car;

    //private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

 //       CarComponent component = DaggerCarComponent.create();
//        Car car =component.getCar();
//        Wheels wheels =  component.getWheels();

//        CarComponent component = DaggerCarComponent.builder()
//                .dieselEngineModule(new DieselEngineModule(100))
//                .build();


        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();

        component.inject(this);
        car.driver();
    }
}