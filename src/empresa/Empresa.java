package empresa;

import departamentos.Funcionario;
import departamentos.Gerente;

public class Empresa {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Abaão", 5000);

        Gerente gerente = new Gerente("Loro");


        System.out.println(funcionario);

        gerente.alterarSalario(6000, funcionario);

        System.out.println(funcionario);
    }
}
