package exercicios;

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o primeiro valor
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        // Solicitar ao usuário que insira o segundo valor
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        // Ordenar os valores em ordem crescente e exibir
        if (valor1 < valor2) {
            System.out.println("Valores em ordem crescente: " + valor1 + ", " + valor2);
        } else {
            System.out.println("Valores em ordem crescente: " + valor2 + ", " + valor1);
        }

        // Fechar o Scanner
        scanner.close();
    }
}

//teste de mesa
//Passo 1: Solicitar entrada do usuário para o primeiro valor.Digite o primeiro valor: (usuário digita 7)
//Passo 2: Leitura do primeiro valor digitado pelo usuário (valor1 = 7)
//Passo 3: Solicitar entrada do usuário para o segundo valorDigite o segundo valor: (usuário digita 12)
//Passo 4: Leitura do segundo valor digitado pelo usuário (valor2 = 12)
//Passo 5: Ordenar os valores em ordem crescente e exibir .valor1 < valor2? Sim
//Exibir: Valores em ordem crescente: 7, 12









