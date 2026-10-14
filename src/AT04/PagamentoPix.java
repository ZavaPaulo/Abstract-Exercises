package AT04;

public class PagamentoPix extends Pagamento{
    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        return 0;
    }

    @Override
    public String tipoTaxa() {
        return "PAGAMENTO PIX";
    }
}
