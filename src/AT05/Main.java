package AT05;

public class Main {
    static void main(String[] args) {
        //=================
        //  Criando Carro
        //=================
        //Instanciando o carro
        Veiculo carro = new Carro(
                "Ford",
                "Mustang GT"
        );

        //Executando 'exibirInformacaoes()'
        carro.exibirInformacoes();

        //Acelerando o carro
        carro.acelerar();

        //=================
        //  Criando Moto
        //=================
        //Instanciando moto
        Veiculo moto = new Moto(
                "Kasazaki",
                "Z900"
        );

        //Executando 'exibirInformacaoes()'
        moto.exibirInformacoes();

        //Acelerando moto
        moto.acelerar();
    }
}
