package kynvfhn.fsoft.sharingdagger2_car.module;

import dagger.Module;
import dagger.Provides;
import kynvfhn.fsoft.sharingdagger2_car.model.Rim;
import kynvfhn.fsoft.sharingdagger2_car.model.Tire;
import kynvfhn.fsoft.sharingdagger2_car.model.Wheels;

@Module
public  class WheelsModule {
    @Provides
    Rim provideRim(){
        return new Rim();
    }

    @Provides
    Tire provideTire(){
        Tire tire = new Tire();
        tire.inflate();
        return tire;
    }

    @Provides
    Wheels provideWheels(Rim rim, Tire tire){
        return new Wheels(rim,tire);
    }
}
