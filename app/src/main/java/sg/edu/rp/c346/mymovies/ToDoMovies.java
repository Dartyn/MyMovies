package sg.edu.rp.c346.mymovies;

import java.util.Calendar;

/**
 * Created by 16022667 on 24/7/2017.
 */

public class ToDoMovies {


    private String title;
    private String details;
    private String year;
    private String genre;
    private Calendar watchedOn;
    private String theatre;


    private String type;

    public ToDoMovies(String title,String year,String type, String genre,Calendar watchedOn, String theatre, String details ) {
        this.title = title;
        this.details = details;
        this.year = year;
        this.genre = genre;
        this.watchedOn = watchedOn;
        this.theatre = theatre;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getWatchedOn() {
        return watchedOn;
    }

    public void setWatchedOn(Calendar watchedOn) {
        this.watchedOn = watchedOn;
    }

    public String getTheatre() {
        return theatre;
    }

    public void setTheatre(String theatre) {
        this.theatre = theatre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ToDoMovies{" +
                "title='" + title + '\'' +
                ", details='" + details + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", watchedOn=" + watchedOn +
                ", theatre='" + theatre + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}