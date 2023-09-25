package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var nameEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        nameEditText = findViewById(R.id.nameEditText)
        
        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            var hasError = false
            nameEditText.run {
                if (text.isBlank() ){
                    hasError = true
                    showError( this,"Can not be blank")
                } else {
                    displayTextView.text = "Hello, ${findViewById<EditText>(R.id.nameEditText).text}"
                }
            }



        }


    }

    private fun showError(view: TextView, message: CharSequence) {
view.error = message
    }
}