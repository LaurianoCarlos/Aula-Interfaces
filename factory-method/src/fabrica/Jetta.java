package fabrica;

public class Jetta implements Carro {

    private double preco;
    private String modelo;


    public Jetta(){

    }
    public Jetta(double preco, String modelo) {
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
        return "Jetta{" +
                "preco=" + preco +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
