package com.example.task4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*//checkbox
        var cbHeart: CheckBox
        cbHeart = findViewById(R.id.checkBox)*/
//        val callbtn: Button
//



        // getting the recyclerview by its id
        recyclerView = findViewById(R.id.recyclerview1)

        // this creates a vertical layout Manager
        recyclerView.layoutManager = LinearLayoutManager(this)
        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
            data.add(
                ItemsViewModel(
                    R.drawable.hotel,
                    "CB-000-2343",
                    "1000",
                    "Ernakulam",
                    50,
                    90,
                    2000,
                    "JAN 31"
                )
            )

        }


        // This will pass the ArrayList to our Adapter
        var adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter


    }


}


