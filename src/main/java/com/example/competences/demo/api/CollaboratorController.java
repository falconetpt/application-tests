package com.example.competences.demo.api;

import com.example.competences.demo.domain.collaborator.Collaborator;
import com.example.competences.demo.domain.collaborator.CollaboratorAssembler;
import com.example.competences.demo.domain.collaborator.CollaboratorDTO;
import com.example.competences.demo.infrastructure.services.CollaboratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @GetMapping("/{id}")
    public ResponseEntity<?> getId() {
        return ResponseEntity.ok(collaboratorService.getAll());
    }

    @PostMapping
    public ResponseEntity<?> createCollaborator(@RequestBody CollaboratorDTO collaboratorDTO) {

        ResponseEntity<?> responseEntity;
        try {
            Collaborator collaborator = collaboratorService.create(collaboratorDTO);
            responseEntity = new ResponseEntity( collaborator, HttpStatus.CREATED );
        } catch (IllegalArgumentException e) {
            responseEntity = new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        return responseEntity;
    }
}
