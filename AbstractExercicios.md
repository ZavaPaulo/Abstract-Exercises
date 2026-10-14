# Abstract

[**AT02	2**](#at02)

[**Resposta:	2**](#resposta:)

[Main	2](#main)

[Entrega	3](#entrega)

[EntregaLocal	4](#entregalocal)

[EntregaNacional	4](#entreganacional)

[**AT03	5**](#at03)

[**Resposta:	5**](#resposta:-1)

[Main	5](#main-1)

[Personagem	7](#personagem)

[Guerreiro	9](#guerreiro)

[Mago	10](#mago)

[**AT04	10**](#at04)

[**Desafio 1 — Sistema de pagamento (AT04)	10**](#desafio-1-—-sistema-de-pagamento-\(at04\))

[Resposta	11](#resposta)

[Main	11](#main-2)

[Pagamento	11](#pagamento)

[PagamentoPix	12](#pagamentopix)

[PagamentoCartao	13](#pagamentocartao)

[**AT05	13**](#at05)

[Desafio 2 — Sistema de veículos (AT05)	13](#desafio-2-—-sistema-de-veículos-\(at05\))

[Resposta:	13](#resposta:-2)

[Main	13](#main-3)

[Veiculo	14](#veiculo)

[Carro	15](#carro)

[Moto	16](#moto)

[**AT06	16**](#at06)

[**Desafio 3 — Sistema de funcionários (AT06)	16**](#desafio-3-—-sistema-de-funcionários-\(at06\))

[Resposta:	17](#resposta:-3)

[Main	17](#main-4)

[Funcionario	17](#funcionario)

[FuncionarioCLT	18](#funcionarioclt)

[FuncionarioComissionado	19](#funcionariocomissionado)

[**AT07	19**](#at07)

[**Desafio 4 — Sistema de animais (AT07)	19**](#desafio-4-—-sistema-de-animais-\(at07\))

[Resposta:	20](#resposta:-4)

[Main	20](#main-5)

[Animal	21](#animal)

[Leao	22](#leao)

[Macaco	22](#macaco)

[**AT08	22**](#at08)

[**Desafio 5 — Sistema de ingressos (AT08)	22**](#desafio-5-—-sistema-de-ingressos-\(at08\))

[Resposta:	23](#resposta:-5)

[Main	23](#main-6)

[Ingresso	23](#ingresso)

[IngressoInteiro	24](#ingressointeiro)

[IngressoMeia	25](#ingressomeia)

[**AT09	25**](#at09)

[Desafio 6 — Sistema de contas bancárias (AT09)	25](#desafio-6-—-sistema-de-contas-bancárias-\(at09\))

[Resposta:	26](#resposta:-6)

[Main	26](#main-7)

[ContaBancaria	26](#contabancaria)

[ContaPoupanca	27](#contapoupanca)

[ContaInvestimento	28](#containvestimento)

# AT02 {#at02}

Desenvolva um sistema simples para controle de entregas de pedidos.  
Crie uma classe abstrata chamada Entrega com:

* atributo codigoPedido (String);  
* método abstrato calcularValorFrete();  
* método concreto exibirResumo() que mostra o código e o valor final do frete.

Crie duas subclasses:

* EntregaLocal: frete fixo de R\$10,00.  
* EntregaNacional: frete \= distancia \* 1.5.  
* No main, instancie as duas classes e mostre o resumo das entregas.

# Resposta: {#resposta:}

## Main {#main}

package AT02;  
import java.util.Scanner;

public class Main {  
   static void main(String\[\] args) {  
       Scanner leitor \= new Scanner(System.*in*);  
       Entrega entregaLocal \= new EntregaLocal("123");  
       System.*out*.println("= \= \= \= Entrega Local \= \= \= \=");  
       entregaLocal.exibirResumo();  
       *pularLinha*();

       System.*out*.print("Informe a distância para calcular o valor do frete: ");  
       double distancia \= leitor.nextDouble();

       Entrega entregaNacional \= new EntregaNacional("456", distancia);  
       System.*out*.println("= \= \= \= Entrega Nacional \= \= \= \=");  
       entregaNacional.exibirResumo();  
       *pularLinha*();

       leitor.close();  
   }

   public static void pularLinha() {  
       System.*out*.println();  
       System.*out*.println();  
   }  
}

## Entrega {#entrega}

package AT02;

public abstract class Entrega {  
   protected String codigoProduto;

   public Entrega(String codigoProduto) {  
       setCodigoProduto(codigoProduto);  
   }

   public String getCodigoProduto() {  
       return codigoProduto;  
   }

   public void setCodigoProduto(String codigoProduto) {  
       if (\!codigoProduto.isEmpty()) {  
           this.codigoProduto \= codigoProduto;  
       } else {  
           System.*out*.println("O código do produto é  inválido");  
       }  
   }

   public abstract double calcularValorFrete();

   public void exibirResumo() {  
       System.*out*.println("Código: " \+ codigoProduto);  
       System.*out*.println("Valor do frete: R\$" \+ calcularValorFrete());

   }  
}

## EntregaLocal {#entregalocal}

package AT02;

public class EntregaLocal extends Entrega{  
   public EntregaLocal(String codigoProduto) {  
       super(codigoProduto);  
   }

   @Override  
   public double calcularValorFrete() {  
       return 10.00;  
   }  
}

## EntregaNacional {#entreganacional}

package AT02;

public class EntregaNacional extends Entrega{  
   private double distancia;

   public EntregaNacional(String codigoProduto, double distancia) {  
       super(codigoProduto);  
       this.distancia \= distancia;  
   }

   public double getDistancia() {  
       return distancia;  
   }  
   public void setDistancia(double distancia) {  
       this.distancia \= distancia;  
   }

   @Override  
   public double calcularValorFrete() {  
       return distancia \* 1.5;  
   }

   @Override  
   public void exibirResumo() {  
       super.exibirResumo();  
       System.*out*.println("Distância: " \+ distancia);  
   }  
}

# AT03 {#at03}

Implemente um sistema simples de personagens de um jogo.  
Crie uma classe abstrata Personagem com:

* atributos nome e nivel;  
* método abstrato atacar();  
* método concreto exibirStatus() mostrando o nome e nível do personagem.

Crie as subclasses:

* Guerreiro: ataque físico, imprime "Golpe de espada\!";  
* Mago: ataque mágico, imprime "Lança feitiço\!".

Na main, crie um guerreiro e um mago, exiba o status de cada um e realize seus ataques.  
Com base no arquivo anexado, identifiquei que os exercícios AT02 e AT03 trabalham principalmente com Programação Orientada a Objetos (POO) em Java, utilizando classes abstratas, herança, métodos abstratos, métodos concretos, sobrescrita de métodos e instanciação de objetos.

# Resposta: {#resposta:-1}

## Main {#main-1}

package AT03;  
import java.util.Timer;

public class Main {  
   static void main(String\[\] args) throws InterruptedException {  
       //Instanciando a classe Guerreiro:  
       Personagem guerreiro \= new Guerreiro("São Jorge");

       //Instanciando o Mago  
       Personagem mago \= new Mago("Merlin");

       //= \= \= \= \= \= \= \= \= \= \= \= \=  
       //       STATUS BASE  
       //= \= \= \= \= \= \= \= \= \= \= \= \=  
       System.*out*.println("= \= \= \= \= STATUS BASE \= \= \= \= \=");

       //= \= \= \= \= \= \= \= \= \= \=  
       //     GUERREIRO  
       //= \= \= \= \= \= \= \= \= \= \=  
       System.*out*.println("= \= \= \= GUERREIRO \= \= \= \=");

       //Exibindo os status do guerreiro  
       guerreiro.exibirStatus();  
       System.*out*.println();  
       Thread.*sleep*(1500);

       //Guerreiro subindo de nível  
       guerreiro.subirNivel();  
       System.*out*.println();  
       Thread.*sleep*(1500);

       //Exibindo os status do guerreiro depois de subir de nível  
       guerreiro.exibirStatus();  
       Thread.*sleep*(1500);

       System.*out*.println();  
       System.*out*.println();

       Thread.*sleep*(3000);

       //= \= \= \= \= \= \= \= \= \= \=  
       //        MAGO  
       //= \= \= \= \= \= \= \= \= \= \=  
       System.*out*.println("= \= \= \= MAGO \= \= \= \=");

       //Exibindo os status do mago  
       mago.exibirStatus();  
       System.*out*.println();  
       Thread.*sleep*(1500);

       //Mago subindo de nível  
       mago.subirNivel();  
       System.*out*.println();  
       Thread.*sleep*(1500);

       //Exibindo os status do mago depois de subir de nível  
       mago.exibirStatus();  
       System.*out*.println();  
       Thread.*sleep*(1500);

       //= \= \= \= \= \= \= \= \= \= \=  
       //   DEPOIS DE ATACAR  
       //= \= \= \= \= \= \= \= \= \= \=  
       System.*out*.println("= \= \= \= \= ATAQUES \= \= \= \= \=");

       //= \= \= \= \= \= \= \= \= \= \=  
       //     GUERREIRO  
       //= \= \= \= \= \= \= \= \= \= \=  
       System.*out*.println("= \= \= GUERREIRO ATACA \= \= \=");

       //Guerreiro usando o seu ataque  
       guerreiro.atacar(mago);  
       System.*out*.println();  
       Thread.*sleep*(1500);

       //Status do mago depois do ataque  
       mago.exibirStatus();  
       System.*out*.println();  
       Thread.*sleep*(3000);

       //= \= \= \= \= \= \= \= \= \= \=  
       //        MAGO  
       //= \= \= \= \= \= \= \= \= \= \=  
       System.*out*.println("= \= \= MAGO ATACA \= \= \=");  
        
       //Mago atacando o guerreiro  
       mago.atacar(guerreiro);  
       System.*out*.println();  
       Thread.*sleep*(1500);

       //Exibindo status do guerreiro depois do ataque  
       guerreiro.exibirStatus();  
       System.*out*.println();  
       Thread.*sleep*(1500);  
   }  
}

## Personagem {#personagem}

package AT03;

public abstract class Personagem {  
   protected String nome;  
   protected int nivel;  
   private int vida;  
   protected int forca;

   public Personagem(String nome) {  
       setNome(nome);  
       this.nivel \= 1;  
       this.vida \= 100;  
       this.forca \= 25;  
   }

   public String getNome() {  
       return nome;  
   }  
   public void setNome(String nome) {  
       if (\!nome.isEmpty()) {  
           this.nome \= nome;  
       } else {  
           System.*out*.println("Nome informado é inválido\!");  
       }  
   }

   public int getNivel() {  
       return nivel;  
   }  
   public void setNivel(int nivel) {  
       if (nivel \> 0) {  
           this.nivel \= nivel;  
       } else {  
           System.*out*.println("O nível tem que ser maior que zero\!");  
       }  
   }

   public int getVida() {  
       return vida;  
   }  
   public void setVida(int vida) {  
       if (vida \>= 0) {  
           this.vida \= vida;  
       } else {  
           System.*out*.println("Os pontos de vida tem que ser maior que zero\!");  
       }  
   }  
   public void menosVida(int dano) {  
       if (dano \> 0) {  
           setVida(getVida() \- dano);  
           if (getVida() \< 0) {  
               setVida(0);  
           }  
       } else {  
           System.*out*.println("O dano tem que ser maior que zero\!");  
       }  
   }

   public int getForca() {  
       return forca;  
   }  
   public void setForca(int forca) {  
       if (forca \> 0) {  
           this.forca \= forca;  
       } else {  
           System.*out*.println("A força do personagem tem que ser maior que zero\!");  
       }  
   }

   @Override  
   public String toString() {  
       return "Nome: " \+ nome \+  
               "\\nVida: " \+ vida \+  
               "\\nForça: " \+ forca \+  
               "\\nNível: " \+ nivel;  
   }

   public void subirNivel() {  
       System.*out*.println(getNome() \+ " subiu de níve\!");  
       System.*out*.print(nivel \+ " \-\> ");  
       nivel\++;  
       System.*out*.println(nivel);  
   }

   public void receberDano(int forca) {  
       menosVida(forca);  
   }

   public abstract void atacar(Personagem persongem);

   public void exibirStatus() {  
       System.*out*.println(toString());  
   }

   public void informandoAtaque(Personagem personagem) {  
       System.*out*.println(personagem.getNome() \+ " recebeu o ataque: ");  
       System.*out*.print("Sua vida saiu de " \+ personagem.getVida());  
       personagem.receberDano(getForca());  
       System.*out*.println(" \-\> " \+ personagem.getVida());  
   }  
}

## Guerreiro {#guerreiro}

package AT03;

public class Guerreiro extends Personagem{  
   public Guerreiro(String nome) {  
       super(nome);  
       setForca(30);  
   }

   @Override  
   public void atacar(Personagem personagem) {  
       System.*out*.println(getNome() \+ " ataca:");  
       System.*out*.println("Golpe de espada\!");  
       informandoAtaque(personagem);  
   }  
}

## Mago {#mago}

package AT03;

public class Mago extends Personagem{  
   public Mago(String nome) {  
       super(nome);  
       setForca(20);  
   }

   @Override  
   public void atacar(Personagem personagem) {  
       System.*out*.println(getNome() \+ " ataca:");  
       System.*out*.println("Lança feitiço\!");  
       informandoAtaque(personagem);  
   }  
}

# AT04 {#at04}

# **Desafio 1 — Sistema de pagamento (AT04)** {#desafio-1-—-sistema-de-pagamento-(at04)}

Desenvolva um sistema simples para processar pagamentos.

Crie uma classe abstrata chamada `Pagamento` com:

* Atributo `valor` (`double`);  
* Método abstrato `calcularTaxa()`;  
* Método concreto `exibirResumo()` que mostra o valor do pagamento e a taxa calculada.

Crie duas subclasses:

* `PagamentoPix`: taxa de 0%;  
* `PagamentoCartao`: taxa de 3% sobre o valor.

Na `main`, crie um pagamento via Pix e outro via cartão e exiba seus resumos.

## Resposta {#resposta}

### Main {#main-2}

package AT04;

public class Main {  
   static void main(String\[\] args) {  
       //============  
       //    PIX  
       //============  
       //Criando o pagamento por PIX  
       Pagamento pix \= new PagamentoPix(100.0);

       //Executando métodos:  
       pix.exibirResumo();

       //============  
       //   CARTÃO  
       //============  
       //Criando o pagamento por Cartão  
       Pagamento cartao \= new PagamentoCartao(100.0);

       //Executando métodos:  
       cartao.exibirResumo();  
   }  
}

### Pagamento {#pagamento}

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
       if (valor \> 0) {  
           this.valor \= valor;  
       } else {  
           System.*out*.println("O valor tem que ser maior que zero\!");  
       }  
   }

   public abstract double calcularTaxa();  
   public abstract String tipoTaxa();

   public void exibirResumo() {  
       System.*out*.println(  
               tipoTaxa() \+  
               "\\nValor: " \+ valor \+  
               "\\nTaxa: " \+ (calcularTaxa() \* 100) \+ "%" \+  
               "\\nValor com taxa: " \+ valorTaxa() \+ "\\n"  
       );  
   }

   public double valorTaxa() {  
       return valor \* (1 \+ calcularTaxa());  
   }  
}

### PagamentoPix {#pagamentopix}

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

### PagamentoCartao {#pagamentocartao}

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

# AT05 {#at05}

## **Desafio 2 — Sistema de veículos (AT05)** {#desafio-2-—-sistema-de-veículos-(at05)}

Implemente um sistema simples para representar veículos.

Crie uma classe abstrata chamada `Veiculo` com:

* Atributos `marca` e `modelo`;  
* Método abstrato `acelerar()`;  
* Método concreto `exibirInformacoes()` que mostra a marca e o modelo.

Crie as subclasses:

* `Carro`: imprime `"O carro está acelerando!"`;  
* `Moto`: imprime `"A moto está acelerando!"`.

Na `main`, crie um carro e uma moto, exiba suas informações e execute o método `acelerar()` de cada um.

## Resposta: {#resposta:-2}

### Main {#main-3}

package AT05;

public class Main {  
   static void main(String\[\] args) {  
       //=================  
       //  Criando Carro  
       //=================  
       //Instanciando o carro  
       Veiculo carro \= new Carro(  
               "Ford",  
               "Mustang GT"  
       );

       //Executando 'exibirInformacaoes()'  
       carro.exibirInformacoes();

       //Acelerando o carro  
       carro.acelerar();

       //=================  
       //  Criando Moto  
       //=================  
       //Instanciando moto  
       Veiculo moto \= new Moto(  
               "Kasazaki",  
               "Z900"  
       );

       //Executando 'exibirInformacaoes()'  
       moto.exibirInformacoes();

       //Acelerando moto  
       moto.acelerar();  
   }  
}

### Veiculo {#veiculo}

package AT05;

public abstract class Veiculo {  
   protected String marca;  
   protected String modelo;

   public Veiculo(String marca, String modelo) {  
       this.marca \= marca;  
       this.modelo \= modelo;  
   }

   public String getMarca() {  
       return marca;  
   }  
   public void setMarca(String marca) {  
       if (\!marca.isEmpty()) {  
           this.marca \= marca;  
       } else {  
           System.*out*.println("Informe um nome de marca válida\!");  
       }  
   }

   public String getModelo() {  
       return modelo;  
   }  
   public void setModelo(String modelo) {  
       if (\!modelo.isEmpty()) {  
           this.modelo \= modelo;  
       } else {  
           System.*out*.println("Informe um nome de modelo válido\!");  
       }  
   }

   public abstract void acelerar();  
   public abstract String buscarTipoVeiculo();

   @Override  
   public String toString() {  
       return buscarTipoVeiculo() \+  
               "\\nMarca: " \+ marca\+  
               "\\nModelo: " \+ modelo;  
   }

   public void exibirInformacoes() {  
       System.*out*.println(toString() \+ "\\n");  
   }  
}

### Carro {#carro}

package AT05;

public class Carro extends Veiculo{  
   public Carro(String marca, String modelo) {  
       super(marca, modelo);  
   }

   @Override  
   public void acelerar() {  
       System.*out*.println("O carro está acelerando\!" \+ "\\n");  
   }

   @Override  
   public String buscarTipoVeiculo() {  
       return "Carro";  
   }  
}

### Moto {#moto}

package AT05;

public class Moto extends Veiculo{  
   public Moto(String marca, String modelo) {  
       super(marca, modelo);  
   }

   @Override  
   public void acelerar() {  
       System.*out*.println("A moto está acelerando\!" \+ "\\n");  
   }

   @Override  
   public String buscarTipoVeiculo() {  
       return "Moto";  
   }  
}

# AT06 {#at06}

# **Desafio 3 — Sistema de funcionários (AT06)** {#desafio-3-—-sistema-de-funcionários-(at06)}

Desenvolva um sistema para calcular o salário de diferentes funcionários.

Crie uma classe abstrata chamada `Funcionario` com:

* Atributos `nome` (`String`) e `salarioBase` (`double`);  
* Método abstrato `calcularSalario()`;  
* Método concreto `exibirDados()` que mostra o nome e o salário final.

Crie as subclasses:

* `FuncionarioCLT`: salário final igual ao salário-base mais 10% de bônus;  
* `FuncionarioComissionado`: salário final igual ao salário-base mais uma comissão fixa de R\$ 500,00.

Na `main`, instancie os dois tipos de funcionários e exiba seus dados.

## Resposta: {#resposta:-3}

### Main {#main-4}

package AT06;

public class Main {  
   static void main(String\[\] args) {  
       //===============  
       //  Criando CLT  
       //===============  
       //Instanciando o clt  
       Funcionario clt \= new FuncionarioCLT(  
               "Marcelo",  
               20000.00  
       );

       //Exibindo os dados  
       clt.exibirDados();

       //========================  
       //  Criando Comissionado  
       //========================  
       //Instanciando o comissionado  
       Funcionario comissionado \= new FuncionarioComissionado(  
               "Leandro",  
               5000.00  
       );

       //Exibindo os dados  
       comissionado.exibirDados();  
   }  
}

### Funcionario {#funcionario}

package AT06;

public abstract class Funcionario {  
   protected String nome;  
   private double salarioBase;

   public Funcionario(String nome, double salarioBase) {  
       setNome(nome);  
       setSalarioBase(salarioBase);  
   }

   public String getNome() {  
       return nome;  
   }  
   public void setNome(String nome) {  
       if (\!nome.isEmpty()) {  
           this.nome \= nome;  
       } else {  
           System.*out*.println("Informe um nome válido\!");  
       }  
   }

   public double getSalarioBase() {  
       return salarioBase;  
   }  
   public void setSalarioBase(double salarioBase) {  
       if (salarioBase \> 0) {  
           this.salarioBase \= salarioBase;  
       } else {  
           System.*out*.println("O salário base tem que ser maior que zero\!");  
       }  
   }

   @Override  
   public String toString() {  
       return "Funcionário " \+ tipoFuncionario() \+  
               "\\nNome: " \+ nome \+  
               "\\nValor do Bonus: " \+ tipoBonus() \+  
               "\\nSalário Base: R\$" \+ salarioBase \+  
               "\\nSalário Final: R\$" \+ calcularSalario();  
   }

   public abstract double calcularSalario();  
   public abstract String tipoFuncionario();  
   public abstract String tipoBonus();

   public void exibirDados() {  
       System.*out*.println(toString() \+ "\\n");  
   }  
}

### FuncionarioCLT {#funcionarioclt}

package AT06;

public class FuncionarioCLT extends Funcionario{  
   public FuncionarioCLT(String nome, double salarioBase) {  
       super(nome, salarioBase);  
   }

   @Override  
   public double calcularSalario() {  
       return getSalarioBase() \* 1.1;  
   }

   @Override  
   public String tipoFuncionario() {  
       return "CLT";  
   }

   @Override  
   public String tipoBonus() {  
       return "10%";  
   }  
}

### FuncionarioComissionado {#funcionariocomissionado}

package AT06;

public class FuncionarioComissionado extends Funcionario {  
   public FuncionarioComissionado(String nome, double salarioBase) {  
       super(nome, salarioBase);  
   }

   @Override  
   public double calcularSalario() {  
       return getSalarioBase() \+ 500;  
   }

   @Override  
   public String tipoFuncionario() {  
       return "Comissionado";  
   }

   @Override  
   public String tipoBonus() {  
       return "R\$500,00.";  
   }  
}

# AT07 {#at07}

# **Desafio 4 — Sistema de animais (AT07)** {#desafio-4-—-sistema-de-animais-(at07)}

Implemente um sistema para representar animais de um zoológico.

Crie uma classe abstrata chamada `Animal` com:

* Atributos `nome` e `idade`;  
* Método abstrato `emitirSom()`;  
* Método concreto `exibirDados()` que mostra o nome e a idade do animal.

Crie as subclasses:

* `Leao`: imprime `"Rugido!"`;  
* `Macaco`: imprime `"Som de macaco!"`.

Na `main`, crie um leão e um macaco, exiba seus dados e faça cada animal emitir seu som.

## Resposta: {#resposta:-4}

### Main {#main-5}

package AT07;

public class Main {  
   static void main(String\[\] args) {  
       //==================  
       //  Criando o Leão  
       //==================  
       //Instanciando o leão  
       Animal leao \= new Leao(  
               "Mufasa",  
               7  
       );

       //Exibindo os dados do leão  
       leao.exibirDados();

       //Emitindo som do leão  
       leao.emitirSom();

       //===================  
       //  Criando Macaco  
       //===================  
       //Instanciando Macaco  
       Animal macaco \= new Macaco(  
               "George",  
               2  
       );

       //Exibindo os dados do Macaco  
       macaco.exibirDados();

       //Emitindo o som do Macaco  
       macaco.emitirSom();  
   }  
}

### Animal {#animal}

package AT07;

public abstract class Animal {  
   protected String nome;  
   protected int idade;

   public Animal(String nome, int idade) {  
       this.nome \= nome;  
       this.idade \= idade;  
   }

   public String getNome() {  
       return nome;  
   }  
   public void setNome(String nome) {  
       if (\!nome.isEmpty()) {  
           this.nome \= nome;  
       } else {  
           System.*out*.println("Insira um nome válido\!");  
       }  
   }

   public int getIdade() {  
       return idade;  
   }  
   public void setIdade(int idade) {  
       if (idade \> 0) {  
           this.idade \= idade;  
       } else {  
           System.*out*.println("Insira uma idade maior que zero\!");  
       }  
   }

   @Override  
   public String toString() {  
       return getClass().getSimpleName() \+  
               "\\nNome: " \+ nome \+  
               "\\nIdade : " \+ idade \+ " anos.";  
   }

   public abstract void emitirSom();

   public void exibirDados() {  
       System.*out*.println(toString() \+ "\\n");  
   }  
}

### Leao {#leao}

package AT07;

public class Leao extends Animal{  
   public Leao(String nome, int idade) {  
       super(nome, idade);  
   }

   @Override  
   public void emitirSom() {  
       System.*out*.println("Rugido\!");  
   }  
}

### Macaco {#macaco}

package AT07;

public class Macaco extends Animal{  
   public Macaco(String nome, int idade) {  
       super(nome, idade);  
   }

   @Override  
   public void emitirSom() {  
       System.*out*.println("Som de macaco\!");  
   }  
}

# AT08 {#at08}

# **Desafio 5 — Sistema de ingressos (AT08)** {#desafio-5-—-sistema-de-ingressos-(at08)}

Desenvolva um sistema para calcular o preço de ingressos de eventos.

Crie uma classe abstrata chamada `Ingresso` com:

* Atributos `nomeEvento` (`String`) e `precoBase` (`double`);  
* Método abstrato `calcularPrecoFinal()`;  
* Método concreto `exibirIngresso()` que mostra o evento e o preço final.

Crie as subclasses:

* `IngressoInteiro`: preço final igual ao preço-base;  
* `IngressoMeia`: preço final correspondente a 50% do preço-base.

Na `main`, crie um ingresso inteiro e um ingresso de meia-entrada e mostre os resultados.

## Resposta: {#resposta:-5}

### Main {#main-6}

package AT08;

public class Main {  
   static void main(String\[\] args) {  
       //===================  
       //  Ingresso Inteiro  
       //===================  
       //Instanciando ingresso inteiro  
       Ingresso inteiro \= new IngressoInteiro(  
               "Cinema",  
               40.00  
       );

       //Apresentando o ingresso  
       inteiro.exibirIngresso();

       //================  
       //  Ingresso Meia  
       //================  
       //Instanciando ingresso meia  
       Ingresso meia \= new IngressoMeia(  
               "Parque de Diversões",  
               50.00  
       );

       //Apresentando inrgresso  
       meia.exibirIngresso();  
   }  
}

### Ingresso {#ingresso}

package AT08;

public abstract class Ingresso {  
   protected String nomeEvento;  
   private double precoBase;

   public Ingresso(String nomeEvento, double precoBase) {  
       this.nomeEvento \= nomeEvento;  
       this.precoBase \= precoBase;  
   }

   public String getNomeEvento() {  
       return nomeEvento;  
   }  
   public void setNomeEvento(String nomeEvento) {  
       if (\!nomeEvento.isEmpty()) {  
           this.nomeEvento \= nomeEvento;  
       } else {  
           System.*out*.println("Informe um nome válido\!");  
       }  
   }

   public double getPrecoBase() {  
       return precoBase;  
   }  
   public void setPrecoBase(double precoBase) {  
       if (precoBase \> 0) {  
           this.precoBase \= precoBase;  
       } else {  
           System.*out*.println("O valor do ingresso tem que ser maior que zero\!");  
       }  
   }

   @Override  
   public String toString() {  
       return getClass().getSimpleName() \+  
               "\\nNome: " \+ nomeEvento \+  
               "\\nPreço: R\$" \+ calcularPrecoFinal();  
   }

   public abstract double calcularPrecoFinal();

   public void exibirIngresso() {  
       System.*out*.println("= \= \= \= \= \= \= \= \= \=");  
       System.*out*.println(toString());  
       System.*out*.println("= \= \= \= \= \= \= \= \= \=");  
   }  
}

### IngressoInteiro {#ingressointeiro}

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

### IngressoMeia {#ingressomeia}

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

# AT09 {#at09}

## **Desafio 6 — Sistema de contas bancárias (AT09)** {#desafio-6-—-sistema-de-contas-bancárias-(at09)}

Implemente um sistema simples de contas bancárias.

Crie uma classe abstrata chamada `ContaBancaria` com:

* Atributos `titular` (`String`) e `saldo` (`double`);  
* Método abstrato `calcularRendimento()`;  
* Método concreto `exibirSaldo()` que mostra o titular, o saldo atual e o rendimento calculado.

Crie as subclasses:

* `ContaPoupanca`: rendimento de 1% sobre o saldo;  
* `ContaInvestimento`: rendimento de 2% sobre o saldo.

Na `main`, crie uma conta de cada tipo e exiba as informações.

Considere que os saldos são positivos.

## Resposta: {#resposta:-6}

### Main {#main-7}

package AT09;

public class Main {  
   static void main(String\[\] args) {  
       //Instanciando Conta Poupança  
       ContaBancaria poupanca \= new ContaPoupanca(  
               "Paulo",  
               10000.00  
       );

       //Exibindo informação da conta popança  
       poupanca.exibirSaldo();

       System.*out*.println();

       //Intanciando Conta Investimento  
       ContaBancaria investimento \= new ContaInvestimento(  
               "Paulo Filho",  
               20000.00  
       );

       //Exibindo informações da conta de investimentos  
       investimento.exibirSaldo();  
   }  
}

### ContaBancaria {#contabancaria}

package AT09;

public abstract class ContaBancaria {  
   protected String nome;  
   private double saldo;

   public ContaBancaria(String nome, double saldo) {  
       this.nome \= nome;  
       this.saldo \= saldo;  
   }

   public String getNome() {  
       return nome;  
   }  
   public void setNome(String nome) {  
       if (\!nome.isEmpty()) {  
           this.nome \= nome;  
       } else {  
           System.*out*.println("Insira um nome válido\!");  
       }  
   }

   public double getSaldo() {  
       return saldo;  
   }  
   public void setSaldo(double saldo) {  
       if (saldo \>= 0) {  
           this.saldo \= saldo;  
       } else {  
           System.*out*.println("O saldo tem que ser maior que zero\!");  
       }  
   }

   @Override  
   public String toString() {  
       return getClass().getSimpleName() \+  
               "\\nNome: " \+ getNome() \+  
               "\\nSaldo: R\$" \+ calcularSaldo();  
   }

   public abstract double calcularSaldo();

   public void exibirSaldo() {  
       System.*out*.println(toString());  
   }  
}

### ContaPoupanca {#contapoupanca}

package AT09;

public class ContaPoupanca extends ContaBancaria{  
   public ContaPoupanca(String nome, double saldo) {  
       super(nome, saldo);  
   }

   @Override  
   public double calcularSaldo() {  
       return getSaldo() \* 1.01;  
   }  
}

### ContaInvestimento {#containvestimento}

package AT09;

public class ContaInvestimento extends ContaBancaria{  
   public ContaInvestimento(String nome, double saldo) {  
       super(nome, saldo);  
   }

   @Override  
   public double calcularSaldo() {  
       return getSaldo() \* 1.02;  
   }  
}  