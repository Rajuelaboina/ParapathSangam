package com.friends.parapathsangam.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.friends.parapathsangam.R
import com.friends.parapathsangam.model.Memder

class MemberAdapter(private val data: ArrayList<Memder>) : RecyclerView.Adapter<MemberAdapter.MemberViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
       val  view:View=LayoutInflater.from(parent.context).inflate(R.layout.row_member_item,parent,false)
        return MemberViewHolder(view)
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        holder.tv.text=data[position].name
        holder.img.setImageResource(data[position].image)

        Log.e("ADAADDADDAD","Adddddddddddddd")
    }

    override fun getItemCount(): Int {
       return data.size
    }

    class MemberViewHolder(itemView: View) :ViewHolder(itemView){
       val tv:TextView=itemView.findViewById(R.id.textView)
        var img:ImageView=itemView.findViewById(R.id.imageView)
    }
}