package com.escola.senai;

public class Endereco {
    private String lougradouro;
    private int numero;
    private String cep;
    private String complemento;

    public Endereco(String lougradouro, int numero, String cep, String complemento) {
        this.lougradouro = lougradouro;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
    }

    public String getLougradouro() {
        return lougradouro;
    }

    public void setLougradouro(String lougradouro) {
        this.lougradouro = lougradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}
