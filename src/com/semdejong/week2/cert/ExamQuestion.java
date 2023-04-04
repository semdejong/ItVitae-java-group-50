package com.semdejong.week2.cert;

public class ExamQuestion {
    private String question;
    private String answer;
    private int points;
    private boolean completelyCorrect;

    public ExamQuestion(String question, String answer, int points, boolean completelyCorrect) {
        this.question = question;
        this.answer = answer;
        this.points = points;
        this.completelyCorrect = completelyCorrect;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        if(question.equals(this.question)){
            return;
        }
        System.out.println("Hi");
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isCompletelyCorrect() {
        return completelyCorrect;
    }

    public void setCompletelyCorrect(boolean completelyCorrect) {
        this.completelyCorrect = completelyCorrect;
    }
}
