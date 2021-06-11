package com.example.basicsyntex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


}
open class Parent{
    var hello:String = "안녕하세요"
    fun sayHello(){
        Log.d("Extension","$hello")
    }
}

class Child:Parent(){
    fun myHello(){
        hello="Hello"
        sayHello()
    }
}

open class BasicClass{
    open fun opened(){}
    fun notOpened(){}
}

class BaseClass:BasicClass(){
    override fun opened() {

    }
}

