package com.example.solarsystem.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.solarsystem.R  // R.layout
import com.example.solarsystem.data.DataSource
import com.example.solarsystem.model.Planet
// You have to check imported files to understand the code better

// Adapter is a general class that need customization from the programmer to fit his/her purposes and needs
// So, ItemAdapter class is our customized Adapter
// important NOTE: in this class/file, we never handle with RecycleView but with Adapter and ViewHolder

class ItemAdapter(
    val context: Context,    // Context gives access to any library, from outside the android studio, to reach any file need
    val dataSource: List<Planet>  //End class parameters
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    // ItemViewHolder is our customized ViewHolder
    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        // ItemViewHolder class' task is working as a container for all necessary model views (model package & item_planet.xml file in the layout folder)
        // class parameter is a variable from "View" type (class), which is the superclass of all view members (textView, imageView ...  etc)

        // containing views and binding them:
        val numberTextView : TextView = view.findViewById(R.id.tv_number)      // contain view 1 : textView
        val planetImageView : ImageView = view.findViewById(R.id.iv_planet)    // contain view 2 : imageView
        val moonTextView : TextView = view.findViewById(R.id.tv_moons)         // contain view 3 : TextView
        val sizeTextView : TextView = view.findViewById(R.id.tv_size)          // contain view 4 : TextView
        val arabicTextView : TextView = view.findViewById(R.id.tv_arabic)      // contain view 5 : TextView

        // now, all views (UI items) are bound with our codes (backend task) as variables, but not with RecycleView yet
        // NOTE: you can use view binding instead of using findViewById() method (It's up to you)

    }// End nested class

    // try to understand this function
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)  //why not "context.parent.blablabla" ??
            .inflate(R.layout.item_planet, parent, false)



        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // this function task is updating info on UI items

        // update our customized ViewHolder (ItemViewHolder) data by binding with our database values
        holder.numberTextView.text = context.resources.getString( dataSource[position].Pnumber )
        holder.planetImageView.setImageResource( dataSource[position].image )
        holder.moonTextView.text = context.resources.getString( dataSource[position].moon )  //why using .resource in "context.resource...." ??
        holder.sizeTextView.text = context.resources.getString( dataSource[position].size )
        holder.arabicTextView.text = context.resources.getString( dataSource[position].arabic )

        // why in android developer used " ....getString( dataSource[position].getResourceId )" ?
        // why " ....(....getResourceId) ??


    }// End onBindingViewHolder function

    override fun getItemCount(): Int = dataSource.size


}// End ItemAdapter class