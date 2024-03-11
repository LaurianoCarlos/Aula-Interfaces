package exercicios;

import exercicios.enums.Ordenacao;
import exercicios.service.BonusService;

import java.util.Arrays;

public class Teste {
    public static void main(String[] args){
        double salario = 1000;

        double salario1 = BonusService.calcularBonus(0, salario);
        double salario2 = BonusService.calcularBonus(1, salario);
        double salario3 = BonusService.calcularBonus(2, salario);

        System.out.println("Salario + bonus = " + salario1);
        System.out.println("Salario + bonus = " + salario2);
        System.out.println("Salario + bonus = " + salario3);

        int vetor[] = {3, 1, 5, 2, 6, 4};

        Ordenacao.INSERTION.ordernar(vetor);
        System.out.println(Arrays.toString(vetor));

        Ordenacao.SELECTION.ordernar(vetor);
        System.out.println(Arrays.toString(vetor));

        Ordenacao.BUBBLE.ordernar(vetor);
        System.out.println(Arrays.toString(vetor));
    }
}
