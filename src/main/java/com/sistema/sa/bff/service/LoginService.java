package com.sistema.sa.bff.service;

import com.sistema.sa.bff.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository

    public boolean login(String username, String password) {
        User user = loginRepository.findByUsernameAndPassword(username, password);

        if (user != null) {
            return true;
        } else {
            return false;
        }
        return false;
    }

}
