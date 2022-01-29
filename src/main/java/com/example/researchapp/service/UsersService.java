package com.example.researchapp.service;

import com.example.researchapp.model.UsersModel;
import com.example.researchapp.repository.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    public UsersModel registerUser(String login, String password, String email) {
        if (login != null && password != null) {
            UsersModel usersModel = new UsersModel();
            usersModel.setLogin(login);
            usersModel.setPassword(password);
            usersModel.setEmail(email);
            return usersRepository.save(usersModel);
        } else {
            return null;
        }
    }

    public UsersModel authenticate(String login, String password) {
        return usersRepository.findByLoginAndPassword(login, password).orElse(null);
    }
}
