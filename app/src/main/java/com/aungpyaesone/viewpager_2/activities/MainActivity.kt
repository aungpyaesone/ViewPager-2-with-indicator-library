package com.aungpyaesone.viewpager_2.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.ORIENTATION_VERTICAL
import com.aungpyaesone.viewpager_2.R
import com.aungpyaesone.viewpager_2.adapter.WelcomeAdapter
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mViewPager2Adapter = WelcomeAdapter(this)
        mViewPager2Adapter.welcomeItem = listOf("one","two","three")
        view_pager.adapter = mViewPager2Adapter

        indicator.setViewPager(view_pager)
      //  view_pager.orientation = ORIENTATION_VERTICAL
        mViewPager2Adapter.registerAdapterDataObserver(indicator.adapterDataObserver)

        view_pager.registerOnPageChangeCallback(object :
        ViewPager2.OnPageChangeCallback(){
            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
               // Toast.makeText(applicationContext,state.toString(),Toast.LENGTH_SHORT).show()
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
              //  Snackbar.make(window.decorView,position.toString() +" "+ positionOffset.toString()+" "+
              //  positionOffsetPixels.toString(),Snackbar.LENGTH_LONG).show()
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
             //   Snackbar.make(window.decorView,position.toString(),Snackbar.LENGTH_SHORT).show()
            }
        })

       /* btnNext.setOnClickListener {
        }*/
    }



}
