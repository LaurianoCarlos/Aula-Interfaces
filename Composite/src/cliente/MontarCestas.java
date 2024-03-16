package cliente;

import composicao.Componente;
import composicao.Composicao;
import composicao.Folha;

public class MontarCestas {
    public static void main(String[] args) {
        Composicao composicao = new Composicao("CESTA DE FRUTAS");

        composicao.adicionar(new Folha("Maça", 3.0));
        composicao.adicionar(new Folha("Manga", 5.0));
        composicao.adicionar(new Folha("Banana", 8.0));
        composicao.adicionar(new Folha("Uva", 6.0));
        composicao.adicionar(new Folha("Melancia", 3.0));
        composicao.adicionar(new Folha("Abacate", 3.0));

        System.out.println(composicao + "\n");
        System.out.println("Preço da cesta: R$" + composicao.getPreco());


        Composicao caixa = new Composicao("CAIXA DE BOMBOM");
        caixa.adicionar(new Folha("Sonho de Valsa", 22.50));
        caixa.adicionar(new Folha("Beijo de Moça", 22.50));
        caixa.adicionar(new Folha("Batom", 22.50));


        System.out.println(caixa + "\n");
        System.out.println("Preço da caixa de Bombom: R$" + caixa.getPreco());


    }
}
