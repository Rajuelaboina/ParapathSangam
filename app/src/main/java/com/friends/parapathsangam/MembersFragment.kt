package com.friends.parapathsangam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.friends.parapathsangam.adapters.MemberAdapter
import com.friends.parapathsangam.model.Memder


class MembersFragment : Fragment() {


    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
       val view:View=inflater.inflate(R.layout.fragment_members, container, false)
       val data= ArrayList<Memder>()
        data.add(Memder("Raju",R.drawable.ic_baseline_groups_24))
        data.add(Memder("SomaRaju",R.drawable.ic_baseline_groups_24))
        data.add(Memder("PothaRaju",R.drawable.ic_baseline_groups_24))
        data.add(Memder("Srinu",R.drawable.ic_baseline_groups_24))
        data.add(Memder("Mallesh",R.drawable.ic_baseline_groups_24))
        data.add(Memder("Kumar",R.drawable.ic_baseline_groups_24))
        data.add(Memder("Ashok",R.drawable.ic_baseline_groups_24))
        data.add(Memder("Arun",R.drawable.ic_baseline_groups_24))
        data.add(Memder("Nagesh",R.drawable.ic_baseline_groups_24))
        data.add(Memder("Nagaraju",R.drawable.ic_baseline_groups_24))
         val recyclerView=view.findViewById<RecyclerView>(R.id.recyclerView_members)
        recyclerView.layoutManager=LinearLayoutManager(context)
        recyclerView.adapter=MemberAdapter(data)
        return view
    }

  /*  companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MembersFragment().apply {

            }
    }*/
}