package AT09;

public class Main {
    static void main(String[] args) {
        //Instanciando Conta Poupança
        ContaBancaria poupanca = new ContaPoupanca(
                "Paulo",
                10000.00
        );

        //Exibindo informação da conta popança
        poupanca.exibirSaldo();

        System.out.println();

        //Intanciando Conta Investimento
        ContaBancaria investimento = new ContaInvestimento(
                "Paulo Filho",
                20000.00
        );

        //Exibindo informações da conta de investimentos
        investimento.exibirSaldo();
    }
}
