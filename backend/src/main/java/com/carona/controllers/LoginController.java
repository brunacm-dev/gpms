package com.carona.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carona.logins.UsuarioLoginDTO;
import com.carona.services.LoginService;

import lombok.extern.slf4j.Slf4j;

@Validated
@Slf4j
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping(value="/login")
    public ResponseEntity<?> login(

            @RequestBody UsuarioLoginDTO usuario

    ) {

        boolean autenticado = loginService.autenticar(usuario);
        if (autenticado) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }
}

