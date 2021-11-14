/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atvbancodadosduda.model;

/**
 *
 * @author Maikindogral
 */
public class paciente {
    String endereço;
    int rg;
    String sexo;
    String avaliacao;
    String nome;
    int telefone;
    int cpf;
    String tratamento;
    int plano;
    int idade;
    String retorno;

    public paciente(String endereço, int rg, String sexo, String avaliacao, String nome, int telefone, int cpf, String tratamento, int plano, int idade, String retorno) {
        this.endereço = endereço;
        this.rg = rg;
        this.sexo = sexo;
        this.avaliacao = avaliacao;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.tratamento = tratamento;
        this.plano = plano;
        this.idade = idade;
        this.retorno = retorno;
    }

    public paciente() {
        this.endereço = null;
        this.rg = 0;
        this.sexo = null;
        this.avaliacao = null;
        this.nome = null;
        this.telefone = 0;
        this.cpf = 0;
        this.tratamento = null;
        this.plano = 0;
        this.idade = 0;
        this.retorno = null;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }
    
    
}
