package exercicios.enums;

public enum Departamento implements exercicios.interfaces.Departamento {
    DESENVOLVIMENTO {
        double taxa = 0.05;
        @Override
        public double calcularBonus(double salario) {

            return (taxa * salario) + salario;
        }
    },

    SUPORTE {
        double taxa = 0.04;
        @Override
        public double calcularBonus(double salario) {

            return (taxa * salario) + salario;
        }
    },

    DEMAIS_DEPARTAMENTOS {
        double taxa = 0.03;
        @Override
        public double calcularBonus(double salario) {

            return (taxa * salario) + salario;
        }
    }
}
