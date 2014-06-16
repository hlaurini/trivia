package ar.edu.unq.tac.trivia.repository;

import ar.edu.unq.tac.trivia.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hernan Laurini on 14/06/14.
 */
public interface QuestionRepository extends JpaRepository<Question, Long> {


}
