package com.example.android.navigation


import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.FragmentTitleBinding
import timber.log.Timber


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
                R.layout.fragment_title, container, false)
        binding.playButton.setOnClickListener {
            it.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToGameFragment())
        }
        binding.btnAbout.setOnClickListener {
            it.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToAboutFragment())
        }
        binding.btnRules.setOnClickListener {
            it.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToRulesFragment())
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("TitleFragment: onCreate")

    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Timber.d("TitleFragment: onAttach")
    }

    override fun onStart() {
        super.onStart()
        Timber.d("TitleFragment: onStart")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("TitleFragment: onPause")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("TitleFragment: onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Timber.d("TitleFragment: onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Timber.d("TitleFragment: onDetach")
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, view!!.findNavController())
                || return super.onOptionsItemSelected(item)

    }
}
