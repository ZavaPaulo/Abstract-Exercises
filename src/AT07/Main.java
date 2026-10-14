package AT07;

public class Main {
    static void main(String[] args) {
        //==================
        //  Criando o Leão
        //==================
        //Instanciando o leão
        Animal leao = new Leao(
                "Mufasa",
                7
        );

        //Exibindo os dados do leão
        leao.exibirDados();

        //Emitindo som do leão
        leao.emitirSom();

        //===================
        //  Criando Macaco
        //===================
        //Instanciando Macaco
        Animal macaco = new Macaco(
                "George",
                2
        );

        //Exibindo os dados do Macaco
        macaco.exibirDados();

        //Emitindo o som do Macaco
        macaco.emitirSom();
    }
}
