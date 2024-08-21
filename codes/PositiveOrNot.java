package codes;

import java.util.Scanner;

public class PositiveOrNot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao É maior que 10?");

        System.out.println("Digite um número inteiro: ");
        int userChoice = scanner.nextInt();

        if (userChoice >= 0) {
            System.out.println("É positivo!");
        } else {
            System.out.println("Não é positivo!");
        }

        scanner.close();
    }
}
