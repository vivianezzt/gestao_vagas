package br.com.vivianedev.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {
    private UUID id;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaços em branco")
    private String username;
    private String name;

    @Email(message = "O campo [email] deve conter um e-mail valido")
    private String email;

    @Length(min = 10, max=100,  message = "O campo (password) deve conter no mínimo 10 caracteres")
    private String password;
    private String description;
    private String curriculum;

}
