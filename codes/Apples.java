package codes;

import java.util.Scanner;

public class Apples {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double menosDoze = 1.30;
        double maisDoze = 1;

        System.out.println("Bem-vindo(a) ao comprador de maçãs");

        System.out.println("Digite a qtd de maçãs compradas: ");
        int userNumber = scanner.nextInt();

        double duzia = userNumber * maisDoze;
        double menosDuzia = userNumber * menosDoze;

        if (userNumber < 12) {
            System.out.println("O valor da compra é: R$" + String.format("%.2f", menosDuzia));
        } else {
            System.out.println("O valor da compra é: R$" + String.format("%.2f", duzia));
        }

        scanner.close();

    }
}
