package AT06;

public class FuncionarioComissionado extends Funcionario {
    public FuncionarioComissionado(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + 500;
    }

    @Override
    public String tipoFuncionario() {
        return "Comissionado";
    }

    @Override
    public String tipoBonus() {
        return "R$500,00.";
    }
}
