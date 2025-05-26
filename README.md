Purpose of the App
Flashcard Quiz App is a native Android app developed using Kotlin in Android Studio for assisting users in improving their history knowledge in the form of an entertaining and engaging quiz. This application leverages the well-known flashcard learning method, which has proven effective in enhancing memory recall and improving learning.

1. Improve Your Historical Knowledge
The app provides users with True/False flashcard-style questions that are grounded on history facts. In the process of utilizing a well-compiled list of questions, users can test their knowledge and memory in a brief yet effective manner.

2. Interactive Learning Experience
Unlike traditional learning methods, this application gives quick feedback, such as "Correct!" or "Incorrect!" for each response that is given. This responsiveness promotes confidence and helps discover knowledge gaps.

3. Performance Insights and Encouragement
After answering all five questions, people are given a personalized performance overview. Top scorers (3 or more right answers) receive encouragement from encouraging words such as "Great job!".  whereas low scorers are encouraged with friendly reminders like "Keep practicing!"

4. Review and Reflect
The app supports a Review facility where the users can review all questions, and in this case, the correct answers will be shown to help in consolidating learning as well as maintaining retention.

5. User-Centric Design
With a minimalist and user-centered interface, the app is easy for students of any age. The experience is smooth from the Welcome screen to the question screens, and then to the Score and Review screen, providing a smooth and enjoyable experience for users.

Design Considerations
The design of the Flashcard Quiz App is centered around simplicity, usability, and effective learning. Below are key considerations taken into account during development:

UI/UX Design 
Screen Structure
1.	Welcome Screen 
•	Purpose: Greet the user and explain what is the purpose of the app
•	Elements:  App title 
•	Give a short brief description (e.g. “Test your knowledge of history using the flashcards.”)
•	Start button to proceed to the quiz

2.	Flashcard question Screen 
•	Purpose: Show one question at a time and display the answer for the user
•	Elements: Question text (e.g., "Who is Nelson Mandela? ")
•	True and False buttons (e.g., "Correct!" or
o	"Incorrect")
•	Text that tells you if you’re right or wrong
•	Button to move to the next question

3. Score Screen
•	Purpose: It displays the final results and feedback
•	Elements:
•	Total correct answers the you have received (e.g., "You got 4 out of 5")
•	Feedback message: "Great job!" if you received 3 or more answers.
•	"Keep practising !" if you received less than 3 answers.
•	Button to look at all questions with the right answers.
•	Review button to see all questions with correct answers
•	Exit button to close the app


Layout Considerations:
•	Flexible setup with Constraint Layout or Linear Layout to fit different screen sizes well.
•	Easy-to-follow look: make questions bold, use colours for feedback (green means right red means wrong).
•	Easy to use: clear text big buttons, and simple way to move around.


Application Logic Design
Quiz Flow Logic:
•	Use of parallel arrays:

kotlin
val questions = arrayof ( "Nelson Mandela was a South African leader who fought apartheid and became the country’s first Black president in 1994.)
val answers = booleanArrayof(true,…)

o	The score starts at zero.
o	Go through five questions one by one.

o	For each question: Compare what the user says to the right answer.
o	Show feedback immediately.
•	Update score if correct.

o	After the final question:
o	Display Score Screen with the total and feedback.

•	Review Screen Logic:
o	Go through all five questions.
o	Display each with:
•	The original question
o	Correct answer
o	(Optional: user's answer)


GitHub Integration
GitHub is used for the full development lifecycle of the app which also includes version control and collaboration.

Key Uses: Key Applications:

•	Version Control: All code changes recorded in commits and branches.

•	Project Backup: App’s source code in the cloud.

•	Team Collaboration: Enables review of code via pull requests and issue tracking.

•	Documentation: README file for project info, setup, and use.

GitHub Actions (CI/CD)
GitHub Actions is for the automation of the build and testing which in turn guarantees that the app is working right with every code change.

Benefits of GitHub Actions: Features of GitHub Actions:

•	Automated Builds: Every time there is a push the project builds again.

•	Early Error Detection: Problems found before release.

•	Quality Assurance: Ensures that which code will merge is when the build does pass.

•	No Manual Steps: Continuous integration does away with manual checks which are the same every time.


Youtube video: 
(https://youtu.be/BS9LPlDew4M?feature=shared)

GitHub Repository: 
https://github.com/ST10453449-NasrahMoerat/MyFlashCardHistoryApp.git

Images: (https://za.pinterest.com/pin/605874956130704892/)
![Screenshot 2025-05-24 at 19 12 00 2](https://github.com/user-attachments/assets/ad63cb28-ec13-47af-b3f5-5b348991f033)
![Screenshot 2025-05-24 at 19 11 45 2](https://github.com/user-attachments/assets/06d5a96a-e772-462f-b1ea-bba942acfb09)![Screenshot 2025-05-24 at 19 12 17 2](https://github.com/user-attachments/assets/a83ee454-2cc9-42c3-8ffb-75fcbfe8c49f)
![Screenshot 2025-05-24 at 19 12 06 2](https://github.com/user-attachments/assets/6b5fc3be-1358-40b5-a9b7-eb482fc5fbc9)
![Screenshot 2025-05-24 at 19 12 22 2](https://github.com/user-attachments/assets/6a48e259-5867-464c-9d3f-eb1de90b6bb0)
![Screenshot 2025-05-24 at 19 12 39 2](https://github.com/user-attachments/assets/a81db35b-c89f-4a6e-8c17-626e5e79cc8a)
![Screenshot 2025-05-24 at 19 11 35 2](https://github.com/user-attachments/assets/ac410274-5611-4f76-b453-8fa95e209727)
