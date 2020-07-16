package com.niteshapp.onlinestorekotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_others.*

class OthersActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_others)


        btnoOtherProceed.setOnClickListener(){
            if (radioButton.isChecked){

                Toast.makeText(this@OthersActivity, radioButton.text.toString(), Toast.LENGTH_LONG).show()

                val signupIntent = Intent(this@OthersActivity, VenderActivity::class.java)
                startActivity(signupIntent)

            }else if (radioButton2.isChecked){
                Toast.makeText(this@OthersActivity, radioButton2.text.toString(), Toast.LENGTH_LONG).show()

                val signupIntent = Intent(this@OthersActivity, EnterpriseActivity::class.java)
                startActivity(signupIntent)

            }else if (radioButton3.isChecked){
                Toast.makeText(this@OthersActivity, radioButton3.text.toString(), Toast.LENGTH_LONG).show()


                val signupIntent = Intent(this@OthersActivity, BloggerActivity::class.java)
                startActivity(signupIntent)
            }
        }
    }
}
