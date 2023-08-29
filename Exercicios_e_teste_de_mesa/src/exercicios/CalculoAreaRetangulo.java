package exercicios;

import java.util.Scanner;

public class CalculoAreaRetangulo {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira a base do retângulo
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        // Solicitar ao usuário que insira a altura do retângulo
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        // Calcular a área do retângulo
        double area = base * altura;

        // Exibir a área na tela
        System.out.println("A área do retângulo é: " + area);

        // Fechar o Scanner
        scanner.close();
    }
}
//teste de mesa
//Passo 1:Solicitar entrada do usuário para a base do retângulo. Ex:5
//Passo 2: Solicitar ao usuário que insira a altura do retângulo. Ex:8
//Passo 3:Calcular a área do retângulo. Ex: 5*8
//Passo 4: Exibir o resultado. Ex:40






