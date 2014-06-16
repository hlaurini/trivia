package ar.edu.unq.tac.trivia.service.security;

public interface SecurityService {

    void login(String username, String password);

    void logout();
}