package com.example.competences.demo.infrastructure.services;

import com.example.competences.demo.domain.collaborator.Collaborator;
import com.example.competences.demo.infrastructure.persistence.CollaboratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollaboratorService {
    @Autowired
    private CollaboratorRepository collaboratorRepository;

    public Iterable<Collaborator> getAll() {
        return collaboratorRepository.findAll();
    }

    public Collaborator save(Collaborator collaborator) {
        return collaboratorRepository.save(collaborator);
    }
}
