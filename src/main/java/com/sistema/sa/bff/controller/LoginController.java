package com.sistema.sa.bff.controller;

import com.sistema.sa.bff.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/entrar")
    public ResponseEntity login(@RequestParam String email, @RequestParam String senha) {
       try {
        Usuario usuario = loginService.login(email, senha);
        return ResponseEntity.status(HttpStatus.OK).body(usuario);
       }catch(Exception e){
           return ResponseEntity.status(HttpStatus.FORBIDDEN).build();

       }

    }
}
