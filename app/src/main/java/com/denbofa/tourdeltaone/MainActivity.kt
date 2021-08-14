package com.denbofa.tourdeltaone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.denbofa.tourdeltaone.databinding.ActivityMainBinding
import com.denbofa.tourdeltaone.fragment.BookFragment
import com.denbofa.tourdeltaone.fragment.HomeFragment
import com.denbofa.tourdeltaone.fragment.SearchFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val homeFragment = HomeFragment()
    private val searchFragment = SearchFragment()
    private val bookFragment = BookFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(homeFragment)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.my_home -> replaceFragment(homeFragment)
                R.id.search -> replaceFragment(searchFragment)
                R.id.book -> replaceFragment(bookFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.bottom_nav_frame, fragment)

            transaction.commit()
        }
    }
}