package com.codingwithmitch.fragments

import androidx.fragment.app.FragmentFactory

class MainFragmentFactory(
    private val dependency1: String
) : FragmentFactory(){

    override fun instantiate(classLoader: ClassLoader, className: String) =

        when(className){

            BlankFragment::class.java.name -> {
                BlankFragment(dependency1)
            }

            else -> super.instantiate(classLoader, className)
        }
}