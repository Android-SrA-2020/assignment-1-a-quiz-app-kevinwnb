package android.kevin.rickmortyquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val questionTextView: TextView = findViewById(R.id.question_text)

    private val questionBank = listOf(
        Question(R.string.question_1, false),
        Question(R.string.question_2, true),
        Question(R.string.question_3, true),
        Question(R.string.question_4, false),
        Question(R.string.question_5, false),
        Question(R.string.question_6, true),
        Question(R.string.question_7, false),
        Question(R.string.question_8, true),
        Question(R.string.question_9, false),
        Question(R.string.question_10, false),
        Question(R.string.question_11, false),
        Question(R.string.question_12, true),
        Question(R.string.question_13, false),
        Question(R.string.question_14, true),
        Question(R.string.question_15, false),
        Question(R.string.question_16, false),
        Question(R.string.question_17, true),
        Question(R.string.question_18, false),
        Question(R.string.question_19, false),
        Question(R.string.question_20, true)
    )

    private fun Question(q: Int, boolean: Boolean) {
        questionTextView.text = q.toString()
        Toast.makeText(
            this, "This question is " + boolean + " and you hitted bla",
            Toast.LENGTH_SHORT
        ).show()
    }


    private var questionToDisplay: Int = 1

    private fun forward() {
        questionToDisplay++
        questionBank[questionToDisplay]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questionTextView.text = R.string.question_1.toString()

        val trueButton: Button = findViewById(R.id.true_button)
        trueButton.setOnClickListener {}


        val forwardButton: Button = findViewById(R.id.forward_button)
        forwardButton.setOnClickListener { forward() }
    }
}
