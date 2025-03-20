package br.com.api.GerenciamentoUsuarios.controller;

import br.com.api.GerenciamentoUsuarios.dto.UserDTO;
import br.com.api.GerenciamentoUsuarios.entity.UserModel;
import br.com.api.GerenciamentoUsuarios.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@RequestBody @Valid UserDTO userDTO) {
        return ResponseEntity.ok(service.createUser(userDTO));

    }
}