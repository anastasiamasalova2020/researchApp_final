package com.example.researchapp.service;

import com.example.researchapp.model.RepoModel;
import com.example.researchapp.model.UsersModel;
import com.example.researchapp.repository.ReposRepository;
import com.example.researchapp.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ReposService {
    private final ReposRepository reposRepository;

    public ReposService(ReposRepository reposRepository) {
        this.reposRepository = reposRepository;
    }

    public RepoModel addRepo(String name, Boolean isIndividual) {
        if (name != null) {
            RepoModel repoModel = new RepoModel();
            repoModel.setName(name);
            repoModel.setIndividual(isIndividual);
            repoModel.setDocuments(new ArrayList<>());
            return repoModel;
        } else {
            return null;
        }
    }
}
