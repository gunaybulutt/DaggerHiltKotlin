package com.gunay.daggerhilt.two

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction() : String

}

//yontem_one
/*
@InstallIn(SingletonComponent::class)
@Module
abstract class MyModule{
    @Singleton
    @Binds
    abstract fun bindingFunction(myImplementor: InterFaceImplementor) : MyInterface
}*/


@InstallIn(SingletonComponent::class)
@Module
class MyModule {

    @FirstImplementor
    @Singleton
    @Provides
    fun providerfunction() : MyInterface {
        return InterFaceImplementor()
    }

    @SecondImplementor
    @Singleton
    @Provides
    fun secondProviderfunction() : MyInterface{
        return SecondInterfaceImplementor()
    }

    @Singleton
    @Provides
    fun gsonProvider() : Gson{
        return Gson()
    }

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class FirstImplementor

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class SecondImplementor


}















