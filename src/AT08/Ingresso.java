package AT08;

public abstract class Ingresso {
    protected String nomeEvento;
    private double precoBase;

    public Ingresso(String nomeEvento, double precoBase) {
        this.nomeEvento = nomeEvento;
        this.precoBase = precoBase;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }
    public void setNomeEvento(String nomeEvento) {
        if (!nomeEvento.isEmpty()) {
            this.nomeEvento = nomeEvento;
        } else {
            System.out.println("Informe um nome válido!");
        }
    }

    public double getPrecoBase() {
        return precoBase;
    }
    public void setPrecoBase(double precoBase) {
        if (precoBase > 0) {
            this.precoBase = precoBase;
        } else {
            System.out.println("O valor do ingresso tem que ser maior que zero!");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "\nNome: " + nomeEvento +
                "\nPreço: R$" + calcularPrecoFinal();
    }

    public abstract double calcularPrecoFinal();

    public void exibirIngresso() {
        System.out.println("= = = = = = = = = =");
        System.out.println(toString());
        System.out.println("= = = = = = = = = =");
    }
}