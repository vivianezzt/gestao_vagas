package br.com.vivianedev.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {

    public UserFoundException(String message) {
        super("Usuario ja existe");
    }
}