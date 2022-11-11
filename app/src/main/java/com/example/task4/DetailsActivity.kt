package com.example.task4

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class DetailsActivity : AppCompatActivity() {
    lateinit var webviewbtn : Button
    lateinit var backbtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)


        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        webviewbtn = findViewById(R.id.share_btn)
        backbtn = findViewById(R.id.back_btn)





        val btn2d : Button?

        val btn3d : Button?

        btn2d = findViewById(R.id.btn2d)
        btn3d = findViewById(R.id.btn3d)
        btn2d.setOnClickListener {
            btn2d.setBackgroundColor(Color.BLUE)
            btn3d.setBackgroundColor(Color.DKGRAY)


        }
        btn3d.setOnClickListener {
            btn3d.setBackgroundColor(Color.BLUE)
            btn2d.setBackgroundColor(Color.DKGRAY)


        }


        backbtn.setOnClickListener {

            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        webviewbtn.setOnClickListener {
            val i = Intent(this, WebViewActivity::class.java)
            startActivity(i)
        }

        imageList.add(SlideModel("https://freepngimg.com/thumb/apartment/26158-4-apartment-hd.png","Apartment front view"))
        imageList.add(SlideModel("https://freepngimg.com/thumb/apartment/27728-8-apartment-file.png","Apartment left view"))
        imageList.add(SlideModel("https://freepngimg.com/thumb/apartment/133140-picture-apartment-free-transparent-image-hq.png","Apartment Rightview"))
        imageList.add(SlideModel("https://freepngimg.com/thumb/apartment/133090-apartment-png-image-high-quality.png","Apartment Top view"))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)


    }
}