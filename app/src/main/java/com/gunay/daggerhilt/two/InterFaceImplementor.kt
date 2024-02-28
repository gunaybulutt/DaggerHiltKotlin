package com.gunay.daggerhilt.two

import javax.inject.Inject

class InterFaceImplementor
    @Inject
    constructor() : MyInterface {


    override fun myPrintFunction(): String {
        return "My Interface Implementor"
    }


}