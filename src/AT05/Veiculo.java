package AT05;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        if (!marca.isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Informe um nome de marca válida!");
        }
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        if (!modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Informe um nome de modelo válido!");
        }
    }

    public abstract void acelerar();
    public abstract String buscarTipoVeiculo();

    @Override
    public String toString() {
        return buscarTipoVeiculo() +
                "\nMarca: " + marca+
                "\nModelo: " + modelo;
    }

    public void exibirInformacoes() {
        System.out.println(toString() + "\n");
    }
}