package ar.edu.unq.tac.trivia.domain;

/**
 * Created by Hernan Laurini on 14/06/14.
 */
public enum Difficulty {
    EASY(1,"FACIL"),
    INTERMEDIATE(2,"INTERMEDIO"),
    HARD(3,"DIFICIL");

    private Integer id;
    private String desc;

    private Difficulty(Integer id, String desc){
        this.id=id;
        this.desc=desc;
    }

    public String toString() { return this.desc; }

    public Integer getId() {
        return id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}
