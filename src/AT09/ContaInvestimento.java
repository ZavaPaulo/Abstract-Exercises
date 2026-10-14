package AT09;

public class ContaInvestimento extends ContaBancaria{
    public ContaInvestimento(String nome, double saldo) {
        super(nome, saldo);
    }

    @Override
    public double calcularSaldo() {
        return getSaldo() * 1.02;
    }
}
