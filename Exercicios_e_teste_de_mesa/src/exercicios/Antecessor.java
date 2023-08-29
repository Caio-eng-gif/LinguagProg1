package exercicios;

import java.util.Scanner;

public class Antecessor {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um valor
        System.out.print("Digite um valor: ");
        
        // Ler o valor digitado pelo usuário
        int valor = scanner.nextInt();
        
        // Calcular o antecessor
        int antecessor = valor - 1;

        // Exibir o antecessor na tela
        System.out.println("O antecessor de " + valor + " é: " + antecessor);

        // Fechar o Scanner
        scanner.close();
    }
}
//Teste de mesa
// Passo 1: Usuario digita o valor 7
// Passo 2: Leitura do valor digitado é realizado pela variavel "valor"
//Passo 3: O calculo é realizado pela variavel "antecessor" ou seja, antecessor = valor - 1 = 7 - 1 = 6
// Passo 4: Exibir o resultado:6
