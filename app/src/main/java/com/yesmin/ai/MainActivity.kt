package com.yesmin.ai

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val title = TextView(this).apply {
            text = "Yesmin AI"
            textSize = 32f
            setTextColor(Color.parseColor("#C2185B"))
        }
        val subtitle = TextView(this).apply {
            text = "Aapki AI companion taiyaar hai.\nPhase 1 complete."
            textSize = 16f
            gravity = Gravity.CENTER
        }

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(48, 48, 48, 48)
            addView(title)
            addView(subtitle)
        }
        setContentView(layout)
    }
}
