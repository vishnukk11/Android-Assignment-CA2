package com.example.android.assignmentca2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import com.google.android.material.progressindicator.BaseProgressIndicator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Fetching IDs of RadioButtons
        val radioGroup:RadioGroup = findViewById(R.id.radioGroup)
        val radioBtn1:RadioButton = findViewById(R.id.radioB1)
        val radioBtn2:RadioButton = findViewById(R.id.radioB2)

//        Adding Listener to Radio Buttons
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == R.id.radioB1)
                Toast.makeText(this,radioBtn1.text.toString(), Toast.LENGTH_LONG).show()
            if(checkedId == R.id.radioB2)
                Toast.makeText(this,radioBtn2.text.toString(), Toast.LENGTH_LONG).show()
        }

//        Fetching CheckBox IDs
        val checkBox1:CheckBox = findViewById(R.id.checkB1)
        val checkBox2:CheckBox = findViewById(R.id.checkB2)
        
//        Adding Listener to Check Boxes
        checkBox1.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
                Toast.makeText(this, checkBox1.text.toString(), Toast.LENGTH_LONG).show()
        }
        checkBox2.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
                Toast.makeText(this, checkBox2.text.toString(), Toast.LENGTH_LONG).show()
        }

//        Adding intent to the button to show the Solution 1 layout
        val btn_solution:Button = findViewById(R.id.btn)
        btn_solution.setOnClickListener(View.OnClickListener {
            val i:Intent = Intent(this,Solution1::class.java)
            startActivity(i)
        })


    }
}