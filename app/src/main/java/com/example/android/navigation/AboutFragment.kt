
package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding: FragmentAboutBinding = DataBindingUtil
                .inflate(inflater, R.layout.fragment_about, container, false
                )
        binding.playButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_aboutFragment_to_gameFragment)
        }
        return binding.root
    }
}
