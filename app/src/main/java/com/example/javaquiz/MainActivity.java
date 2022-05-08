package com.example.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] questions={"Is Mount Kilimanjaro the world’s tallest peak?",
            "Spaghetto is the singular form of the word spaghetti. ",
            "Pinocchio was Walt Disney’s first animated feature film in full color.",
            "Venezuela is home to the world’s highest waterfall.",
            "Coffee is a berry-based beverage. ",
            "The capital of Australia is Sydney.",
            "The longest river in the world is the Amazon River. ",
            "Polar bears can only live in the Arctic region, not in the Antarctic. ",
            "The United Kingdom is almost the same size as France."

    };
    boolean [] answers={false,true,false,true,true,false,false,true,false};

    int score=0;
    int index=0;
    Button yes;
    Button no;
    TextView question;
    TextView scoreView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question=findViewById(R.id.question);
        scoreView=findViewById(R.id.Score);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answers[index]){
                    score++;
                }
                if(index<(questions.length-1)){
                    question.setText(questions[++index]);
                }else {
                    Toast.makeText(MainActivity.this, "Score: " + score, Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(answers[index])){
                    score++;
                }
                if(index<(questions.length-1)){
                    question.setText(questions[++index]);
                }else{
                    Toast.makeText(MainActivity.this, "Score: "+score, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}