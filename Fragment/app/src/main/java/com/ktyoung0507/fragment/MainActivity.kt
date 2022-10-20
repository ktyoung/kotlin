package com.ktyoung0507.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    lateinit var listFragment: ListFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setFragment()

        binding.btnSend.setOnClickListener {
            listFragment.setValue("전달할 값")
        }
    }

    fun setFragment() {
        listFragment = ListFragment()

        var bundle = Bundle()
        bundle.putString("key1", "List Fragment")
        bundle.putInt("key2", 20220101)
        listFragment.arguments = bundle

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, listFragment)
        transaction.commit()
    }

    fun goDeatail() {
        val detailFragment = DetailFragment()

        val transaction = supportFragmentManager.beginTransaction()

        transaction.add(R.id.frameLayout, detailFragment)
        transaction.addToBackStack("detail")
        transaction.commit()
    }

    fun goBack() {
        onBackPressed()
    }
}