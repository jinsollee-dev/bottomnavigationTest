package org.ljs.bottomnavtest.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import org.ljs.bottomnavtest.R
import org.ljs.bottomnavtest.databinding.FragmentDashboardBinding
import androidx.navigation.fragment.findNavController

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)



        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //  프래그먼트 내의 버튼 클릭 시
        binding?.button1?.setOnClickListener {
            // Navigation Controller를 사용하여 InputFragment로 이동

            // 이동 전 현재 프래그먼트를 백 스택에 추가
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.addToBackStack(null)

            // 입력 프래그먼트로 이동
            findNavController().navigate(R.id.action_Fragment_to_inputFragment)

            transaction.commit()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}