package AT08;

public class IngressoInteiro extends Ingresso{
    public IngressoInteiro(String nomeEvento, double precoBase) {
        super(nomeEvento, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase();
    }
}
