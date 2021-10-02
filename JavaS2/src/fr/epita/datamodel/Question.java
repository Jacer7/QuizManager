package fr.epita.datamodel;

public class Question {
    public static final int DEFAULT_DIFFICULTY = 2;

    private Integer difficulty = DEFAULT_DIFFICULTY; //default 2 as difficulty level
    private String question;

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public String getQuestion() {
        return question;
    }


    public void setQuestion(String  question) {
        this.question = question;
    }
}