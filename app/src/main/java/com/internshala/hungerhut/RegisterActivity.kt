package com.internshala.hungerhut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    lateinit var txtName: EditText
    lateinit var emailAddress: EditText
    lateinit var mobileNumber: EditText
    lateinit var deliveryAddress: EditText
    lateinit var password: EditText
    lateinit var confirmPassword: EditText
    lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        txtName = findViewById(R.id.txtName)
        emailAddress = findViewById(R.id.emailAddress)
        mobileNumber = findViewById(R.id.mobileNumber)
        deliveryAddress = findViewById(R.id.deliveryAddress)
        password = findViewById(R.id.password)
        confirmPassword = findViewById(R.id.confirmPassword)
        btnRegister = findViewById(R.id.btnRegister)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Register Yourself"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    }
