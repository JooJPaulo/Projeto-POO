package DTO;

public class DepartamentoDTO {

    private int codigo;

    private String denominacao;

    public DepartamentoDTO(int codigo, String denominacao) {
        this.codigo = codigo;
        this.denominacao = denominacao;
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
}
