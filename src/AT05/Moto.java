package AT05;

public class Moto extends Veiculo{
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando!" + "\n");
    }

    @Override
    public String buscarTipoVeiculo() {
        return "Moto";
    }
}
