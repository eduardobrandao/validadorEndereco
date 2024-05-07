package application.core.domain;

import java.util.Date;

public class PessoaDomain {
    private String cpf;
    private String nome;
    private String nomeMae;
    private Date dataNascimento;
    private EnderecoDomain enderecoResidencial;
    private String ticket;
    private String hash;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public EnderecoDomain getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(EnderecoDomain enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }



    public PessoaDomain(String cpf, String nome, String nomeMae, Date dataNascimento, EnderecoDomain enderecoResidencial, String ticket, String hash) {
        this.cpf = cpf;
        this.nome = nome;
        this.nomeMae = nomeMae;
        this.dataNascimento = dataNascimento;
        this.enderecoResidencial = enderecoResidencial;
        this.ticket = ticket;
        this.hash = hash;
    }

    public PessoaDomain() {
    }
}
