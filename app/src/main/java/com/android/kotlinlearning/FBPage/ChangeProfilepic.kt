package com.android.kotlinlearning.FBPage

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.kotlinlearning.R
import com.android.kotlinlearning.databinding.FragmentChangepicBinding

//import com.github.dhaval2404.imagepicker.ImagePicker
//import kotlinx.android.synthetic.main.fragment_changepic.*

class ChangeProfilepic : Fragment(R.layout.fragment_changepic) {
    private var binding: FragmentChangepicBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChangepicBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding?.cameraButton?.setOnClickListener {
            //ImagePicker.with(this).cameraOnly().crop().start()
        }
        binding?.galleryButton?.setOnClickListener() {
            //ImagePicker.with(this).galleryOnly().galleryMimeTypes(arrayOf("image/*")).crop()
              //  .maxResultSize(400, 400).start()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //if (requestCode==ImagePicker.REQUEST_CODE && resultCode==Activity.RESULT_OK)
         //   imagepicker_imageView.setImageURI(data?.data)
    }

    fun setImageBitmap(bitmap: Bitmap?) {

    }
}