package com.example.first.entity;
import javax.persistence.*;

@Entity
public class SubServises {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameSubServises;


    @ManyToOne
    private Servises servises;

    public SubServises() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSubServises() {
        return nameSubServises;
    }

    public void setNameSubServises(String nameSubServises) {
        this.nameSubServises = nameSubServises;
    }

    public Servises getServises() {
        return servises;
    }

    public void setServises(Servises servises) {
        this.servises = servises;
    }
}