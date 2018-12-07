package com.example.healthsignz.androidbasic.life_cycle

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.healthsignz.androidbasic.BaseFragment
import com.example.healthsignz.androidbasic.R
import com.example.healthsignz.androidbasic.fragment_screen_rotation.FragmentA
import com.example.healthsignz.androidbasic.fragment_screen_rotation.FragmentB
import kotlinx.android.synthetic.main.fragment_a.*

class FragmentA1: BaseFragment() {

    val className = FragmentA1::class.simpleName

    companion object {
        fun newInstance() = FragmentA1()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        println(className + " onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.title = "FragmentA1"

        println(className + " OnCreate")
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        println(className + " onCreateView")
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println(className + " onViewCreated")

        button1.setOnClickListener {
            val fragment = FragmentB1.newInstance()
            fragment.setMyClickListener(object : FragmentB1.MyClickListener{
                override fun onClick() {
                    println(className + " data passed from B to A")
                }

            })
            add(R.id.fragment_host, fragment)
            System.out.println("log FragmentB BSC = ${getBackStackCount()}")
        }
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

    override fun onDestroyView() {
        super.onDestroyView()

        println(className + " onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()

        println(className + " onDestroy")
    }

    override fun onDetach() {
        super.onDetach()

        println(className + " onDetach")
    }
}