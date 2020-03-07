package com.wexapi.wex.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "tb_user")
public class User {
    @Id
    private Long id;
    private String first_name;
    private String last_name;
    @OneToOne
    @JoinColumn(
            name = "MOVIE_ID", referencedColumnName = "ID", nullable = false)
    private Movies movie;

    public User(String first_name, String last_name, Movies movie) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.movie = movie;
    }

    public User(User user) {
        this.first_name = user.first_name;
        this.last_name = user.last_name;
        this.movie = user.movie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Movies getMovie() {
        return movie;
    }

    public void setMovie(Movies movie) {
        this.movie = movie;
    }
}
