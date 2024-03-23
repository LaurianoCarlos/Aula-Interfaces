package fabrica;

public class Cronos implements Carro {
    private double preco;
    private String modelo;

    public Cronos() {

    }
    public Cronos(double preco, String modelo) {
        this.preco = preco;
        this.modelo = modelo;
    }

    @Override
    public double getPreco() {
        return 0;
    }

    @Override
    public String getModelo() {
        return null;
    }

    @Override
    public String toString() {
        return "Cronos{" +
                "preco=" + preco +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
