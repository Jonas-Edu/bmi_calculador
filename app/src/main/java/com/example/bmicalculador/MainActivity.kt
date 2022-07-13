package com.example.bmicalculador

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

     private lateinit var weightEditText: EditText
     private lateinit var heightEditText: EditText
     private lateinit var btn: Button
     private lateinit var infotxt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                weightEditText = findViewById(R.id.weightEditxt)
                heightEditText = findViewById(R.id.heightEdittxt)
                btn = findViewById(R.id.btn)
                infotxt = findViewById(R.id.infoTxt)

                btn.setOnClickListener{
                    calculate() }
            }

    fun calculate(){

        val mass = weightEditText.text.toString()
        val height = heightEditText.text.toString()

        if(mass== "" || height ==""){
            Toast.makeText(this, "You need to inform both values!", Toast.LENGTH_LONG).show()
        }else {
            val bmi = BodyMassIndex(height.toDouble(), mass.toDouble())
            val index = bmi.getIndex()
            val indexFormated = String.format("%.2f", index)
            val category = bmi.getCategory()
            infotxt.text = "${indexFormated} - ${category}"
        }

    }

}