package DTO;

import java.util.Date;

public class AlunoDTO {
    
    private int matricula; // Matrícula do Aluno
    private String nome; // Nome do Aluno
    private String endereco; // Endereço do Aluno
    private String telefone; // Número de telefone do Aluno
    private String responsavel; // Nome do responsável
    private Date dataNascimento; // Data de nascimento do Aluno
    private String senha;

    // Constructor to match the one used in AlunoDAO
    public AlunoDTO(int matricula, String nome, String endereco, String telefone, String responsavel, Date dataNascimento, String senha) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.responsavel = responsavel;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    // Getters e Setters
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getresponsavel() {
        return responsavel;
    }
    public void setresponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}