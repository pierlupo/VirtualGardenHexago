package com.infrastructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class UserEntity {

    @Id
    private int id;

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }
}
