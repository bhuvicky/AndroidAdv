package com.example.healthsignz.androidbasic.fragment_screen_rotation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.healthsignz.androidbasic.BaseFragment
import com.example.healthsignz.androidbasic.R

import kotlinx.android.synthetic.main.fragment_a.*

class FragmentA: BaseFragment() {

    companion object {
        fun newInstance() = FragmentA()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        retainInstance = true

        button1.setOnClickListener {
            replace(R.id.fragment_host, FragmentB.newInstance())
            System.out.println("log FragmentB BSC = ${getBackStackCount()}")
        }
    }
}