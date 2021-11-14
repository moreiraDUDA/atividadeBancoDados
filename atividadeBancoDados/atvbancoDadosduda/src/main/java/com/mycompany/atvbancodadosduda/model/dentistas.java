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
public class dentistas {
    
   String endereço;
   String sexo;
   String email;
   int telefone;
   String nome;

    public dentistas(String endereço, String sexo, String email, int telefone, String nome) {
        this.endereço = endereço;
        this.sexo = sexo;
        this.email = email;
        this.telefone = telefone;
        this.nome = nome;
    }

    public dentistas() {
        this.endereço = null;
        this.sexo = null;
        this.email = null;
        this.telefone = 0;
        this.nome = null;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
}
