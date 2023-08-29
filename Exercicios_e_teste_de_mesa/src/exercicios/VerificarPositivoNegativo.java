package exercicios;

import java.util.Scanner;

public class VerificarPositivoNegativo {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira um valor
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        // Verificar se o valor é positivo ou negativo e exibir a mensagem correspondente
        if (valor >= 0) {
            System.out.println("O valor é positivo.");
        } else {
            System.out.println("O valor é negativo.");
        }

        // Fechar o Scanner
        scanner.close();
    }
}
//teste de mesa
//Passo 1: Solicitar entrada do usuário para um valor. (usuário digita -5)
//Passo 2: Leitura do valor digitado pelo usuário
//Passo 3:Verificar se o valor é positivo ou negativo e exibir a mensagem correspondente
