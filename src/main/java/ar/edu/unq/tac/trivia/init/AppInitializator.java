package ar.edu.unq.tac.trivia.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Inicializa la app
 *
 * @author fgarcia
 */
@Component
public class AppInitializator {

    @Autowired
    private InitDatabase applicationDataInit;

    @PostConstruct
    public void init() {
        applicationDataInit.createAccounts(10);
    }

}
