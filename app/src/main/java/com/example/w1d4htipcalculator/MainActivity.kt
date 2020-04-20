package com.example.w1d4htipcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.floor
import kotlin.math.round

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

  fun pay (view: View) {

      val amount = findViewById<EditText>(R.id.amtTxt)

      val amt :Float=amount.text.toString().toFloat()
      var total:Float = amt.toFloat()
      total *= 1.10f
      val tipPercentage="10%"
      val tipTotal = amt*0.10f



      val viewTipPercentage = findViewById<TextView>(R.id.textView4).apply{
          text=tipPercentage
      }

      val viewTipTotal = findViewById<TextView>(R.id.textView3).apply {
          text=tipTotal.toString()
      }


      val viewAmt = findViewById<TextView>(R.id.totalAmt).apply{
          text=total.toString()
      }


  }

    fun pay2 (view: View) {
        val amount = findViewById<EditText>(R.id.amtTxt)
        val amt :Float=amount.text.toString().toFloat()
        var total:Float = amt.toFloat()
        total *= 1.15f
        val tipPercentage="15%"
        val tipTotal = amt*0.15f

        val viewTipPercentage = findViewById<TextView>(R.id.textView4).apply{
            text=tipPercentage
        }

        val viewTipTotal = findViewById<TextView>(R.id.textView3).apply {
            text=tipTotal.toString()
        }

        val viewAmt = findViewById<TextView>(R.id.totalAmt).apply{
            text=total.toString()
        }
    }

    fun pay3 (view: View) {
        val amount = findViewById<EditText>(R.id.amtTxt)
        val amt :Float=amount.text.toString().toFloat()
        var total:Float = amt.toFloat()
        total *= 1.20f
        val tipPercentage="20%"
        val tipTotal = amt*0.20f

        val viewTipPercentage = findViewById<TextView>(R.id.textView4).apply{
            text=tipPercentage
        }

        val viewTipTotal = findViewById<TextView>(R.id.textView3).apply {
            text=tipTotal.toString()
        }


        val viewAmt = findViewById<TextView>(R.id.totalAmt).apply{
            text=total.toString()
        }
    }
}
