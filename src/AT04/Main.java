package AT04;

public class Main {
    static void main(String[] args) {
        //============
        //    PIX
        //============
        //Criando o pagamento por PIX
        Pagamento pix = new PagamentoPix(100.0);

        //Executando métodos:
        pix.exibirResumo();

        //============
        //   CARTÃO
        //============
        //Criando o pagamento por Cartão
        Pagamento cartao = new PagamentoCartao(100.0);

        //Executando métodos:
        cartao.exibirResumo();
    }
}
