package com.example.mycalendar

//import androidx.annotation.LayoutRes
//import androidx.appcompat.app.AppCompatActivity
//import androidx.appcompat.widget.Toolbar
//import androidx.fragment.app.Fragment
//
//interface HasToolbar {
//    val toolbar: Toolbar? // Return null to hide the toolbar
//}
//
//interface HasBackButton
//
//abstract class BaseFragment(@LayoutRes layoutRes: Int) : Fragment(layoutRes) {
//
//    val mainActivityToolbar: Toolbar
//        get() = (requireActivity() as MainActivity).binding.mainToolbar
//
//    override fun onStart() {
//        super.onStart()
//        if (this is HasToolbar) {
//            mainActivityToolbar.makeGone()
//            (requireActivity() as AppCompatActivity).setSupportActionBar(toolbar)
//        }
//
//        if (this is HasBackButton) {
//            val actionBar = (requireActivity() as AppCompatActivity).supportActionBar
//            actionBar?.title = if (titleRes != null) context?.getString(titleRes!!) else ""
//            actionBar?.setDisplayHomeAsUpEnabled(true)
//        }
//    }
//
//    override fun onStop() {
//        super.onStop()
//        if (this is HasToolbar) {
//            mainActivityToolbar.makeVisible()
//            (requireActivity() as AppCompatActivity).setSupportActionBar(mainActivityToolbar)
//        }
//
//        if (this is HasBackButton) {
//            val actionBar = (requireActivity() as AppCompatActivity).supportActionBar
//            actionBar?.title = context?.getString(R.string.app_name)
//            actionBar?.setDisplayHomeAsUpEnabled(false)
//        }
//    }
//
//    abstract val titleRes: Int?
//}