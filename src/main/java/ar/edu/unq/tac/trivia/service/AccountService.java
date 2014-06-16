package ar.edu.unq.tac.trivia.service;

import ar.edu.unq.tac.trivia.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> all();

    List<Account> find(String q);

}
