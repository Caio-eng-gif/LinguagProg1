package exercicios;

import java.util.Scanner;

public class CalculoIdadeDias {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira a idade em anos, meses e dias
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        // Calcular a idade em dias
        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        // Exibir a idade em dias
        System.out.println("A idade em dias é: " + idadeEmDias);

        // Fechar o Scanner
        scanner.close();
    }
}

//Teste de mesa
//Passo 1: Solicitar entrada do usuário para idade em anos. Usuario digita 25
//Passo 2:  Leitura da idade em anos digitada pelo usuário
//Passo 3: Solicitar entrada do usuário para idade em meses. Usuario digita 6
//Passo 4:Leitura da idade em meses digitada pelo usuário
//Passo 5: Solicitar entrada do usuário para idade em dias. Usuario digita 15
//Passo 6: Leitura da idade em dias digitada pelo usuario
//Passo 7: Clacular a idade em dias na variavel "idadeEmDias"
//Passo 8: Exibir o resultado, que seria 9315

