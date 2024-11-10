package com.example.guram_eliza_mid_term

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
                val editText = findViewById<EditText>(R.id.editText)
        val textInputLayout = findViewById<TextInputLayout>(R.id.testTextInputLayout)

        if (editText.text.toString().isEmpty()) {
            textInputLayout.error = "This field is required"
        } else {
            textInputLayout.error = null  // Clear the error if input is valid
        }
findViewById<Button>(R.id.resetButton).setOnClickListener {
    textInputLayout.error = null
}
    }
}