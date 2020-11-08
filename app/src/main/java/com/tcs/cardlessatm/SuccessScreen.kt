package com.tcs.cardlessatm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class SuccessScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success_screen)

        val toolbar = findViewById<Toolbar>(R.id.tool_bar)
        val toolbarTitle = toolbar.findViewById<TextView>(R.id.toolbar_title)
        toolbarTitle.text = resources.getString(R.string.success_screen_title)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)



        val successMsg = findViewById<TextView>(R.id.success_msg)
        val screenName = intent.getStringExtra("screen")
        if(screenName.equals("Deposit Screen")) {
            successMsg.text = resources.getString(R.string.deposit_success_message)
        } else if(screenName.equals("Withdrawal Screen")) {
            successMsg.text = resources.getString(R.string.withdrawal_success_message)
        } else if(screenName.equals("Transfer Screen")) {

        } else if(screenName.equals("Balance Enquiry Screen")) {

        }
        val submitButton = findViewById<Button>(R.id.btn_end)
        submitButton.setOnClickListener {
            intent = Intent(this, BankingMenuActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
    }

}