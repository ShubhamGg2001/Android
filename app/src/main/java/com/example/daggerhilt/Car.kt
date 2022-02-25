package com.example.daggerhilt

import android.util.Log
import dagger.Module
import javax.inject.Inject

class Car   {
    lateinit var engine:Engine;
    lateinit var tyre: Tyres;
//    @Inject
    constructor(engine:Engine,tyre:Tyres) {
    this.engine=engine;
        Log.d("Init", "Called: ")
        this.tyre=tyre;
    }


    init {
        Log.d("Init", "Called: ")
    }
    fun getCar(){
        Log.d("Car:", "getCar: Car running")

    }
}