package com.tcs.cardlessatm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuItemAdapter(val menuItemList: ArrayList<MenuItem>): RecyclerView.Adapter<MenuItemAdapter.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemAdapter.ItemHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
        return ItemHolder(v)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bindItems(menuItemList[position])
    }

    override fun getItemCount(): Int {
        return menuItemList.size
    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        fun bindItems(menuItem: MenuItem) {
            val menuIcon = itemView.findViewById(R.id.menu_icon) as ImageView
            val menuText  = itemView.findViewById(R.id.menu_text) as TextView
            menuIcon.setImageResource(menuItem.icon)
            menuText.text = menuItem.name
        }

        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }
    }

}