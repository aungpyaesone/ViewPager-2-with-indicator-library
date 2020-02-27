package com.aungpyaesone.viewpager_2.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.aungpyaesone.viewpager_2.fragments.FragmentOne
import com.aungpyaesone.viewpager_2.fragments.FragmentThree
import com.aungpyaesone.viewpager_2.fragments.FragmentTwo

class WelcomeAdapter(fragment:FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return FragmentOne.newInstance("a","b")
            1 -> return FragmentTwo.newInstance("a","b")
            2 -> return FragmentThree.newInstance("a","b")
            else -> return FragmentOne.newInstance("a","b")
        }
    }

    var welcomeItem = listOf<String>()
}