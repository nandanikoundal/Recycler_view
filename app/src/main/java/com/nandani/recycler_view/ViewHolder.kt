package com.nandani.recycler_view

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
    var tv1=view.findViewById<TextView>(R.id.tv1)
    var tv2=view.findViewById<TextView>(R.id.tv2)

}