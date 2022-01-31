package com.example.mycalendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.commit
import com.example.mycalendar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    internal lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val mCalendarFragment = CalendarFragment()
        val fragment = mFragmentManager.findFragmentByTag(CalendarFragment::class.java.simpleName)

        if (fragment !is CalendarFragment) {
            Log.d("MyCalendar", "Fragment Name :" + CalendarFragment::class.java.simpleName)
            mFragmentManager.commit {
                add(R.id.frame_container, mCalendarFragment, CalendarFragment::class.java.simpleName)
            }
        }
    }
}