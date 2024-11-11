package com.example.guram_eliza_mid_term

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.text.InputFilter
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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
findViewById<Button>(R.id.resetButton).setOnClickListener {
    val editText1 = findViewById<EditText>(R.id.editText1);
    if(!validateEditText(editText1, 3)) {
        editText1.error = "ntuu, "
    }
    //++++++++++++++++++
    val toast = Toast.makeText(this, "Custom Toast", Toast.LENGTH_LONG)
//    toast.setGravity(Gravity.CENTER, 0, 0)

    toast.show()
}
        findViewById<Button>(R.id.resetButton).background = null;
//        findViewById<Button>(R.id.resetButton).setBackgroundColor(Color.rgb(173, 78, 14));
        //=================
//        editText1.backgroundTintList = ColorStateList.valueOf(Color.RED);
        //=======================
    }
//    val editText = findViewById<EditText>(R.id.myEditText)
//
//// Reset the EditText using setText("")
//editText.setText("")
//
//// Reset the EditText using getText().clear()
//editText.getText().clear()
    fun validateEditText(editText: EditText, validationType: Int): Boolean {
        val input = editText.text.toString()

        when (validationType) {
            1 -> { // At least 8 characters with at least one digit
                val pattern = "^(?=.*[0-9])(?=\\S+$).{8,}$"
                return input.matches(Regex(pattern))
            }
            2 -> { // Valid phone number (replace with your specific format)
                val pattern = "^\\+?[0-9]{9,12}$" // Example: 10-15 digits with optional "+"
                return input.matches(Regex(pattern))
            }
            3 -> { // 4 digits only
                editText.filters = arrayOf(InputFilter.LengthFilter(4))
                return input.matches(Regex("^[0-9]{4}$"))
            }
            4 -> { // At least 10 characters with at least 3 digits
                val pattern = "(?=.*\\d.*\\d.*\\d)^\\w{10,}\$"
                return input.matches(Regex(pattern))
            }
            else -> return false
        }
    }
}