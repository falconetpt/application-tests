package com.example.competences.demo.api;

import com.example.competences.demo.infrastructure.persistence.UserRepository;
import com.example.competences.demo.infrastructure.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }
}
