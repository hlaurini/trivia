package ar.edu.unq.tac.trivia.repository;

import ar.edu.unq.tac.trivia.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by frepond on 5/28/14.
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query("select c from Account c where c.description like %?1%")
    List<Account> find(String q);
}
