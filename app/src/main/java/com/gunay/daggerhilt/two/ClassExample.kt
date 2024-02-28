package com.gunay.daggerhilt.two

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample
    @Inject
    constructor(@MyModule.FirstImplementor private val myInterFaceImplementor: MyInterface,
                private val gson : Gson,
                @MyModule.SecondImplementor private val mySecondInterfaceImplementor: MyInterface){

    fun myFunction() : String{
        return "Working ${myInterFaceImplementor.myPrintFunction()}"
    }



    fun secondFunction() : String{
        return "Working: ${mySecondInterfaceImplementor.myPrintFunction()}"
    }

}