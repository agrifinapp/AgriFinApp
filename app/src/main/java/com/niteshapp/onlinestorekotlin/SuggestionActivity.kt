package com.niteshapp.onlinestorekotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_suggestion.*

class SuggestionActivity: AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_suggestion)
            setTitle("Suggestion")


            btnPlaceOrder1.setOnClickListener(){

                showNewNameDialog()
            }
        }

    fun showNewNameDialog() {
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setTitle("Your Order details")
        dialogBuilder.setMessage("Plesse confirm your order")
        dialogBuilder.setPositiveButton("order", { dialog, whichButton ->

            val intent = Intent(this, OderPlacingdActivity::class.java)
            startActivity(intent);
        })

        dialogBuilder.setNegativeButton("Cancel", { dialog, whichButton ->
            //pass
        })
        val b = dialogBuilder.create()
        b.show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.home_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item?.itemId == R.id.myHomeItem) {
            val intent = Intent(this, FarmerHomeActivty::class.java)
            startActivity(intent);
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
