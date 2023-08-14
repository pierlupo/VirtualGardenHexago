package com.domain.model;

public class Comment {

    private final String content;

    private final Plant plant;
    private final User user;

    public Comment(String content, Plant plant, User user) {
        this.content = content;
        this.plant = plant;
        this.user = user;
    }
}
