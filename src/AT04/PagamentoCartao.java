package AT04;

public class PagamentoCartao extends Pagamento{
    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        return 0.03;
    }

    @Override
    public String tipoTaxa() {
        return "PAGAMENTO CARTÃO";
    }
}
