package service;

import taxaEmpresa.Empresa;

public class CalculaFrete {
    public double calcularFrete(int empresa, double distancia) {
        return Empresa.values()[empresa].calcularFrete(distancia);
    }
}
