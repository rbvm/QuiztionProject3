package com.example.android.quiztion_project3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkQuizAnswers(View view) {
        totalScore = 0;

        // Question 1, right answer: "Vitamin C."
        RadioButton question1 = findViewById(R.id.answer_1b);
        boolean hasAnswer1b = question1.isChecked();
        if (hasAnswer1b) {
            totalScore = totalScore + 1;
        }

        //Question 2, right answer: "A genie"
        RadioButton question2 = findViewById(R.id.answer_2d);
        boolean hasAnswer2d = question2.isChecked();
        if (hasAnswer2d) {
            totalScore = totalScore + 1;
        }

        // Question 3, right answer: 5
        EditText answer3 = findViewById(R.id.answer_3);
        String checkAnswer3 = answer3.getText().toString();
        if (checkAnswer3.equals("5")) {
            totalScore = totalScore + 1;
        }

        // Question 4, right answer: Alligators, Crocodiles and Snakes
        CheckBox answer_4a = findViewById(R.id.answer_4a);
        boolean answerA4 = answer_4a.isChecked();
        CheckBox answer_4c = findViewById(R.id.answer_4c);
        boolean answerC4 = answer_4c.isChecked();
        CheckBox answer_4d = findViewById(R.id.answer_4d);
        boolean answerD4 = answer_4d.isChecked();
        if (answerA4 && !answerC4 && answerD4) {
            totalScore = totalScore + 1;
        }

        // Question 5, right answer: Tuesday
        EditText answer5 = findViewById(R.id.answer_5);
        String checkAnswer5 = answer5.getText().toString();
        if (checkAnswer5.equals("Tuesday")) {
            totalScore = totalScore + 1;
        }

        if (totalScore == 0) {
            Toast.makeText(getApplicationContext(), "You have " + totalScore + " points. Please try again!", Toast.LENGTH_LONG).show();
        } else if (totalScore <= 2) {
            Toast.makeText(getApplicationContext(), "You have " + totalScore + " of 5 points. You can do better!", Toast.LENGTH_LONG).show();
        } else if (totalScore <= 3) {
            Toast.makeText(getApplicationContext(), "You have " + totalScore + " of 5 points. Not bad!", Toast.LENGTH_LONG).show();
        } else if (totalScore <= 4) {
            Toast.makeText(getApplicationContext(), "You have " + totalScore + " of 5 points. You're almost there!", Toast.LENGTH_LONG).show();
        } else if (totalScore == 5) {
            Toast.makeText(getApplicationContext(), " You're a genius!", Toast.LENGTH_LONG).show();
        }
    }


    public void clearQuiz(View view) {
        totalScore = 0;
        RadioGroup clearQuestion1 = findViewById(R.id.answers_1);
        clearQuestion1.clearCheck();
        RadioGroup clearQuestion2 = findViewById(R.id.answers_2);
        clearQuestion2.clearCheck();
        EditText clearQuestion3 = findViewById(R.id.answer_3);
        clearQuestion3.setText("");
        CheckBox answerA4 = findViewById(R.id.answer_4a);
        answerA4.setChecked(false);
        CheckBox answerB4 = findViewById(R.id.answer_4b);
        answerB4.setChecked(false);
        CheckBox answerC4 = findViewById(R.id.answer_4c);
        answerC4.setChecked(false);
        CheckBox answerD4 = findViewById(R.id.answer_4d);
        answerD4.setChecked(false);
        EditText clearQuestion5 = findViewById(R.id.answer_5);
        clearQuestion5.setText("");

    }
}
