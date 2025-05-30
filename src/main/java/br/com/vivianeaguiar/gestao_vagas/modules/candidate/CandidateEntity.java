package br.com.vivianeaguiar.gestao_vagas.modules.candidate;


import lombok.Data;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

@Data
public class CandidateEntity {
    private UUID id;

    @Pattern(regexp = "^(?!\\s*$).+", message = "O campo (username) não pode ser vazio")
    private String username;
    private String name;

    @Email(message = "O campo (e-mail) deve conter um e-mail valido")
    private String email;

    @Length(min = 10, max = 100, message = "O campo (password) deve conter entre 10 e 100 caracteres")
    private String password;
    private String description;
    private String curriculum;
}
