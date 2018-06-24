package com.example.competences.demo.infrastructure.services;

import com.example.competences.demo.domain.collaborator.Collaborator;
import com.example.competences.demo.domain.collaborator.CollaboratorAssembler;
import com.example.competences.demo.domain.collaborator.CollaboratorDTO;
import com.example.competences.demo.infrastructure.persistence.CollaboratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CollaboratorService {
    @Autowired
    private CollaboratorRepository collaboratorRepository;

    public Iterable<Collaborator> getAll() {
        return collaboratorRepository.findAll();
    }

    public Optional<Collaborator> getId(UUID id) {
        return collaboratorRepository.findById(id);
    }

    public Collaborator create(CollaboratorDTO collaboratorDTO) {
        return CollaboratorAssembler.buildCollaboratorFromDTO(collaboratorDTO);
    }

    public Collaborator save(Collaborator collaborator) {
        return collaboratorRepository.save(collaborator);
    }
}
