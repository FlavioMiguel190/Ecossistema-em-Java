// Aqui o Encapsulamento
public class Animal {
    private String nome;

    // Aqui o Construtor
    public Animal(String nome) {
        this.nome = nome;
    }

    // Aqui a definição do Método
    public void comer() {
        System.out.println(nome + " está comendo...");
    }

    // Aqui o Encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

// Aqui a Herança
public class Cachorro extends Animal {
    //Aqui o Construtor
    public Cachorro(String nome) {
        super(nome);
    }

    // Aqui o Polimorfismo (sobrescrito do metodo que definimos na classe pai)
    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo ração...");
    }
}

//  Aqui a minha Associação
public class Pessoa {
    private String nome;
    private Animal animalDeEstimacao; // Associação

    // Aqui o meu Construtor
    public Pessoa(String nome, Animal animalDeEstimacao) {
        this.nome = nome;
        this.animalDeEstimacao = animalDeEstimacao;
    }

// Aqui a pessoa alimentando o animal de estimação
    public void alimentarAnimalDeEstimacao() {
        System.out.println(nome + " está alimentando " + animalDeEstimacao.getNome() + "...");
        animalDeEstimacao.comer();
    }
}

public class Main {
    public static void main(String[] args) {
        // Aqui nossa instanciação
        Cachorro cachorro = new Cachorro("Rex");
        Pessoa pessoa = new Pessoa("João", cachorro);

        pessoa.alimentarAnimalDeEstimacao();
    }
}
