package com.example.foodorder

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.RatingBar;
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ch1 = findViewById<View>(R.id.checkBox) as CheckBox
        var ch2 = findViewById<View>(R.id.checkBox2) as CheckBox
        var rate1 = findViewById<View>(R.id.rate1) as TextView
        var rate2 = findViewById<View>(R.id.rate2) as TextView
        var quantity1 = findViewById<View>(R.id.q1) as EditText
        var quantity2 = findViewById<View>(R.id.q2) as EditText
        var bill = findViewById<View>(R.id.bill) as TextView
        var makebill = findViewById<View>(R.id.button) as Button
        var enteredName = findViewById<View>(R.id.editText2) as EditText
        var entername = findViewById<View>(R.id.button2) as Button
        var name = findViewById<View>(R.id.name) as TextView
        var rBar = findViewById(R.id.ratingBar2) as RatingBar
        var ratingtext = findViewById<View>(R.id.editText3) as TextView
        var display = findViewById<View>(R.id.button3) as Button

        entername.setOnClickListener(View.OnClickListener {
            if (enteredName == null) {
                name.text = "Welcome Guest"
            }
            name.text = "Welcome " + enteredName.text.toString()

        })

        makebill.setOnClickListener(View.OnClickListener {
            var total = 0
            bill.text = "BILL\nMenu\t\t\t\t\tAmount\n"
            if (ch1.isChecked) {
                total = total + rate1.text.toString().toInt() * quantity1.text.toString().toInt()
            }
            if (ch2.isChecked) {
                total = total + rate2.text.toString().toInt() * quantity2.text.toString().toInt()
            }
            bill.text = "Total Bill= " + total.toString()
        })

        val rating = rBar.getRating()
        display.setOnClickListener(View.OnClickListener {
            if(rating >= 1 && rating <=2) {
                    ratingtext.text = "We are sorry. We will improve."
                }
            else if(rating > 2 && rating <=4) {
                    ratingtext.text = "Glad you liked it!" }
            else {
                    ratingtext.text = "We are happy you enjoyed our service"
                }
            })
    }
}










