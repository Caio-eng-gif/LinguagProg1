package classes;

abstract class Animal {
    private String nome;
    private int idade;
    private boolean estaDormindo;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.estaDormindo = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isEstaDormindo() {
        return estaDormindo;
    }

    public void dormir() {
        estaDormindo = true;
        System.out.println(nome + " está dormindo.");
    }

    public void acordar() {
        estaDormindo = false;
        System.out.println(nome + " acordou.");
    }

    public abstract void emitirSom();

    public abstract void mover();
}

class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está latindo.");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está correndo.");
    }
}

class Gato extends Animal {
    private String corPelagem;

    public Gato(String nome, int idade, String corPelagem) {
        super(nome, idade);
        this.corPelagem = corPelagem;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está miando.");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está pulando.");
    }
}

class Elefante extends Animal {
    public Elefante(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está trombeteando.");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está caminhando lentamente.");
    }
}

class Leao extends Animal {
    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo.");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está se movendo pelo território.");
    }
}

class Tigre extends Animal {
    public Tigre(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rosnando.");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está patrulhando a área.");
    }
}

class Girafa extends Animal {
    public Girafa(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo um som característico.");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está caminhando com seu pescoço longo.");
    }
}

class Pinguim extends Animal {
    public Pinguim(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo um som de pinguim.");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está deslizando pelo gelo.");
    }
}

class Borboleta extends Animal {
    public Borboleta(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está batendo suas asas delicadamente.");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está voando de flor em flor.");
    }
}

class Peixe extends Animal {
    public Peixe(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo movimentos na água.");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está nadando nas águas.");
    }
}

