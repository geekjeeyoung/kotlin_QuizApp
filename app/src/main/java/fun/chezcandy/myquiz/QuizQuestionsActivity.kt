package `fun`.chezcandy.myquiz

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1 // Default and the first question position
    private var mQuestionsList: ArrayList<Question>? = null

    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswer: Int = 0


    // ToDo (Step 3: Create a variable for getting the name from intent.)

    private var mUserName: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_quiz_questions)

        // Todo: (Step 4: Get the NAME from intent and assign it the variable.)
        mUserName = intent.getStringExtra(Constants.USER_NAME)

        mQuestionsList = Constants.getQuestions()
        

    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}
