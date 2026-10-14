package AT04;

public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        setValor(valor);
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        } else {
            System.out.println("O valor tem que ser maior que zero!");
        }
    }

    public abstract double calcularTaxa();
    public abstract String tipoTaxa();

    public void exibirResumo() {
        System.out.println(
                tipoTaxa() +
                "\nValor: " + valor +
                "\nTaxa: " + (calcularTaxa() * 100) + "%" +
                "\nValor com taxa: " + valorTaxa() + "\n"
        );
    }

    public double valorTaxa() {
        return valor * (1 + calcularTaxa());
    }
}
