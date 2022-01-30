package com.example.researchapp.repository;

import com.example.researchapp.model.RepoModel;
import com.example.researchapp.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReposRepository extends  JpaRepository<RepoModel, Integer> {
    Optional<RepoModel> findById(int id);
}
