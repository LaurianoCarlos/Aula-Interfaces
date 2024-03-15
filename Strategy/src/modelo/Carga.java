package modelo;

public class Carga { //TAD tipo abstrato de dados
    private String descricao;
    private double peso;

    public Carga(){};

    public Carga(String descricao, double peso) {
        this.descricao = descricao;
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Carga{" +
                "descricao='" + descricao + '\'' +
                ", peso=" + peso +
                '}';
    }
}
