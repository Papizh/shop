package com.example.first.entity;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Servises {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameServises;

    private String descriptionsServises;


    @OneToMany(mappedBy = "servises")
    private List<SubServises> subServisesList = new ArrayList<>();


    public Servises() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameServises() {
        return nameServises;
    }

    public void setNameServises(String nameServises) {
        this.nameServises = nameServises;
    }

    public String getDescriptionsServises() {
        return descriptionsServises;
    }

    public void setDescriptionsServises(String descriptionsServises) {
        this.descriptionsServises = descriptionsServises;
    }

    public List<SubServises> getSubServisesList() {
        return subServisesList;
    }

    public void setSubServisesList(List<SubServises> subServisesList) {
        this.subServisesList = subServisesList;
    }

}
