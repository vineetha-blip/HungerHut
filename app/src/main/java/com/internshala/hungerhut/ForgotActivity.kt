package com.internshala.hungerhut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class ForgotActivity : AppCompatActivity() {

    lateinit var appLogo: ImageView
    lateinit var enterDescription: TextView
    lateinit var mobileNumber: EditText
    lateinit var emailAddress: EditText
    lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)

        appLogo = findViewById(R.id.appLogo)
        enterDescription = findViewById(R.id.enterDescription)
        mobileNumber = findViewById(R.id.mobileNumber)
        emailAddress = findViewById(R.id.emailAddress)
        btnNext = findViewById(R.id.btnNext)
    }
}