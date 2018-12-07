package com.example.healthsignz.androidbasic

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.healthsignz.androidbasic.fragment_screen_rotation.FragmentA
import com.example.healthsignz.androidbasic.life_cycle.FragmentA1

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (backStackCount() == 0).let { replace(R.id.fragment_host, FragmentA1.newInstance()) }

//        System.out.println("log FragmentA from Activity BSC = ${backStackCount()}")
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        setContentView(R.layout.activity_main)
        super.onConfigurationChanged(newConfig)
    }
}
