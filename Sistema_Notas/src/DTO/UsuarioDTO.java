package DTO;

public class UsuarioDTO {
    
    private int id; // ID do usuário
    private String nome; // Nome do usuário
    private String senha; // Senha do usuário
    
    // Getter e Setter para o id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    // Getter e Setter para o nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Getter e Setter para a senha
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
