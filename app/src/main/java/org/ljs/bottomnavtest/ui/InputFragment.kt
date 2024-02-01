package org.ljs.bottomnavtest.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import org.ljs.bottomnavtest.MainActivity
import org.ljs.bottomnavtest.R
import org.ljs.bottomnavtest.databinding.FragmentBeachBinding
import org.ljs.bottomnavtest.databinding.FragmentInputBinding
import org.ljs.bottomnavtest.ui.mypet.BeachViewModel


class InputFragment : Fragment() {
    private var _binding: FragmentInputBinding?  =null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentInputBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

