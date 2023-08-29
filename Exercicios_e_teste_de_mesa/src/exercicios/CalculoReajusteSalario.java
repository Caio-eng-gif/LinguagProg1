package exercicios;

import java.util.Scanner;

public class CalculoReajusteSalario {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o salário mensal atual
        System.out.print("Digite o salário mensal atual: ");
        double salarioAtual = scanner.nextDouble();

        // Solicitar ao usuário que insira o percentual de reajuste
        System.out.print("Digite o percentual de reajuste (%): ");
        double percentualReajuste = scanner.nextDouble();

        // Calcular o valor do novo salário
        double novoSalario = salarioAtual * (1 + percentualReajuste / 100);

        // Exibir o novo salário na tela
        System.out.println("O novo salário é: " + novoSalario);

        // Fechar o Scanner
        scanner.close();
    }
}

//Passo 1:Solicitar entrada do usuário para salário mensal atual (usuário digita 3000)
//Passo 2:Leitura do salário mensal atual digitado pelo usuário
//Passo 3:Solicitar entrada do usuário para percentual de reajuste (usuário digita 10)
//Passo 4:Leitura do percentual de reajuste digitado pelo usuário
//Passo 5:Calcular o valor do novo salário
//Passo 6:Exibir o novo salário na tela O novo salário é: 3300.0