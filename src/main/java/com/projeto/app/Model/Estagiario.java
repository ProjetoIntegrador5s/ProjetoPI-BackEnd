package com.projeto.app.Model;

import jakarta.persistence.*;

import java.io.File;
import java.util.Date;

@Entity
@Table(name = "estagiarios")
public class Estagiario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nome;

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {
        this.nome = nome;
    }



}
