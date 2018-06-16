package com.example.competences.demo.infrastructure.services;

import com.example.competences.demo.domain.User;
import com.example.competences.demo.infrastructure.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAll() {
        return userRepository.findAll();
    }
}
