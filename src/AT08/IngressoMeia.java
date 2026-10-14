package AT08;

public class IngressoMeia extends Ingresso{
    public IngressoMeia(String nomeEvento, double precoBase) {
        super(nomeEvento, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() / 2;
    }
}
