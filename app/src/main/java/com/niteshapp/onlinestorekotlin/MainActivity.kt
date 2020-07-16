package com.niteshapp.onlinestorekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_signup.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("LoginActivity")


        btnLoginSignUp.setOnClickListener(){

            Toast.makeText(this@MainActivity, "Please go on Login Page by clicking Login!", Toast.LENGTH_LONG).show()

           val signupIntent = Intent(this@MainActivity, SignUpActivity::class.java)
            startActivity(signupIntent)
            finish()
        }

        btnLoginLogin.setOnClickListener(){

            val signupIntent = Intent(this@MainActivity, FarmerHomeActivty::class.java)
            startActivity(signupIntent)
            finish()


        }
        btnLoginAsOthers.setOnClickListener(){

            val signupIntent = Intent(this@MainActivity, OthersActivity::class.java)
            startActivity(signupIntent)
            finish()


        }
    }
}