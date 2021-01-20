package `fun`.chezcandy.myquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.Button
import android.widget.Toast

import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {


    private lateinit var btnStart: Button
    private lateinit var etName: AppCompatEditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // To hide the status bar
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        btnStart = findViewById(R.id.btn_start)
        etName = findViewById(R.id.et_name)

        btnStart.setOnClickListener {

            if (etName.text.toString().isEmpty()) {

                Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT)
                    .show()

            } else {

                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)
                // ToDo (Step2: Pass the name through intent using the constant variable which we have created.)

                intent.putExtra(Constants.USER_NAME, etName.text.toString())

                startActivity(intent)
                finish()

            }
        }
    }
}