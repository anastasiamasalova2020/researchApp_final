package com.example.researchapp.model;

import javax.persistence.*;
import java.util.*;
import java.util.List;


@Entity
@Table(name = "repo_table")
public class RepoModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Integer id;

    String name;
    Boolean isIndividual;

    @ElementCollection
    public List<String> documents = new ArrayList<String>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIndividual() {
        return isIndividual;
    }

    public void setIndividual(Boolean individual) {
        isIndividual = individual;
    }

    public List<String> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<String> documents) {
        this.documents = documents;
    }

    public void addDocument(String document) {
        this.documents.add(document);
    }

    public void removeDocument(String document) {
        this.documents.remove(document);
    }
}
