package com.example.fullyfunctionalapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val buttonIntent1=findViewById<Button>(R.id.AndroidApp)
        val buttonIntent2=findViewById<Button>(R.id.MERN)
        val buttonIntent3=findViewById<Button>(R.id.BlockChain)
        val buttonIntent4=findViewById<Button>(R.id.IOS)
        val buttonIntent5=findViewById<Button>(R.id.MachineLearning)
        val buttonIntent6=findViewById<Button>(R.id.EthicalHacking)
        val buttonIntent7=findViewById<Button>(R.id.contact)


        buttonIntent1.setOnClickListener {
        val intent1 = Intent(this, MainActivity2_1::class.java)
        startActivity(intent1)
        }
        buttonIntent2.setOnClickListener {
            val intent2 = Intent(this, MainActivity2_2::class.java)
            startActivity(intent2)
        }
        buttonIntent3.setOnClickListener {
            val intent3 = Intent(this, MainActivity2_5::class.java)
            startActivity(intent3)
        }
        buttonIntent4.setOnClickListener {
            val intent4 = Intent(this, MainActivity2_3::class.java)
            startActivity(intent4)
        }
        buttonIntent5.setOnClickListener {
            val intent5 = Intent(this, MainActivity2_4::class.java)
            startActivity(intent5)
        }
        buttonIntent6.setOnClickListener {
            val intent6 = Intent(this, MainActivity2_6::class.java)
            startActivity(intent6)
        }
        buttonIntent7.setOnClickListener {
            val intent7 = Intent(this, MainActivity2_7::class.java)
            startActivity(intent7)
        }
    }
}