package br.com.caelum.cadastro.br.com.caelum.cadastro.modelo;

import java.io.Serializable;

/**
 * Created by android6969 on 12/08/17.
 */

public class Aluno implements Serializable {
    private String nome;
    private String telefone;
    private String endereco;
    private String site;

    private Double nota;

    private Long id;

    public String toString(){
        return ("Nome: " + this.nome + " | Nota: " + this.nota.toString());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
