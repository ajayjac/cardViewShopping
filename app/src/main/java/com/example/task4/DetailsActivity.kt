package com.example.task4

import android.content.Intent
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





        var callbtn : Button?

        callbtn = findViewById(R.id.btn2d)
        val callno: Long

        callno = 7907965884

        callbtn.setOnClickListener {
            // getting phone number from edit text and changing it to String
            val phone_number = callno.toString()

            // Getting instance of Intent with action as ACTION_CALL
            val phone_intent = Intent(Intent.ACTION_DIAL)

            // Set data of Intent through Uri by parsing phone number
            phone_intent.data = Uri.parse("tel:$phone_number")

            // start Intent
            startActivity(phone_intent)
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