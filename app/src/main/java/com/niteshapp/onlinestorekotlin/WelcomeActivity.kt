package com.niteshapp.onlinestorekotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.paypal.android.sdk.payments.LoginActivity
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


        btnWelcome.setOnClickListener(){

            val intent = Intent(this@WelcomeActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

}