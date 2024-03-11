package taxaEmpresa;

import empresa.EmpresaFrete;

public enum Empresa implements EmpresaFrete {

    ABC {
        double taxa = 0.1;
        @Override
        public double calcularFrete(double distancia) {
            return this.taxa * distancia;
        }
    },

    CBA {
        double taxa = 0.2;
        @Override
        public double calcularFrete(double distancia) {
            return this.taxa * distancia;
        }
    },

    XPTO {
        double taxa = 0.3;
        @Override
        public double calcularFrete(double distancia) {
            return this.taxa * distancia;
        }
    }
}
