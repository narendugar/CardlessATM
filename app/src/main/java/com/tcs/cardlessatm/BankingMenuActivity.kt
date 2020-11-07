package com.tcs.cardlessatm

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BankingMenuActivity: AppCompatActivity(), MenuItemAdapter.OnItemClickListener {

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

        val adapter = MenuItemAdapter(menuItemList, this)
        menuRecyclerView.adapter = adapter
    }

    override fun onItemClick(menuItem: MenuItem) {
        val intent: Intent
        when(menuItem.name) {
            "Amount Withdraw" -> {
                intent = Intent(this, AmountWithdrawal::class.java)
                startActivity(intent)
            }
            "Balance Enquiry" -> {
                intent = Intent(this, AmountWithdrawal::class.java)
                startActivity(intent)
            }
            "Amount Deposit" -> {
                intent = Intent(this, AmountWithdrawal::class.java)
                startActivity(intent)
            }
            "Transfer" -> {
                intent = Intent(this, AmountWithdrawal::class.java)
                startActivity(intent)
            }
        }
    }
}