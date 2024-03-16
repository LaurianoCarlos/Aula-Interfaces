package composicao;

import java.util.ArrayList;
import java.util.List;

public class Composicao implements Componente {

    private List<Componente> listaProdutos;
    private String nome;

    public Composicao(String nome) {
        this.nome = nome;
        listaProdutos = new ArrayList<>();
    }

    public void adicionar(Componente componente){
        listaProdutos.add(componente);
    }

    public void remover(Componente componente){
        listaProdutos.remove(componente);
    }

    @Override
    public double getPreco() {
        double precoTotal = 0.0;
        for (Componente produto : listaProdutos){
            precoTotal += produto.getPreco();
        }
        return precoTotal;
    }

    @Override
    public String toString() {
        return "Composicao{" +
                "listaProdutos=" + listaProdutos +
                ", nome='" + nome + '\'' +
                '}';
    }
}
