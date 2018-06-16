package com.example.competences.demo.domain.collaborator;

public class CollaboratorAssembler {
    public static Collaborator buildCollaboratorFromDTO(CollaboratorDTO collaboratorDTO)
        throws  IllegalArgumentException {
        try {
            Collaborator collaborator = new Collaborator(collaboratorDTO.getName());
            return collaborator;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
