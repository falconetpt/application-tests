package com.example.competences.demo.infrastructure.persistence;

import com.example.competences.demo.domain.collaborator.Collaborator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CollaboratorRepository extends JpaRepository<Collaborator,UUID> {
}
