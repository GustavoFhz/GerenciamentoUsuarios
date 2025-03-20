package br.com.api.GerenciamentoUsuarios.mapper;

import br.com.api.GerenciamentoUsuarios.dto.UserDTO;
import br.com.api.GerenciamentoUsuarios.entity.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserModel toEntity(UserDTO dto) {
        UserModel userModel = new UserModel();

        userModel.setUsername(dto.getUsername());
        userModel.setEmail(dto.getEmail());
        userModel.setFirstName(dto.getFirstName());
        userModel.setLastName(dto.getLastName());
        userModel.setRole(dto.getRole());
        userModel.setActive(dto.getIsActive());
        return userModel;
    }

    public UserDTO toDto(UserModel userModel) {
        UserDTO dto = new UserDTO();

        dto.setUsername(userModel.getUsername());
        dto.setEmail(userModel.getEmail());
        dto.setFirstName(userModel.getFirstName());
        dto.setLastName(userModel.getLastName());
        dto.setRole(userModel.getRole());
        dto.setIsActive(userModel.isActive());
        return dto;
    }
}