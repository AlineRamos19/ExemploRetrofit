package br.com.android.altech.exemploretrofit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// comando utilziado para avisar ao conversao para ignorar essas propriedade JSON que nao serão usadas
@JsonIgnoreProperties({"complemento", "unidade", "ibge", "gia" })

public class Cep {

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    public Cep(){}

    public Cep(String cep, String logradouro, String bairro,
               String cidade, String uf) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = cidade;
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "CEP: " + getCep()
                + "\nLogradouro: " + getLogradouro()
                + "\nBairro: " + getBairro()
                + "\nCidade: " + getLocalidade()
                + "\nEstado: " + getUf();
    }
}
