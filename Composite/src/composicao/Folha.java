package composicao;

public class Folha implements Componente{

    private String nome;
    private double preco;

    public Folha(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Folha{" +"\n" +
                "nome='" + nome + '\n' +
                ", preco=" + preco +
                '}';
    }
}
