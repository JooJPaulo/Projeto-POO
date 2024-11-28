public class Departmento {
    private int codigo;
    private String denominacao;

    public Departmento(int codigo, String denominacao) {
        this.codigo = codigo;
        this.denominacao = denominacao;
    }

    // Getters and Setters
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