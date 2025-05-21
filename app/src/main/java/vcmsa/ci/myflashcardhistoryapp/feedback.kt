package vcmsa.ci.myflashcardhistoryapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class feedback : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_feedback)

        val feedbackText = findViewById<TextView>(R.id.feedbackText)
        val exitButton = findViewById<Button>(R.id.exitButton)

        // Get data from intent
        val questions = intent.getStringArrayExtra("QUESTIONS")!!
        val correctAnswers = intent.getBooleanArrayExtra("CORRECT_ANSWERS")!!
        val userAnswers = intent.getBooleanArrayExtra("USER_ANSWERS")!!

        // Calculate score
        var score = 0
        val feedbackBuilder = StringBuilder()

        for (i in questionsArray.indices) {
            val isCorrect = userAnswersArray[i] == answersArray[i]
            if (isCorrect) score++

            feedbackBuilder.append("Question ${i+1}: ${questionsArray[i]}\n")
            feedbackBuilder.append("Correct Answer: ${if (answersArray[i]) "True" else "False"}\n")
            feedbackBuilder.append("Your Answer: ${if (userAnswersArray[i]) "True" else "False"}\n")
            feedbackBuilder.append(if (isCorrect) "✔ Correct\n\n" else "✘ Incorrect\n\n")
        }

        // Add score summary                                                                                                                                                                                                                                                                                                            // Add score summary
        feedbackBuilder.append("\nFinal Score: $score/${questionsArray.size}\n")
        feedbackBuilder.append(
            when (score) {
                questionsArray.size -> "Perfect! You got all questions right!"
                in questionsArray.size/2+1 until questionsArray.size -> "Good job! You passed!"
                else -> "Keep practicing to improve your score!"
            }
        )

        feedbackText.text = feedbackBuilder.toString()

        exitButton.setOnClickListener {
            finishAffinity() // Close the app
        }
    }
}






