package com.example.android.quizapp;

public class QuestionLibrary {
    private String mQuestions[]={
            "Layout Files are written in:",
            "A popUp message in Android is Known as a:",
            "Android Apps can only be made with android Studio",
            "The method called when a button is pressed is called",
            "Which of these variables types is not numeric?"

    };

    private String mChoices[][]={
            {"Xml","java","Html"},
            {"Sandwish","Crosissant","Toast"},
            {"True","False","None"},
            {"onClick","doMethod","action"},
            {"int","Decimal","Boolean"},

    };

    private String mCorrectAnswers[]={
            "Xml","Toast","False","onClick","Boolean"

    };
    public String getQuestion(int a){
        String question =mQuestions[a];
        return question;

    }
    public String getChoice1(int a){
        String choice0=mChoices[a][0];
        return choice0;
    }
    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }
    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a){
        String answer=mCorrectAnswers[a];
        return answer;
    }



}
