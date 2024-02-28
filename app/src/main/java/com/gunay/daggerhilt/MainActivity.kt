package com.gunay.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gunay.daggerhilt.one.Band
import com.gunay.daggerhilt.one.Instrument
import com.gunay.daggerhilt.one.Musician
import com.gunay.daggerhilt.two.ClassExample
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //Field Injection
    // bu sınıf avtiviteye inject edildiği icin scope activite den dusuk olamaz suan singleton'da
    @Inject
    lateinit var lars : Musician

    @Inject
    lateinit var myClass : ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val interFaceImplementor = InterFaceImplementor()
        //var classExample = ClassExample(interFaceImplementor)

        /*val instrument = Instrument()
        val band = Band()
        var james = Musician(instrument,band)
        james.sing()*/

        lars.sing()

        System.out.println(myClass.myFunction())
        System.out.println(myClass.secondFunction())

    }
}