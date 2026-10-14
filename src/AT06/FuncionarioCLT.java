package AT06;

public class FuncionarioCLT extends Funcionario{
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.1;
    }

    @Override
    public String tipoFuncionario() {
        return "CLT";
    }

    @Override
    public String tipoBonus() {
        return "10%";
    }
}
