package com.nandani.recycler_view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.text.ParsePosition



class RecyclerClass: RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var initView = LayoutInflater.from(parent.context).inflate(
            R.layout.layout_recycler, parent, false
        )
        return ViewHolder(initView)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}
