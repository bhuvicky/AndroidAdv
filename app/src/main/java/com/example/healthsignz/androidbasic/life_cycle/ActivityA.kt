package com.example.healthsignz.androidbasic.life_cycle

import android.content.Intent
import android.os.Bundle
import com.example.healthsignz.androidbasic.BaseActivity
import com.example.healthsignz.androidbasic.R

import kotlinx.android.synthetic.main.activity_a.*

class ActivityA: BaseActivity() {

    val className = ActivityA::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        title = "ActivityA"

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

        buttonActivityB.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
        }
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

//  = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =


}