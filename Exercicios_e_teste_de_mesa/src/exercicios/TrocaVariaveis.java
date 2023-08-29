package exercicios;

public class TrocaVariaveis {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;

        // Troca de valores entre A e B
        int temp = A;
        A = B;
        B = temp;

        // Exibir os valores após a troca
        System.out.println("Valor em A: " + A);
        System.out.println("Valor em B: " + B);
    }
}
// Teste de Mesa
// Passo 1:Inicialização A = 10 B = 20

//Passo 2:Troca de valores usando variável temporária temp
//temp = A          // temp = 10
//A = B             // A = 20
//B = temp          // B = 10

//Passo 3: Exibição dos valores finais
//Valor em A: 20
//Valor em B: 10





