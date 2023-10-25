package com.example.iqbaalrafi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.iqbaalrafi.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
   private var _binding:FragmentHomeBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }


}