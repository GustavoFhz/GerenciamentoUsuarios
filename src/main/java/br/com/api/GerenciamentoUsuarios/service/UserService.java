package br.com.api.GerenciamentoUsuarios.service;

import br.com.api.GerenciamentoUsuarios.dto.UserDTO;
import br.com.api.GerenciamentoUsuarios.entity.UserModel;
import br.com.api.GerenciamentoUsuarios.mapper.UserMapper;
import br.com.api.GerenciamentoUsuarios.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private UserMapper userMapper;

    public UserService() {
    }

    public Iterable<UserModel> list() {
        return this.repository.findAll();
    }

    public UserDTO createUser(@Valid UserDTO userDTO) {
        if (this.repository.existsByEmail(userDTO.getEmail())) {
            throw new RuntimeException("Already exist a user with this email");
        } else {
            UserModel userModel = this.userMapper.toEntity(userDTO);
            userModel = (UserModel)this.repository.save(userModel);
            return this.userMapper.toDto(userModel);
        }
    }

    public UserDTO updateUser(Long id, @Valid UserDTO userDTO) {
        UserModel existingUser = (UserModel)this.repository.findById(id).orElseThrow(() -> {
            return new RuntimeException("User not found with ID: " + id);
        });
        existingUser.setUsername(userDTO.getUsername());
        existingUser.setEmail(userDTO.getEmail());
        existingUser.setFirstName(userDTO.getFirstName());
        existingUser.setRole(userDTO.getRole());
        existingUser.setActive(userDTO.getIsActive());
        UserModel updatedUser = (UserModel)this.repository.save(existingUser);
        return this.userMapper.toDto(updatedUser);
    }

    public void deleteUser(Long id) {
        if (!this.repository.existsById(id)) {
            throw new RuntimeException("User not found with ID: " + id);
        } else {
            this.repository.deleteById(id);
        }
    }
}
