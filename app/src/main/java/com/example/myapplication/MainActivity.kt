package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onRadioButtonClicked(view:View){
        val imgagePlace=findViewById<ImageView>(R.id.imageView)
        val btn1=findViewById<RadioButton>(R.id.radioButton)
        val btn2=findViewById<RadioButton>(R.id.radioButton2)
        val btn3=findViewById<RadioButton>(R.id.radioButton5)
        if(btn1.isChecked){
            imgagePlace.setImageResource(R.drawable.a);
        }
        else if(btn2.isChecked){
            imgagePlace.setImageResource(R.drawable.g);
        }
        else{
            imgagePlace.setImageResource(R.drawable.v);
        }
    }

    fun onCheckButtonClicked(view: View){
        val imagePlace1=findViewById<ImageView>(R.id.imageView2)
        val imagePlace2=findViewById<ImageView>(R.id.imageView3)
        val imagePlace3=findViewById<ImageView>(R.id.imageView4)
        val btn1=findViewById<CheckBox>(R.id.checkBox)
        val btn2=findViewById<CheckBox>(R.id.checkBox2)
        val btn3=findViewById<CheckBox>(R.id.checkBox3)
        if(btn1.isChecked)
            imagePlace1.visibility=View.VISIBLE;
        else
            imagePlace1.visibility=View.INVISIBLE;
        if(btn2.isChecked)
            imagePlace2.visibility=View.VISIBLE;
        else
            imagePlace2.visibility=View.INVISIBLE;
        if(btn3.isChecked)
            imagePlace3.visibility=View.VISIBLE;
        else
            imagePlace3.visibility=View.INVISIBLE;
    }
}