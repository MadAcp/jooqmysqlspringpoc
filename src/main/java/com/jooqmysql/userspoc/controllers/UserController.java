package com.jooqmysql.userspoc.controllers;

import com.jooqmysql.userspoc.models.User;
import com.jooqmysql.userspoc.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<String> createUser(
            @RequestParam String name,
            @RequestParam String email
    ) {
        userRepository.createUser(name, email);
        return ResponseEntity.ok("User created");
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepository.getUsers();
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(
            @PathVariable Integer id,
            @RequestParam String name,
            @RequestParam String email
    ) {
        userRepository.updateUser(id, name, email);
        return ResponseEntity.ok("User updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id) {
        userRepository.deleteUser(id);
        return ResponseEntity.ok("User deleted");
    }

}
