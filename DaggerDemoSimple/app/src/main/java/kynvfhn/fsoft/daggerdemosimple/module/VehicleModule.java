package kynvfhn.fsoft.daggerdemosimple.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import kynvfhn.fsoft.daggerdemosimple.model.Motor;
import kynvfhn.fsoft.daggerdemosimple.model.Vehicle;

@Module
public class VehicleModule {
    @Provides
    @Singleton
    Motor providerMotor(){
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle providerVehicle(){
        return new Vehicle(providerMotor());
    }
}
