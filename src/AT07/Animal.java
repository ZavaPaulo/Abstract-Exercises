package AT07;

public abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Insira um nome válido!");
        }
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Insira uma idade maior que zero!");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "\nNome: " + nome +
                "\nIdade : " + idade + " anos.";
    }

    public abstract void emitirSom();

    public void exibirDados() {
        System.out.println(toString() + "\n");
    }
}