package com.tcs.cardlessatm

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.textfield.TextInputLayout

class AmountDepositActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amount_deposit_layout)

        val toolbar = findViewById<Toolbar>(R.id.tool_bar)
        val toolbarTitle = toolbar.findViewById<TextView>(R.id.toolbar_title)
        toolbarTitle.text = "Deposit Amount"
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false);

        val textField = findViewById<TextInputLayout>(R.id.account_types)
        val items = listOf("Checking", "Savings")
        val adapter = ArrayAdapter(this, R.layout.account_type_item, items)
        (textField.editText as? AutoCompleteTextView)?.setAdapter(adapter)

        val submitButton = findViewById<Button>(R.id.btn_submit)
        submitButton.setOnClickListener {

            intent = Intent(this, SuccessScreen::class.java)
            intent.putExtra("screen", "Deposit Screen")
            startActivity(intent)
        }
    }
}