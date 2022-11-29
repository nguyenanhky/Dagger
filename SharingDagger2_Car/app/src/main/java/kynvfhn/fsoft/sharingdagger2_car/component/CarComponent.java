package kynvfhn.fsoft.sharingdagger2_car.component;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kynvfhn.fsoft.sharingdagger2_car.MainActivity;
import kynvfhn.fsoft.sharingdagger2_car.model.Car;
import kynvfhn.fsoft.sharingdagger2_car.model.DieselEngineModule;
import kynvfhn.fsoft.sharingdagger2_car.model.Wheels;
import kynvfhn.fsoft.sharingdagger2_car.module.PetrolEngineModule;
import kynvfhn.fsoft.sharingdagger2_car.module.WheelsModule;

@Component(modules = {WheelsModule.class,PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
        CarComponent build();
    }
}
