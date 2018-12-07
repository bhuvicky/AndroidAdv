package com.example.healthsignz.androidbasic.life_cycle

import android.os.Bundle
import com.example.healthsignz.androidbasic.BaseActivity
import com.example.healthsignz.androidbasic.R

class ActivityB : BaseActivity() {

    val className = ActivityB::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "ActivityB"

        println(className + " OnCreate")
    }

    override fun onRestart() {
        super.onRestart()

        println(className + " onRestart")
    }

    override fun onStart() {
        super.onStart()

        println(className + " onStart")
    }

    override fun onResume() {
        super.onResume()

        println(className + " onResume")
    }

    override fun onPause() {
        super.onPause()

        println(className + " onPause")
    }

    override fun onStop() {
        super.onStop()

        println(className + " onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        println(className + " onDestroy")
    }
}