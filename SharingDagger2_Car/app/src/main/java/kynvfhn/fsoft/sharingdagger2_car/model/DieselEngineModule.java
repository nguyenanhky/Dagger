package kynvfhn.fsoft.sharingdagger2_car.model;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class DieselEngineModule {
    int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
     Engine provideEngine(){
        return new DieselEngine(horsePower);
    }
}
