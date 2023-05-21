package model;

import pessoa.Pessoa;

import java.util.Collection;

public class Sistema {

    private Long id;
    private String nome;
    private String sigla;

    private Collection<Pessoa> pessoas;

    public Sistema() {
    }

    public Sistema(Long id, String nome, String sigla, Collection<Pessoa> pessoas) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
        this.pessoas = pessoas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Collection<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(Collection<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }


    @Override
    public String toString() {
        return "Sistema{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", pessoas=" + pessoas +
                '}';
    }
}
