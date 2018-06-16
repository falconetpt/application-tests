package com.example.competences.demo.api;

import com.example.competences.demo.domain.collaborator.Collaborator;
import com.example.competences.demo.domain.collaborator.CollaboratorAssembler;
import com.example.competences.demo.domain.collaborator.CollaboratorDTO;
import com.example.competences.demo.infrastructure.services.CollaboratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping("/api/collaborator")
public class CollaboratorController {
    @Autowired
    private CollaboratorService collaboratorService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(collaboratorService.getAll());
    }

    @PostMapping
    public ResponseEntity<?> createCollaborator(@RequestBody CollaboratorDTO collaboratorDTO) {
        try {
            Collaborator collaborator = CollaboratorAssembler.buildCollaboratorFromDTO(collaboratorDTO);
            return ResponseEntity.ok(collaboratorService.save(collaborator));
        } catch (IllegalArgumentException e) {
            return null;
        }

    }
}