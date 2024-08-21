package codes;

import java.util.Scanner;

public class InOrder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos colocar os números em ordem crescente!");

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        while (num1 == num2){
            System.out.println("Você está roubando, digite um número diferente!");
            num2 = scanner.nextInt();
        }

        int maior = Math.max(num1, num2);
        int menor = Math.min(num1, num2);

        System.out.println("Em ordem: " + menor + "," + maior);

        scanner.close();
    }
}
