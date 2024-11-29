package com.example.recyclestaff

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StuffAdapter(private val dataset:ArrayList<Stuff>):RecyclerView.Adapter<StuffAdapter.ViewHolder>() {

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val firstname: TextView = view.findViewById(R.id.firstname)
        val name: TextView =view.findViewById(R.id.name)
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater
            .from(viewGroup.context)
            .inflate(R.layout.item_stuff,viewGroup,false)
        return ViewHolder(view)
    }
    //Включает в себя ввод данных в элемент через viewHolder
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val currentItem = dataset[position]
        viewHolder.name.text = currentItem.name
        viewHolder.firstname.text = currentItem.firstname
    }

    // Возвращает общее количество элементов в списке
    override fun getItemCount()=dataset.size
}