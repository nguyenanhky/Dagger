package kynvfhn.fsoft.sharingdagger2_car.module;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import kynvfhn.fsoft.sharingdagger2_car.model.Engine;
import kynvfhn.fsoft.sharingdagger2_car.model.PetrolEngine;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine petrolEngine);

}
