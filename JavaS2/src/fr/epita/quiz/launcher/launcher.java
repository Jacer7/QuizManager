package fr.epita.quiz.launcher;

import fr.epita.datamodel.Question;
import fr.epita.services.data.QuestionDAO;

import java.util.Scanner;

public class launcher {
    public static void main(String[] args) throws Exception {
//---------------------------------------------------------------------
        // Question Module
        // open the console box

        Scanner scanner = new Scanner(System.in);
        System.out.println("hello, input a question title: ");
        String questionTitle = scanner.nextLine();
        // closes only after we type something

        System.out.println("Input the question difficulty (  to 5)");
        int questionDifficulty = scanner.nextInt();
//----------------------------------------------------------------------

        // putting upper values into question class instances
        // This will also be Business Logic

//        Question question = new Question();
//        question.setQuestion(questionTitle);
//        question.setDifficulty(questionDifficulty);


        //Data access

        QuestionDAO questionDAO = new QuestionDAO();
        questionDAO.viewData();


    }
}
