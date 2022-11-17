package kynvfhn.fsoft.daggerdemosimple.component;

import javax.inject.Singleton;

import dagger.Component;
import kynvfhn.fsoft.daggerdemosimple.model.Vehicle;
import kynvfhn.fsoft.daggerdemosimple.module.VehicleModule;

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
