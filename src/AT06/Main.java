package AT06;

public class Main {
    static void main(String[] args) {
        //===============
        //  Criando CLT
        //===============
        //Instanciando o clt
        Funcionario clt = new FuncionarioCLT(
                "Marcelo",
                20000.00
        );

        //Exibindo os dados
        clt.exibirDados();

        //========================
        //  Criando Comissionado
        //========================
        //Instanciando o comissionado
        Funcionario comissionado = new FuncionarioComissionado(
                "Leandro",
                5000.00
        );

        //Exibindo os dados
        comissionado.exibirDados();
    }
}