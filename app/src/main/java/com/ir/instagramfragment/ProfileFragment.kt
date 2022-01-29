package com.ir.instagramfragment

import android.os.Bundle
import android.service.media.MediaBrowserService
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ir.instagramfragment.Adapters.AdapterProfilePosts
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.view.*

class ProfileFragment : Fragment() {
    lateinit var root: View
    lateinit var arrayListProfilePosts: ArrayList<Int>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        root = inflater.inflate(R.layout.fragment_profile, container, false)
        arrayListProfilePosts = ArrayList()
        addPhotoToArrayList()
        val adapter = this.context?.let { AdapterProfilePosts(it , arrayListProfilePosts) }
        root.recyclerViewPosts.adapter = adapter
        return root
    }

    private fun addPhotoToArrayList() {
        val photo1 = R.drawable.photo_11
        val photo2 = R.drawable.photo_2
        val photo3 = R.drawable.photo_3
        val photo4 = R.drawable.photo_4
        val photo5 = R.drawable.photo_5
        val photo6 = R.drawable.photo_6
        val photo7 = R.drawable.photo_7
        val photo8 = R.drawable.photo_8
        val photo9 = R.drawable.photo_9


        arrayListProfilePosts.add(photo1)
        arrayListProfilePosts.add(photo2)
        arrayListProfilePosts.add(photo3)
        arrayListProfilePosts.add(photo4)
        arrayListProfilePosts.add(photo5)
        arrayListProfilePosts.add(photo6)
        arrayListProfilePosts.add(photo7)
        arrayListProfilePosts.add(photo8)
        arrayListProfilePosts.add(photo9)
    }

}