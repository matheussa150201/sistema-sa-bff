package com.sistema.sa.bff.service;

import com.sistema.sa.bff.model.Login;
import com.sistema.sa.bff.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public boolean login(String email, String senha) {
        Login login = loginRepository.findOfLogin(email, senha);

        if (login != null) {
            return true;
        } else {
            return false;
        }
    }

}
