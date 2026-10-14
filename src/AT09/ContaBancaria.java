package AT09;

public abstract class ContaBancaria {
    protected String nome;
    private double saldo;

    public ContaBancaria(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Insira um nome válido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("O saldo tem que ser maior que zero!");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "\nNome: " + getNome() +
                "\nSaldo: R$" + calcularSaldo();
    }

    public abstract double calcularSaldo();

    public void exibirSaldo() {
        System.out.println(toString());
    }
}