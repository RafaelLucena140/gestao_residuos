package br.com.fiap.gestao_residuos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNaoEcontradoException extends RuntimeException {

    public UsuarioNaoEcontradoException(String mensagem){
        super(mensagem);
    }

}

