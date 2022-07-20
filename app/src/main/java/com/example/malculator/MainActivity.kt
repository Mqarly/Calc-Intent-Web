package com.example.malculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var Buttoncalc:Button ?=null
    var Buttonintent:Button ?=null
    var Buttonweb:Button ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttoncalc=findViewById(R.id.Btn_Calc)
        Buttonintent=findViewById(R.id.Btn_intent)
        Buttonweb=findViewById(R.id.Btn_web)

        Buttoncalc!!.setOnClickListener {
            val intent=Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
        }
        Buttonintent!!.setOnClickListener {
            val intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }
        Buttonweb!!.setOnClickListener {
            val web=Intent(this,WebActivity::class.java)
            startActivity(web)
        }
    }
}