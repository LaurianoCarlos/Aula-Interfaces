package fabrica;

public class Argo implements Carro {
    private double preco;
    private String modelo;

    public Argo() {

    }
    public Argo(double preco, String modelo) {
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
        return "Argo{" +
                "preco=" + preco +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
