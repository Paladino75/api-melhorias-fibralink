package com.ApiMelhoriasFibralink.FibralinkMelhorias.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Colaboradores {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String nomeColaborador;
    private String nomeSetor;
    private String descricao;
    private String statusSolicitacao;
    LocalDate dataDeCriacao;

    public Colaboradores() {
    }

    public Colaboradores(int id, String nomeColaborador, String nomeSetor, String descricao, String statusSolicitacao, LocalDate dataDeCriacao) {
        this.id = id;
        this.nomeColaborador = nomeColaborador;
        this.nomeSetor = nomeSetor;
        this.descricao = descricao;
        this.statusSolicitacao = statusSolicitacao;
        this.dataDeCriacao = dataDeCriacao;
    }


    public long getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getNomeColaborador() {
        return nomeColaborador;
    }

    public void setNomeColaborador(String nomeColaborador) {
        this.nomeColaborador = nomeColaborador;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatusSolicitacao() {
        return statusSolicitacao;
    }

    public void setStatusSolicitacao(String statusSolicitacao) {
        this.statusSolicitacao = statusSolicitacao;
    }

    public LocalDate getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(LocalDate dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    @Override
    public String toString() {
        return "melhorias{" +
                "id=" + id +
                ", nomeColaborador='" + nomeColaborador + '\'' +
                ", nomeSetor='" + nomeSetor + '\'' +
                ", descricao='" + descricao + '\'' +
                ", statusSolicitacao='" + statusSolicitacao + '\'' +
                ", dataDeCriacao=" + dataDeCriacao +
                '}';
    }
}

