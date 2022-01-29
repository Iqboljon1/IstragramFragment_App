package com.ir.instagramfragment.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ir.instagramfragment.R
import kotlinx.android.synthetic.main.item_circle_image.view.*

class AdapterStories(val context: Context, private val arrayListImage: ArrayList<Int> , private val arrayListName: ArrayList<String>) :
    RecyclerView.Adapter<AdapterStories.VH>() {

    inner class VH(var itemRV: View) : RecyclerView.ViewHolder(itemRV) {
        fun onBind(int: Int , string: String) {
               itemRV.profile_image.setImageResource(int)
               itemRV.profile_name.text = string
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context).inflate(R.layout.item_circle_image, parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(arrayListImage[position] , arrayListName[position])

    }

    override fun getItemCount(): Int = arrayListImage.size

}