package com.bhanu01.eshopadmin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.bhanu01.eshopadmin.R
import com.bhanu01.eshopadmin.databinding.FragmentProductBinding

class ProductFragment : Fragment(){

    private lateinit var binding : FragmentProductBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProductBinding.inflate(layoutInflater)
        binding. floatingActionButton.setOnClickListener{

            Navigation.findNavController(it).navigate(R.id.action_productFragment_to_addProductFragment)

        }

        return binding.root
    }


}