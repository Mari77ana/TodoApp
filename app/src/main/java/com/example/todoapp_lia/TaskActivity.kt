package com.example.todoapp_lia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit

import com.example.todoapp_lia.databinding.ActivityTaskBinding

class TaskActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTaskBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // binding FirstFragment to TaskActivity to get an id for fragmentContainer
        val firstFragmentContainerView = binding.fragmentContainerView // Do i need this ??

        // starts the transaction for FirstFragment, use replace to find Id for fragmentContainer
        // use add>() if adding another fragment
        val firstFragment = FirstFragment()
        supportFragmentManager.commit {
            replace(R.id.fragmentContainerView, firstFragment)// finding id for fragment
        }
    }
}