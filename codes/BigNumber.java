package codes;

import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao Qual é o maior número?");

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        while (num1 == num2){
            System.out.println("Os números são iguais! Digite um número diferente: ");
            num2 = scanner.nextInt();
        }

        int maior = Math.max(num1, num2);
        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}
