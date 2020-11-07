package com.tcs.cardlessatm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuItemAdapter(private val menuItemList: ArrayList<MenuItem>, val itemClickListener: OnItemClickListener): RecyclerView.Adapter<MenuItemAdapter.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemAdapter.ItemHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
        return ItemHolder(v)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bindItems(menuItemList[position], itemClickListener)
    }

    override fun getItemCount(): Int {
        return menuItemList.size
    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(menuItem: MenuItem, clickListener: OnItemClickListener) {
            val menuIcon = itemView.findViewById(R.id.menu_icon) as ImageView
            val menuText  = itemView.findViewById(R.id.menu_text) as TextView
            menuIcon.setImageResource(menuItem.icon)
            menuText.text = menuItem.name

            itemView.setOnClickListener {
                clickListener.onItemClick(menuItem)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(menuItem: MenuItem)
    }

}