package com.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Plant {

    private int id;

    private final String name;

    private final String description;

    private  int level;

    private List<Comment> comments;

    public Plant(String name, String description, int level) {
        this.name = name;
        this.description = description;
        this.level = level;
    }

    public Plant(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Plant(int id, String name, String description, int level) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.level = level;
        comments = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public int getLevel() {
        return level;
    }
}
