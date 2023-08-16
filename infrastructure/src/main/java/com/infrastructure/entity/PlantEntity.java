package com.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    private  String name;

    private  String description;

    private int level;


    @ManyToMany
    private List<CommentEntity> commentEntitiess;

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }
}
