package com.example.healthsignz.androidbasic.fragment_screen_rotation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.healthsignz.androidbasic.BaseFragment
import com.example.healthsignz.androidbasic.R
import kotlinx.android.synthetic.main.fragment_b.*

class FragmentB: BaseFragment() {

    companion object {
        fun newInstance() = FragmentB()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        retainInstance = true

        button2.setOnClickListener {
            replace(R.id.fragment_host, FragmentC.newInstance())
            System.out.println("log FragmentC BSC = ${getBackStackCount()}")
        }
    }
}