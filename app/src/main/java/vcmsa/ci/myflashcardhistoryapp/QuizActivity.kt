package vcmsa.ci.myflashcardhistoryapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

// These would be declared at the top of yout file, outside the class
val questionsArray = arrayOf(
    "The Declaration of Independence was signed in 1776",
    "The Roman Empire fell in 1066 AD",
    "The Cold War was direct military conflict between the USA and USSR",
    "The Great Wall of China was built to protect against Mongol invasions",
    "Mahatma Gandhi used violent revolution to fight British rule in India",
)
val answersArray = arrayOf(true, false, false, true, false)
val userAnswersArray = BooleanArray(5) // Will store user's answers

class QuizActivity : AppCompatActivity() {
    private var currentQuestionIndex = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz)

        // declarations
        val questionText = findViewById<TextView>(R.id.questionText)
        val nextButton = findViewById<Button>(R.id.nextButton)
        val trueButton = findViewById<Button>(R.id.trueButton)
        val falseButton = findViewById<Button>(R.id.falseButton)

        // Display first question
        showQuestion(currentQuestionIndex, questionText)

        trueButton.setOnClickListener {
            userAnswersArray[currentQuestionIndex] = true
            enableNextButton(nextButton)
        }
        falseButton.setOnClickListener {
            userAnswersArray[currentQuestionIndex] = false
            enableNextButton(nextButton)
        }

        nextButton.setOnClickListener {
            currentQuestionIndex++
            if (currentQuestionIndex < questionsArray.size) {
                showQuestion(currentQuestionIndex, questionText)
                nextButton.isEnabled = false
            } else {
                // All questions answered, go to feedback
                val intent = Intent(this, feedback::class.java)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun showQuestion(index: Int, textView: TextView) {
        textView.text = questionsArray[index]
    }

    private fun enableNextButton(button: Button) {
        button.isEnabled= true
    }
}