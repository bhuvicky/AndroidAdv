package com.example.healthsignz.androidbasic.life_cycle

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.healthsignz.androidbasic.BaseFragment
import com.example.healthsignz.androidbasic.R
import com.example.healthsignz.androidbasic.fragment_screen_rotation.FragmentB
import kotlinx.android.synthetic.main.fragment_a.*

class FragmentB1: BaseFragment() {

    val className = FragmentB1::class.simpleName
    lateinit var myListener: MyClickListener

    interface MyClickListener {
        fun onClick()
    }

    fun setMyClickListener(listener: MyClickListener) {
        myListener = listener
    }

    companion object {
        fun newInstance() = FragmentB1()
    }

// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.title = "FragmentB1"

        println(className + " OnCreate")
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        println(className + " onAttach")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        println(className + " onCreateView")
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println(className + " onViewCreated")


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

// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =

    override fun onBackPressed() {
        println(className + " back pressed")
        myListener.onClick()

        super.onBackPressed()
    }
}