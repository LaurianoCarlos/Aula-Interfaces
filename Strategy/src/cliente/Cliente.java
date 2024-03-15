package cliente;

import Strategy.*;
import modelo.Carga;

public class Cliente {
    public static void main(String[] args) {

        Carga carga = new Carga("Uva", 10.0);

        double frete = calcularFrete("ABC", carga);
        System.out.println("Produto: " + carga.getDescricao() + "\n" + "Frete: " + frete);

        carga.setDescricao("Goiaba");
        frete = calcularFrete("CBA", carga);
        System.out.println("Produto: " + carga.getDescricao() + "\n" + "Frete: " + frete);

         carga.setDescricao("Manga");
         frete = calcularFrete("XPTO", carga);


        System.out.println("Produto: " + carga.getDescricao() + "\n" + "Frete: " + frete);
        System.out.println("Frete: " + calcularFrete2(new XPTO(),  carga));
        System.out.println("Frete: " + ListaEmpresas.XPTO.calcularFrete(carga));
        System.out.println("Frete: " + calcularFrete3(2, carga));

    }

    public static double calcularFrete(String nomeEmpresa, Carga carga) {

        CalculoFrete calculoFrete;

        if (nomeEmpresa.equals("ABC")) {
            calculoFrete = new ABC();
            calculoFrete.calcularFrete(carga);
        } else if (nomeEmpresa.equals("CBA")) {
            calculoFrete = new CBA();
              calculoFrete.calcularFrete(carga);
        } else if (nomeEmpresa.equals("XPTO")) {
            calculoFrete = new XPTO();
             calculoFrete.calcularFrete(carga);
        } else {
            throw new IllegalArgumentException("Essa empresa não consta em nossa base de dados");
        }

        return calculoFrete.calcularFrete(carga);
    }

    public static  double calcularFrete2(CalculoFrete calculoFrete, Carga carga) {
        return calculoFrete.calcularFrete(carga);
    }

    public static  double calcularFrete3(int codEmpresa, Carga carga) {
        return  ListaEmpresas.values()[codEmpresa].calcularFrete(carga);
    }
}

