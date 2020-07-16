package com.niteshapp.onlinestorekotlin

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.paypal.android.sdk.payments.LoginActivity
import kotlinx.android.synthetic.main.activity_farmer_home.*

class FarmerHomeActivty: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_farmer_home)
        setTitle("")

        tvFarmerHomeMentha.setOnClickListener(){

            val signupIntent = Intent(this@FarmerHomeActivty, ProblemActivity::class.java)
            startActivity(signupIntent)
        }

        tvFarmerHomeWheat.setOnClickListener(){

            val signupIntent = Intent(this@FarmerHomeActivty, ProblemActivity::class.java)
            startActivity(signupIntent)
        }

        tvFarmerHomePotato.setOnClickListener(){

            val signupIntent = Intent(this@FarmerHomeActivty, ProblemActivity::class.java)
            startActivity(signupIntent)
        }

        tvFarmerHomeCotton.setOnClickListener(){

            val signupIntent = Intent(this@FarmerHomeActivty, ProblemActivity::class.java)
            startActivity(signupIntent)
        }

        tvFarmerHomeSugarcane.setOnClickListener(){

            val signupIntent = Intent(this@FarmerHomeActivty, ProblemActivity::class.java)
            startActivity(signupIntent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.farmerhome_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item?.itemId == R.id.addCropItem) {
            equipementItemDialog("Add Crop", "Here you will be adding for crops")

        }
        else if (item?.itemId == R.id.myCreditItem) {
            myCreditsItemDialog()
        }
        else if (item?.itemId == R.id.myMandiItem) {
            myMandiItemDialog()
        }
        else if (item?.itemId == R.id.PestisideItem) {
            equipementItemDialog("Pestiside", "Here you will be seaching for Pestiside")
        }
        else if (item?.itemId == R.id.fertilizerItem) {
            equipementItemDialog("Fertilizer", "Here you will be seaching for Fertilizer")
        }
        else if (item?.itemId == R.id.equipementItem) {
            equipementItemDialog("Equipment", "Here you will be seaching for equipment")
        }
        else if (item?.itemId == R.id.logoutItem) {
            val signupIntent = Intent(this@FarmerHomeActivty, LoginActivity::class.java)
            startActivity(signupIntent)        }





        return super.onOptionsItemSelected(item)
    }

    fun equipementItemDialog(srt1: String,srt2: String) {
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setTitle(srt1)
        dialogBuilder.setMessage(srt2)
        dialogBuilder.setPositiveButton("ok", { dialog, whichButton ->

            val intent = Intent(this, MySearchActivity::class.java)
            startActivity(intent);
        })
        val b = dialogBuilder.create()
        b.show()
    }



    fun myCreditsItemDialog() {
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setTitle("Credits")
        dialogBuilder.setMessage("You will unlock your credit benefits after purchasing Rs 2000.")
        dialogBuilder.setPositiveButton("ok", { dialog, whichButton ->

            val intent = Intent(this, MyCreditActivity::class.java)
            startActivity(intent);
        })


        val b = dialogBuilder.create()
        b.show()
    }

    fun myMandiItemDialog() {
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setTitle("Mandi")
        dialogBuilder.setMessage("People near you will be able to see your content for purchasing at your place.")
        dialogBuilder.setPositiveButton("OK", { dialog, whichButton ->

            val intent = Intent(this, MyMandiActivity::class.java)
            startActivity(intent);
        })


        val b = dialogBuilder.create()
        b.show()
    }

}