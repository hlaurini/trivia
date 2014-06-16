package ar.edu.unq.tac.trivia.repository.factory;


import ar.edu.unq.tac.trivia.domain.Category;
import ar.edu.unq.tac.trivia.domain.CategoryQuestion;
import ar.edu.unq.tac.trivia.domain.Difficulty;
import ar.edu.unq.tac.trivia.domain.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Hernan Laurini on 14/06/14.
 */
public class QuestionFactory {
    public static List<Question> getAnswerList(Difficulty difficulty, CategoryQuestion category){
        List<Question> questionList=new ArrayList<Question>();
        String[]names={"Bocha","Nando","Alejandro","Metal", "Mariano L.","Mariano V."};
        String[]verbs={"vive","estudia o estudio","trabaja"};
        Random random=new Random();
        for(String verb :verbs){
            String question="Donde "+verb+" ";
            for(String name:names){
               Question completeQuestion=new Question();
                completeQuestion.setQuestionText(question+name+"?");
                completeQuestion.setCategory(CategoryQuestion.values()[random.nextInt(CategoryQuestion.values().length)]);
                completeQuestion.setDifficulty(Difficulty.values()[random.nextInt(Difficulty.values().length)]);
                questionList.add(completeQuestion);
            }
        }
        return questionList;
    }
}
