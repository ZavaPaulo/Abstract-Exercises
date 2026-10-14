package AT05;

public class Carro extends Veiculo{
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando!" + "\n");
    }

    @Override
    public String buscarTipoVeiculo() {
        return "Carro";
    }
}
