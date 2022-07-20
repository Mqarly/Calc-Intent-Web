package com.example.malculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Buttonadd:Button
    lateinit var Buttonsubtract:Button
    lateinit var Buttonmultiply:Button
    lateinit var Buttondivide:Button
    lateinit var Edt_Fnum:EditText
    lateinit var Edt_Snum:EditText
    lateinit var Txt_Answer:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        Buttonadd=findViewById(R.id.Btn_Add)
        Buttonsubtract=findViewById(R.id.Btn_Subtract)
        Buttonmultiply=findViewById(R.id.Btn_Multiply)
        Buttondivide=findViewById(R.id.Btn_Divide)
        Edt_Fnum=findViewById(R.id.editTextNumber)
        Edt_Snum=findViewById(R.id.Edt_Snum)
        Txt_Answer=findViewById(R.id.Ans)

        Buttonadd.setOnClickListener {
            var firstnumber=Edt_Fnum.text.toString()
            var secondnum=Edt_Snum.text.toString()

            if (firstnumber.isEmpty() and secondnum.isEmpty()){
                Txt_Answer.text="Please fill in all fields"
            }else{
                var answer=firstnumber.toDouble() + secondnum.toDouble()
                Txt_Answer.text=answer.toString()
            }
        }

        Buttonsubtract.setOnClickListener {
            var firstnum=Edt_Fnum.text.toString()
            var secondnum=Edt_Snum.text.toString()

            if (firstnum.isEmpty() and secondnum.isEmpty()){
                Txt_Answer.text="Please fill in all fields"
            }else{
                var answer=firstnum.toDouble() - secondnum.toDouble()
                Txt_Answer.text=answer.toString()
            }
        }

        Buttonmultiply.setOnClickListener {
            var firstnum=Edt_Fnum.text.toString()
            var secondnum=Edt_Snum.text.toString()

            if (firstnum.isEmpty() and secondnum.isEmpty()){
                Txt_Answer.text="Please fill in all fields"
            }else{
                var answer=firstnum.toDouble() * secondnum.toDouble()
                Txt_Answer.text=answer.toString()
            }
        }

        Buttondivide.setOnClickListener {
            var firstnum=Edt_Fnum.text.toString()
            var secondnum=Edt_Snum.text.toString()

            if (firstnum.isEmpty() and secondnum.isEmpty()){
                Txt_Answer.text="Please fill in all fields"
            }else{
                var answer=firstnum.toDouble() / secondnum.toDouble()
                Txt_Answer.text=answer.toString()
            }
        }
    }
}