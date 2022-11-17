package kynvfhn.fsoft.daggerdemosimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import kynvfhn.fsoft.daggerdemosimple.component.DaggerVehicleComponent;
import kynvfhn.fsoft.daggerdemosimple.component.VehicleComponent;
import kynvfhn.fsoft.daggerdemosimple.databinding.ActivityMainBinding;
import kynvfhn.fsoft.daggerdemosimple.model.Vehicle;
import kynvfhn.fsoft.daggerdemosimple.module.VehicleModule;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Vehicle vehicle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
        vehicle = component.provideVehicle();

        binding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtSpeed.setText(String.valueOf(vehicle.getSpeed()));
            }
        });

    }
}