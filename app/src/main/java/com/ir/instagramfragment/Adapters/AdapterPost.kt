package com.ir.instagramfragment.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ir.instagramfragment.Class.DataPost
import com.ir.instagramfragment.R
import kotlinx.android.synthetic.main.item_post.view.*

class AdapterPost(val context: Context, private val arrayList: ArrayList<DataPost>) :
    RecyclerView.Adapter<AdapterPost.VH>() {

    inner class VH(var itemRV: View) : RecyclerView.ViewHolder(itemRV) {
        @SuppressLint("SetTextI18n")
        fun onBind(
            stringProfileName: String,
            intPostImage: Int,
            stringDescription: String,
            stringViewsCount: String,
        ) {
            itemRV.image_post_profile.setImageResource(intPostImage)
            itemRV.image_post.setImageResource(intPostImage)
            itemRV.tv_profile_name.text = stringProfileName
            itemRV.tv_views.text = "$stringViewsCount like"
            itemRV.tv_description.text = "$stringProfileName $stringDescription"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(arrayList[position].stringProfileName,
            arrayList[position].intPostImage,
            arrayList[position].stringDescription,
            arrayList[position].stringViewsCount)
    }

    override fun getItemCount(): Int = arrayList.size

}