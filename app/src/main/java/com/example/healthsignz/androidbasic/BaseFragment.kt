package com.example.healthsignz.androidbasic

import android.support.v4.app.Fragment

open class BaseFragment: Fragment() {

    fun replace(containerId: Int, fragment: BaseFragment) {
        if (activity is BaseActivity)
            (activity as BaseActivity).replace(containerId, fragment)
    }

    fun add(containerId: Int, fragment: BaseFragment) {
        if (activity is BaseActivity) {
            (activity as BaseActivity).add(containerId, fragment)
        }
    }

    fun getBackStackCount(): Int {
        return (activity as BaseActivity).backStackCount()
    }

    open fun onBackPressed() {
        if (activity is BaseActivity)
            (activity as BaseActivity).pop()
    }
}
