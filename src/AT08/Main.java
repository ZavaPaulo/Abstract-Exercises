package AT08;

public class Main {
    static void main(String[] args) {
        //===================
        //  Ingresso Inteiro
        //===================
        //Instanciando ingresso inteiro
        Ingresso inteiro = new IngressoInteiro(
                "Cinema",
                40.00
        );

        //Apresentando o ingresso
        inteiro.exibirIngresso();

        //================
        //  Ingresso Meia
        //================
        //Instanciando ingresso meia
        Ingresso meia = new IngressoMeia(
                "Parque de Diversões",
                50.00
        );

        //Apresentando inrgresso
        meia.exibirIngresso();
    }
}
