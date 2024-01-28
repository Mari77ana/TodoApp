package com.example.todoapp_lia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.todoapp_lia.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private var _binding:  FragmentFirstBinding? =  null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // SetUp Binding
        _binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        return view
    }




}