package DTO;

public class ProfessorDTO {
    
    private int codigo; // Código do professor
    private String nome; // Nome do professor
    private String formacao; // Formação do professor
    private String endereco; // Endere��o do professor
    private String telefone; // Número de telefone do professor
    private String senha; // Senha do professor

    public ProfessorDTO(int codigo, String nome, String formacao, String endereco, String telefone, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.formacao = formacao;
        this.endereco = endereco;
        this.telefone = telefone;
        this.senha = senha;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
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
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
