package com.example.healthsignz.androidbasic

import android.support.v7.app.AppCompatActivity

open class BaseActivity: AppCompatActivity() {

    private val fm = supportFragmentManager

    fun replace(containerId: Int, fragment: BaseFragment) {
        val ft = fm.beginTransaction()
        ft.replace(containerId, fragment, "" + fm.backStackEntryCount)
        ft.addToBackStack(null)
        ft.commit()
    }

    fun add(containerId: Int, fragment: BaseFragment) {
        val transaction = fm.beginTransaction();
        transaction.add(containerId, fragment, "" + fm.backStackEntryCount)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun backStackCount(): Int {
        return fm.backStackEntryCount
    }

    fun pop() {
        fm.popBackStack()
    }

    override fun onBackPressed() {
        var count = fm.backStackEntryCount
        if (count > 1) {
            count--
            val fragment = fm.findFragmentByTag(count.toString())
            if (fragment is BaseFragment)
                (fragment as BaseFragment).onBackPressed()
        } else {
            finish()
        }

        System.out.println("log BSC after pop = ${fm.backStackEntryCount}")
    }
}