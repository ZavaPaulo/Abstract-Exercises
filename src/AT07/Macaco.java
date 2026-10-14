package AT07;

public class Macaco extends Animal{
    public Macaco(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de macaco!");
    }
}