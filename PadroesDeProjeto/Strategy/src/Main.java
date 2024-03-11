import service.CalculaFrete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Insira a distancia: ");
            double distancia = input.nextDouble();

            System.out.println("Selecione a empresa: ");
            System.out.println("[0] ABC: ");
            System.out.println("[1] CBA: ");
            System.out.println("[2] XPTO: ");
            System.out.print("Opção: ");
            int empresa = input.nextInt();

            CalculaFrete calculaFrete = new CalculaFrete();

            System.out.println("Valor do frete: " + calculaFrete.calcularFrete(empresa, distancia));

            System.out.println("Press '0' para Sair ou '1' para continuar: ");
            opcao = input.nextInt();
        }
    }
}