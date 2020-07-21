package com.internshala.hungerhut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request

import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.internshala.hungerhut.util.ConnectionManager
import org.json.JSONObject
import java.lang.Exception

class LoginActivity : AppCompatActivity() {

    lateinit var mobileNumber: EditText
    lateinit var password: EditText
    lateinit var btnLogin: Button
    lateinit var forgotPassword: TextView
    lateinit var accountSignUp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mobileNumber = findViewById(R.id.mobileNumber)
        password = findViewById(R.id.password)
        btnLogin = findViewById(R.id.btnLogin)
        forgotPassword = findViewById(R.id.forgotPassword)
        accountSignUp = findViewById(R.id.accountSignUp)

        
        accountSignUp.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
        }

        forgotPassword.setOnClickListener {
            startActivity(Intent(this@LoginActivity, ForgotActivity::class.java))

        }


            val url = "http://13.235.250.119/v2/login/fetch_result/"
            val queue = Volley.newRequestQueue(this@LoginActivity)
            val jsonParams = JSONObject()
            jsonParams.put("mobile_number", "9020519961")
            jsonParams.put("password", "12345")

            if (ConnectionManager().checkConnectivity(this@LoginActivity)) {

                val jsonRequest =
                    object: JsonObjectRequest(Request.Method.POST, url, jsonParams, Response.Listener {
                        try {
                            Toast.makeText(
                                this@LoginActivity,"toast_check2",
                                Toast.LENGTH_SHORT
                            ).show()
                            val success = it.getBoolean("success")

                            if (success) {
                                Toast.makeText(
                                    this@LoginActivity,
                                    "activity",
                                    Toast.LENGTH_SHORT
                                ).show()
                                startActivity(Intent(this@LoginActivity, MainActivity::class.java))


                            }

                        } catch (e: Exception) {

                        }

                    }, Response.ErrorListener {

                    }) {
                        override fun getHeaders(): MutableMap<String, String> {
                            val headers = HashMap<String, String>()
                            headers["Content-type"] = "application/json"
                            headers["token"] = "6a4ffe538c344c"
                            return headers
                        }
                    }

                queue.add(jsonRequest)
            }

        }

    }













