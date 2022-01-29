package com.ir.instagramfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.ir.instagramfragment.Adapters.AdapterPost
import com.ir.instagramfragment.Adapters.AdapterStories
import com.ir.instagramfragment.Class.DataPost
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {
    lateinit var root:View
    lateinit var arrayListImage: ArrayList<Int>
    lateinit var arrayListName: ArrayList<String>
    lateinit var arrayListPost: ArrayList<DataPost>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        root = inflater.inflate(R.layout.fragment_home, container, false)

        addPhotoToArrayList()

        val linerLayoutManager = LinearLayoutManager(this.context)
        linerLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        root.recyclerViewStories.layoutManager = linerLayoutManager
        val adapterStories = this.context?.let { AdapterStories(it, arrayListImage , arrayListName ) }
        root.recyclerViewStories.adapter = adapterStories

        val adapterPost = this.context?.let { AdapterPost(it, arrayListPost) }
        root.recyclerViewPost.adapter = adapterPost

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
        val photo10 = R.drawable.photo_10
        val photo11 = R.drawable.photo_1
        val photo12 = R.drawable.photo_12
        val photo13 = R.drawable.photo_13
        val photo14 = R.drawable.photo_14
        val photo15 = R.drawable.photo_15
        val photo16 = R.drawable.photo_16

        arrayListImage = ArrayList()
        arrayListName = ArrayList()
        arrayListPost = ArrayList()

        arrayListImage.add(photo1)
        arrayListImage.add(photo2)
        arrayListImage.add(photo3)
        arrayListImage.add(photo4)
        arrayListImage.add(photo5)
        arrayListImage.add(photo6)
        arrayListImage.add(photo7)
        arrayListImage.add(photo8)
        arrayListImage.add(photo9)
        arrayListImage.add(photo10)
        arrayListImage.add(photo11)
        arrayListImage.add(photo12)
        arrayListImage.add(photo13)
        arrayListImage.add(photo14)
        arrayListImage.add(photo15)
        arrayListImage.add(photo16)

        arrayListName.add("Your Story")
        arrayListName.add("image_2")
        arrayListName.add("image_3")
        arrayListName.add("image_4")
        arrayListName.add("image_5")
        arrayListName.add("image_6")
        arrayListName.add("image_7")
        arrayListName.add("image_8")
        arrayListName.add("image_9")
        arrayListName.add("image_10")
        arrayListName.add("image_11")
        arrayListName.add("image_12")
        arrayListName.add("image_13")
        arrayListName.add("image_14")
        arrayListName.add("image_15")
        arrayListName.add("image_16")

        for (i in 0 until  arrayListName.size) {
            arrayListPost.add(DataPost(arrayListName[i] , arrayListImage[i] , "Description" , "100"))
        }
    }

}