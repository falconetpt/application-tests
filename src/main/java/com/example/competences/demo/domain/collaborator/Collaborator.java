package com.example.competences.demo.domain.collaborator;

import com.example.competences.demo.domain.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name="collaborators")
public final class Collaborator extends BaseEntity {

    private String name;

    protected Collaborator() {
    }

    protected Collaborator(String name) {
        if(name == null || name.length() < 1) {
            throw new IllegalArgumentException("Name Cannot be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
