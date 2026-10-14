package AT09;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String nome, double saldo) {
        super(nome, saldo);
    }

    @Override
    public double calcularSaldo() {
        return getSaldo() * 1.01;
    }
}
