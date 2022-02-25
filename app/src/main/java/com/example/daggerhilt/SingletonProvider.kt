package com.example.daggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SingletonProvider {

    @Singleton
    @Provides
    fun getEngine(): Engine {
        return Engine()
    }

    @Singleton
    @Provides
    fun getTyre(): Tyres {
        return Tyres()
    }
    @Singleton
    @Provides
    fun getCar(engine: Engine,tyres: Tyres): Car {
        return Car(engine,tyres)
    }
}