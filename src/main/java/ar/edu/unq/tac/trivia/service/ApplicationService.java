package ar.edu.unq.tac.trivia.service;

import ar.edu.unq.tac.trivia.domain.Application;

import java.util.List;

public interface ApplicationService {

    List<Application> all();

    List<Application> find(String q);

    Application findOne(Long id);

}
