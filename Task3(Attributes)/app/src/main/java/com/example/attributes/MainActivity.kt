package com.example.attributes

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.graphics.Color

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val editText: EditText = findViewById(R.id.editText)
        val buttonBlackText: Button = findViewById(R.id.button_black_text)
        val buttonRedText: Button = findViewById(R.id.button_red_text)
        val buttonSize8sp: Button = findViewById(R.id.button_size_8sp)
        val buttonSize24sp: Button = findViewById(R.id.button_size_24sp)
        val buttonWhiteBg: Button = findViewById(R.id.button_white_bg)
        val buttonYellowBg: Button = findViewById(R.id.button_yellow_bg)

        buttonBlackText.setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }

        buttonRedText.setOnClickListener {
            editText.setTextColor(Color.RED)
        }

        buttonSize8sp.setOnClickListener {
            editText.setTextSize(8f)
        }

        buttonSize24sp.setOnClickListener {
            editText.setTextSize(24f)
        }

        buttonWhiteBg.setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }

        buttonYellowBg.setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW) // Устанавливаем желтый фон
        }
    }
}