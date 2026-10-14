package AT06;

public abstract class Funcionario {
    protected String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        setNome(nome);
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Informe um nome válido!");
        }
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        if (salarioBase > 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("O salário base tem que ser maior que zero!");
        }
    }

    @Override
    public String toString() {
        return "Funcionário " + tipoFuncionario() +
                "\nNome: " + nome +
                "\nValor do Bonus: " + tipoBonus() +
                "\nSalário Base: R$" + salarioBase +
                "\nSalário Final: R$" + calcularSalario();
    }

    public abstract double calcularSalario();
    public abstract String tipoFuncionario();
    public abstract String tipoBonus();

    public void exibirDados() {
        System.out.println(toString() + "\n");
    }
}