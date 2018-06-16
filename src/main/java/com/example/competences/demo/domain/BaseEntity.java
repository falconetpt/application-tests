package com.example.competences.demo.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Inheritance
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
