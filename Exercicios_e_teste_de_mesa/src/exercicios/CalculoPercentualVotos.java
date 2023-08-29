package exercicios;

import java.util.Scanner;

public class CalculoPercentualVotos {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o número total de eleitores
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        // Solicitar ao usuário que insira o número de votos brancos
        System.out.print("Digite o número de votos em branco: ");
        int votosBrancos = scanner.nextInt();

        // Solicitar ao usuário que insira o número de votos nulos
        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        // Solicitar ao usuário que insira o número de votos válidos
        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        // Calcular os percentuais de votos
        double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
        double percentualNulos = (double) votosNulos / totalEleitores * 100;
        double percentualValidos = (double) votosValidos / totalEleitores * 100;

        // Exibir os resultados
        System.out.println("Percentual de votos em branco: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

        // Fechar o Scanner
        scanner.close();
    }
}


//teste de mesa
// Passo 1:Solicitar entrada do usuário para número total de eleitores. (usuário digita 1000)
//Passo 2:Leitura do número total de eleitores digitado pelo usuário
//Passo 3:Solicitar entrada do usuário para número de votos em branco. (usuario digita 150)
//Passo 4:Leitura do número de votos em branco digitado pelo usuário
//Passo 5:Solicitar entrada do usuário para número de votos nulos (usuario digita 100)
//Passo 6:Leitura do número de votos nulos digitado pelo usuário
//Passo 7:Solicitar entrada do usuário para número de votos válidos ((usuário digita 650)
//Passo 8:Leitura do número de votos válidos digitado pelo usuário
//Passo 9:Calcular os percentuais de votos
//Passo 10:Exibir os resultados 
//Percentual de votos em branco: 15.0%
//Percentual de votos nulos: 10.0%
//Percentual de votos válidos: 65.0%