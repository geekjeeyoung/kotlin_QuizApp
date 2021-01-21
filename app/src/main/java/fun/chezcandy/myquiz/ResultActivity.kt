package `fun`.chezcandy.myquiz

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private lateinit var ivTrophy: ImageView

    private lateinit var tvName: TextView
    private lateinit var tvScore: TextView
    private lateinit var btnFinal: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        tvResult = findViewById(R.id.tv_result)
        ivTrophy = findViewById(R.id.iv_trophy)

        tvName = findViewById(R.id.tv_name)
        tvScore = findViewById(R.id.tv_score)
        btnFinal = findViewById(R.id.btn_final)

        // Todo (Step 6: Hide the status bar and get the details from intent and set it to the UI. And also add a click event to the finish button.)

        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(Constants.USER_NAME)


        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)



        setFinalScreen(userName, correctAnswers, totalQuestions)

    }

    private fun setFinalScreen(userName: String?, correctAnswers: Int, totalQuestions: Int) {
        tvName.text = userName
        tvScore.text = "Your Score is $correctAnswers out of $totalQuestions."

        btnFinal.setOnClickListener {
            startActivity(Intent(this@ResultActivity, MainActivity::class.java))
        }
    }
}
