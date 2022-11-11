package com.example.task4

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter( val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    val callno: Long = 79079658884

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(ItemsViewModel.image)

        // sets the text to the textview from our itemHolder class
        holder.itemcode.text = ItemsViewModel.itemcode

        holder.amount.text = ItemsViewModel.amount

        holder.location.text = ItemsViewModel.location

        holder.room.text = ItemsViewModel.room.toString()

        holder.bath.text = ItemsViewModel.bath.toString()

        holder.sqft.text = ItemsViewModel.sqft.toString()

        holder.dateval.text = ItemsViewModel.dateval


        holder.cardview.setOnClickListener(View.OnClickListener {
            val context= holder.cardview.context
            val intent = Intent(context, DetailsActivity::class.java)
            context.startActivity(intent)
        })


        holder.callbtn.setOnClickListener {
            val context=holder.callbtn.context
            val phone_number = callno.toString()

            // Getting instance of Intent with action as ACTION_CALL
            val phone_intent = Intent(Intent.ACTION_DIAL)

            // Set data of Intent through Uri by parsing phone number
            phone_intent.data = Uri.parse("tel:$phone_number")

            // start Intent
            context.startActivity(phone_intent)
        }


    }


    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image)
        val itemcode: TextView = itemView.findViewById(R.id.itemcodetxt)
        val amount: TextView = itemView.findViewById(R.id.item_amount_txt)
        val location: TextView = itemView.findViewById(R.id.locationtxt)
        val room: TextView = itemView.findViewById(R.id.roomtxt)
        val bath: TextView = itemView.findViewById(R.id.bathtxt)
        val sqft: TextView = itemView.findViewById(R.id.sqft_txt)
        val callbtn: TextView = itemView.findViewById(R.id.callbtn)
        val dateval: TextView = itemView.findViewById(R.id.datetxt)
        val cardview: CardView = itemView.findViewById(R.id.cardview)


    }
}


