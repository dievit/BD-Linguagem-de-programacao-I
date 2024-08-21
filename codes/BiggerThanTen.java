package codes;

import java.util.Scanner;

public class BiggerThanTen {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao É maior que 10?");

        System.out.println("Digite um número inteiro: ");
        int userChoice = scanner.nextInt();

        if (userChoice >= 10) {
            System.out.println("É maior que 10!");
        } else {
            System.out.println("Não é maior que 10!");
        }

        scanner.close();
    }
}
