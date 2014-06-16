package ar.edu.unq.tac.trivia.domain;

import java.util.List;
import javax.persistence.*;

/**
 * Created by Hernan Laurini on 14/06/14.
 */
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private CategoryQuestion category;

    private Difficulty difficulty;

    private String questionText;

    @OneToMany(mappedBy="question", cascade = CascadeType.ALL)
    private List<AnswerQuestion> correctAnswerList;

    @OneToMany(mappedBy="question", cascade = CascadeType.ALL)
    private List<AnswerQuestion> wrongAnswerList;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    public CategoryQuestion getCategory() {
        return category;
    }

    public void setCategory(CategoryQuestion category) {
        this.category = category;
    }

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<AnswerQuestion> getCorrectAnswerList() {
        return correctAnswerList;
    }

    public void setCorrectAnswerList(List<AnswerQuestion> correctAnswerList) {
        this.correctAnswerList = correctAnswerList;
    }

    public List<AnswerQuestion> getWrongAnswerList() {
        return wrongAnswerList;
    }

    public void setWrongAnswerList(List<AnswerQuestion> wrongAnswerList) {
        this.wrongAnswerList = wrongAnswerList;
    }
}
