package br.unitins.topicos1.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Flor extends PanacheEntity{
    private String nome;
    private String cor;
    private String descricao;
    public String getNome(){
        return nome;
    }
    public String getCor(){
        return cor;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}