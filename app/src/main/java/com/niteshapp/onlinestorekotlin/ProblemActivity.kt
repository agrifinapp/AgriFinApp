package com.niteshapp.onlinestorekotlin

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_problem.*

class ProblemActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problem)

        setTitle("Problems Shared")


        linearlayout1.setOnClickListener(){
            val signupIntent = Intent(this@ProblemActivity, SuggestionActivity::class.java)
            startActivity(signupIntent)
        }
        linearlayout2.setOnClickListener(){
            val signupIntent = Intent(this@ProblemActivity, SuggestionActivity::class.java)
            startActivity(signupIntent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.query_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item?.itemId == R.id.myHomeItem) {
            val intent = Intent(this, FarmerHomeActivty::class.java)
            startActivity(intent);
            finish()
        }
        if (item?.itemId == R.id.addQueryItem) {
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setTitle("Add New Query ")
            dialogBuilder.setMessage("By clicking here you will be adding new query.")
            dialogBuilder.setPositiveButton("OK", { dialog, whichButton ->


            })


            val b = dialogBuilder.create()
            b.show()
        }

        return super.onOptionsItemSelected(item)
    }
}
