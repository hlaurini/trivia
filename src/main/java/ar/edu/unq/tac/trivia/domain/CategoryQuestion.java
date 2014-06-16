package ar.edu.unq.tac.trivia.domain;

/**
 * Created by Hernan Laurini on 14/06/14.
 */
public enum CategoryQuestion {
    NATIONAL_HISTORY(1,"HISTORIA NACIONAL"),
    SCIENCE(2,"CIENCIA"),
    ARTS(3,"ARTES"),
    TV(4,"TELEVISION"),
    MUSIC(5,"MUSICA");

    private Integer id;
    private String desc;

    private CategoryQuestion(Integer id, String desc){
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
