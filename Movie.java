import java.util.ArrayList;
import java.util.List;

public class Movie {

    Long id;
    String title;
    String director;
    String date;
    String explanation;
    String type;
    String actor;

    public Movie(Long id, String title, String director, String date, String explanation, String type, String actor) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.date = date;
        this.explanation = explanation;
        this.type = type;
        this.actor = actor;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", date='" + date + '\'' +
                ", explanation='" + explanation + '\'' +
                ", type='" + type + '\'' +
                ", actor='" + actor + '\'' +
                '}';
    }
















    /*
    Long id;
    String title;
    String director;
    String date;
    String explanation;
    String type;
    String actor;


    public Movie(Long id, String title, String director, String date, String explanation, String type, String actor) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.date = date;
        this.explanation = explanation;
        this.type = type;
        this.actor = actor;

    }

    public double getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", date='" + date + '\'' +
                ", explanation='" + explanation + '\'' +
                ", type='" + type + '\'' +
                ", actor='" + actor + '\'' +
                '}';
    }*/
}
