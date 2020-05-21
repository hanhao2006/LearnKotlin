package com.example.tipcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            btnCal.setOnClickListener{

                println("hi")
                var b : Double = EditTextBill.text.toString().toDouble()
                var t : Double = EditTextTip.text.toString().toDouble()

                var bill = Bill(b,t)
                var result = bill.calTip()
                TextViewResult.text = bill.calTip().toString()

            }



    }
}
