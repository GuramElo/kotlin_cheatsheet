package com.example.guram_elizbarashvili_kotlin_monday_19_00

import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//=======================================
//        val editText = findViewById<EditText>(R.id.editText)
//        val textInputLayout = findViewById<TextInputLayout>(R.id.testTextInputLayout)
//
//        if (editText.text.toString().isEmpty()) {
//            textInputLayout.error = "This field is required"
//        } else {
//            textInputLayout.error = null  // Clear the error if input is valid
//        }
        //======================================
//        <com.google.android.material.textfield.TextInputLayout
//            android:id="@+id/testTextInputLayout"
//            android:layout_width="match_parent"
//            android:layout_height="wrap_content">
//
//            <EditText
//                android:id="@+id/editText"
//                android:outlineAmbientShadowColor="@color/white"
//                android:outlineSpotShadowColor="@color/white"
//                android:backgroundTint="@color/white"
//                android:textColorHint="@color/white"
//                android:layout_width="match_parent"
//                android:layout_height="match_parent"
//                android:hint="testttt" />
//
//        </com.google.android.material.textfield.TextInputLayout>
    }
}