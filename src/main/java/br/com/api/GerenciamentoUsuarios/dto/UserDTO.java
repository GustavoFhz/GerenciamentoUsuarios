package br.com.api.GerenciamentoUsuarios.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
public class UserDTO {

    @NotBlank(message = "Username cannot be blank")
    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
    private String username;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "First name cannot be blank")
    @Size(max = 20, message = "The fisrt name must be 50 characters in the maximum")
    private String firstName;

    @NotBlank(message = "Last name cannot be blank")
    @Size(max = 20, message = "The last name must be 50 characters in the maximum")
    private String lastName;

    @NotBlank(message = "Role cannot be blank")
    private String role;

    @NotNull(message = "User status must be specified")
    private Boolean isActive;
}

