package com.example.healthsignz.androidbasic.fragment_screen_rotation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.healthsignz.androidbasic.BaseFragment
import com.example.healthsignz.androidbasic.R
import kotlinx.android.synthetic.main.fragment_c.*

class FragmentC: BaseFragment() {

    companion object {
        fun newInstance() = FragmentC()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_c, container, false)
        retainInstance = true
        return view
    }


}