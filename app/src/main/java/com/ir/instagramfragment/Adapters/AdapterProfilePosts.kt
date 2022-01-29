package com.ir.instagramfragment.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ir.instagramfragment.R
import kotlinx.android.synthetic.main.item_profile_posts.view.*

class AdapterProfilePosts(val context: Context, private val arrayListProfilePosts: ArrayList<Int>) :
    RecyclerView.Adapter<AdapterProfilePosts.VH>() {

    inner class VH(var itemRV: View) : RecyclerView.ViewHolder(itemRV) {
        fun onBind(int: Int) {
            itemRV.image_profilePosts.setImageResource(int)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context).inflate(R.layout.item_profile_posts, parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(arrayListProfilePosts[position])

    }

    override fun getItemCount(): Int = arrayListProfilePosts.size

}