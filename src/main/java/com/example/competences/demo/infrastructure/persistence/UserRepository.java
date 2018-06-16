package com.example.competences.demo.infrastructure.persistence;

import com.example.competences.demo.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User,UUID> {
}
