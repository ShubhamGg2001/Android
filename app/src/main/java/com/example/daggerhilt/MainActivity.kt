package com.example.daggerhilt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car:Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        System.out.println( car.tyre.name )
//        println(car.engine.name)
        Log.d("MainActivity", "onCreate: "+car.hashCode())
        car.getCar()

        val button: Button =findViewById(R.id.button);
       button.setOnClickListener({
           view->startActivity(Intent(this,MainActivity::class.java))
       })


    }
}
