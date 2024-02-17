package departamentos;

public class Gerente {

    private String nome;

    public Gerente() {

    }
    public Gerente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void alterarSalario(double salario, Funcionario funcionario){
        funcionario.salario = salario;
    }
}
