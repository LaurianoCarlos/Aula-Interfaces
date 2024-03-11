package exercicios.service;

import exercicios.enums.Departamento;

public class BonusService {
    public static double  calcularBonus(int departamento, double salario) {
        return Departamento.values()[departamento].calcularBonus(salario);
    }
}
