package com.friends.parapathsangam.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.friends.parapathsangam.MembersFragment
import com.friends.parapathsangam.R
import com.friends.parapathsangam.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
       // val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val btn_members: Button = binding.buttonPersion
        val btn_details: Button = binding.buttonDetails
        val btn_about: Button = binding.buttonAbout
       /* homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        btn_members.setOnClickListener {
             val  fragmentManager=parentFragmentManager
            val fragmentTransaction=fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.nav_host_fragment_activity_main,MembersFragment()).addToBackStack(null).commit()
        }
        btn_details.setOnClickListener {

        }
        btn_about.setOnClickListener {

        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}