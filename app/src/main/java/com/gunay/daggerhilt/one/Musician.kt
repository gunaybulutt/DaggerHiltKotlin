package com.gunay.daggerhilt.one

import javax.inject.Inject
import javax.inject.Singleton

//Constructor Injection
@Singleton // tum uygulamada calisacak kapsam
class Musician
    @Inject
    constructor(instrument: Instrument, band: Band) {

    fun sing(){
        System.out.println("working..")
    }

}