package exercicios;

import java.util.Scanner;

public class MaiorEntreDois {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o primeiro valor
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        // Solicitar ao usuário que insira o segundo valor
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        // Verificar e exibir o maior valor
        if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }

        // Fechar o Scanner
        scanner.close();
    }
}
//teste de mesa
//Passo 1: Solicitar entrada do usuário para o primeiro valor.Digite o primeiro valor: (usuário digita 8)
//Passo 2: Leitura do primeiro valor digitado pelo usuário valor1 = 8
//Passo 3: Solicitar entrada do usuário para o segundo valor Digite o segundo valor: (usuário digita 15)
//Passo 4: Leitura do segundo valor digitado pelo usuário valor2 = 15
//Passo 5: Verificar e exibir o maior valor valor1 > valor2? Não Exibir: O maior valor é: 15










