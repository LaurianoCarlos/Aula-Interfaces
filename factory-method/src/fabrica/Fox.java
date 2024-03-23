package fabrica;

public class Fox implements Carro {

    private double preco;
    private String modelo;

    public Fox() {

    }
    public Fox(double preco, String modelo) {
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
        return "Fox{" +
                "preco=" + preco +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
