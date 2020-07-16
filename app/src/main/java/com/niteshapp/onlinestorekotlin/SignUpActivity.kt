package com.niteshapp.onlinestorekotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_signup.*

class SignUpActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        setTitle("SignUpActivity")


        btnSignUpLogin.setOnClickListener(){
            val signupIntent = Intent(this@SignUpActivity, MainActivity::class.java)
            startActivity(signupIntent)
        }

        btnSignUpSignUp.setOnClickListener(){

            val signupIntent = Intent(this@SignUpActivity, FarmerHomeActivty::class.java)
            startActivity(signupIntent)
        }
    }
}
