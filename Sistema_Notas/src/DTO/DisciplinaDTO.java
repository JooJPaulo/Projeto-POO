package DTO;

public class DisciplinaDTO {
    
    private int codigo; // Código da disciplina
    private String denominacao; // Nome da disciplina
    private String sigla; // Sigla da disciplina
    private String ementa; // Ementa da disciplina

    public DisciplinaDTO(int codigo, String denominacao, String sigla, String ementa) {
        this.codigo = codigo;
        this.denominacao = denominacao;
        this.sigla = sigla;
        this.ementa = ementa;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDenominacao() {
        return denominacao;
    }
    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getEmenta() {
        return ementa;
    }
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
}