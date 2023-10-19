package com.example.practice15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val raceTextEdit: EditText = findViewById(R.id.editTextText2)
        val ageTextEdit: EditText = findViewById(R.id.editTextDate4)

        var animal: Animal = Animal()

        val arguments: Bundle? = intent.extras

        if(arguments != null){
            animal = arguments.getParcelable<Animal>(animal.javaClass.simpleName) as Animal

            var buildAge: String = "${animal.getMonth()}.${animal.getYear()}"

            ageTextEdit.setText(buildAge)

            raceTextEdit.setText("${animal.getRace()}")
        }

    }

    fun endActivity(view: View) {
        finish()
    }
}