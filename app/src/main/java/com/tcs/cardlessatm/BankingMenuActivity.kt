package com.tcs.cardlessatm

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BankingMenuActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banking_menu_layout)

        val toolbar = findViewById<Toolbar>(R.id.tool_bar)
        val toolbarTitle = toolbar.findViewById<TextView>(R.id.toolbar_title)
        toolbarTitle.text = resources.getString(R.string.banking_menu_title)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false);


        val menuRecyclerView = findViewById<RecyclerView>(R.id.menu_recyclerView)
        menuRecyclerView.layoutManager = GridLayoutManager(this, 1)

        val menuItemList = ArrayList<MenuItem>()
        menuItemList.add(MenuItem(R.drawable.ic_atm_machine, "Amount Withdraw"))
        menuItemList.add(MenuItem(R.drawable.ic_balance_enquiry, "Balance Enquiry"))
        menuItemList.add(MenuItem(R.drawable.ic_atm_deposit, "Amount Deposit"))
        menuItemList.add(MenuItem(R.drawable.ic_send_money, "Transfer"))

        val adapter = MenuItemAdapter(menuItemList)
        menuRecyclerView.adapter = adapter
    }
}