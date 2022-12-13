package com.example.a2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Clear.setOnClickListener {
            Subject1.setText("")
            Subject2.setText("")
            Subject3.setText("")
            Subject4.setText("")
            Subject5.setText("")
            Credit1.setText("")
            Credit2.setText("")
            Credit3.setText("")
            Credit4.setText("")
            Credit5.setText("")
            Point1.setText("")
            Point2.setText("")
            Point3.setText("")
            Point4.setText("")
            Point5.setText("")
            Total.setText("")
            GPA.setText("")
        }
        Ok.setOnClickListener {
            var Subje1 = Subject1.text.toString()
            var Subje2 = Subject2.text.toString()
            var Subje3 = Subject3.text.toString()
            var Subje4 = Subject4.text.toString()
            var Subje5 = Subject5.text.toString()



            var Cred1 = Credit1.text.toString()
            var Cred2 = Credit2.text.toString()
            var Cred3 = Credit3.text.toString()
            var Cred4 = Credit4.text.toString()
            var Cred5 = Credit5.text.toString()

            if(Subje1 == ""){
                Toast.makeText(getApplicationContext(),"Please Input all number",Toast.LENGTH_SHORT).show();
            } else {
                Credit1.setText("")
            }

            var Poi1 = Point1.text.toString()
            var Poi2 = Point2.text.toString()
            var Poi3 = Point3.text.toString()
            var Poi4 = Point4.text.toString()
            var Poi5 = Point5.text.toString()



            var Sub1 = Cred1.toDouble() * Poi1.toDouble()
            var Sub2 = Cred2.toDouble() * Poi2.toDouble()
            var Sub3 = Cred3.toDouble() * Poi3.toDouble()
            var Sub4 = Cred4.toDouble() * Poi4.toDouble()
            var Sub5 = Cred5.toDouble() * Poi5.toDouble()
            var Tota = Cred1.toDouble() + Cred2.toDouble() + Cred3.toDouble() + Cred4.toDouble() + Cred5.toDouble()
            var GPAA = (Sub1+Sub2+Sub3+Sub4+Sub5)/Tota
            Total.setText(Tota.toString())
            var ss = "%.2f".format(GPAA)
            GPA.setText("$ss")
        }

    }
    }
