package kynvfhn.fsoft.sharingdagger2_car.module;

import dagger.Module;
import dagger.Provides;
import kynvfhn.fsoft.sharingdagger2_car.model.Engine;
import kynvfhn.fsoft.sharingdagger2_car.model.PetrolEngine;

@Module
public class PetrolEngineModule {
    @Provides
    Engine provideEngine(PetrolEngine petrolEngine){
        return petrolEngine;
    }
}
