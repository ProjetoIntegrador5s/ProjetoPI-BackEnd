package com.projeto.app.Model;

import jakarta.persistence.*;

import java.io.File;
import java.util.Date;

@Entity
@Table(name = "estagiarios")
public class Estagiario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String matricula;
    @Column(nullable = false)
    private String nomeCurso;
    @Column(nullable = false)
    private String dataIngresso;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String email;
    @Column(nullable = true)
    private String relatorio1;
    @Column(nullable = true)
    private String relatorio2;
    @Column(nullable = true)
    private String statusRelatorio1;
    @Column(nullable = true)
    private String statusRelatorio2;
    @Column(nullable = true)
    private String comprovanteMatricula;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(String dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRelatorio1() {
        return relatorio1;
    }

    public void setRelatorio1(String relatorio1) {
        this.relatorio1 = relatorio1;
    }

    public String getRelatorio2() {
        return relatorio2;
    }

    public void setRelatorio2(String relatorio2) {
        this.relatorio2 = relatorio2;
    }

    public String getStatusRelatorio1() {
        return statusRelatorio1;
    }

    public void setStatusRelatorio1(String statusRelatorio1) {
        this.statusRelatorio1 = statusRelatorio1;
    }

    public String getStatusRelatorio2() {
        return statusRelatorio2;
    }

    public void setStatusRelatorio2(String statusRelatorio2) {
        this.statusRelatorio2 = statusRelatorio2;
    }

    public String getComprovanteMatricula() {
        return comprovanteMatricula;
    }

    public void setComprovanteMatricula(String comprovanteMatricula) {
        this.comprovanteMatricula = comprovanteMatricula;
    }
}
