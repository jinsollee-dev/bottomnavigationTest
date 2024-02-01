package org.ljs.bottomnavtest.ui.mypet

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.ljs.bottomnavtest.databinding.FragmentBeachBinding

class BeachFragment : Fragment() {
    private var _binding: FragmentBeachBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val beachViewModel =
            ViewModelProvider(this).get(BeachViewModel::class.java)

        _binding = FragmentBeachBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }






}

