package classes;




public class TesteAnimal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 3, "Labrador");
        Animal gato = new Gato("Miau", 2, "Siamese");
        Animal elefante = new Elefante("Dumbo", 5);
        Animal leao = new Leao("Simba", 4);
        Animal tigre = new Tigre("Shere Khan", 6);
        Animal girafa = new Girafa("Melman", 7);
        Animal pinguim = new Pinguim("Skipper", 1);
        Animal borboleta = new Borboleta("Flutter", 0);
        Animal peixe = new Peixe("Nemo", 2);

        // Testando os métodos para cada animal
        cachorro.emitirSom();
        cachorro.mover();
        cachorro.dormir();
        cachorro.acordar();

        gato.emitirSom();
        gato.mover();
        gato.dormir();
        gato.acordar();

        elefante.emitirSom();
        elefante.mover();
        elefante.dormir();
        elefante.acordar();

        leao.emitirSom();
        leao.mover();
        leao.dormir();
        leao.acordar();

        tigre.emitirSom();
        tigre.mover();
        tigre.dormir();
        tigre.acordar();

        girafa.emitirSom();
        girafa.mover();
        girafa.dormir();
        girafa.acordar();

        pinguim.emitirSom();
        pinguim.mover();
        pinguim.dormir();
        pinguim.acordar();

        borboleta.emitirSom();
        borboleta.mover();
        borboleta.dormir();
        borboleta.acordar();

        peixe.emitirSom();
        peixe.mover();
        peixe.dormir();
        peixe.acordar();
    }
}

