package codes;

import java.time.LocalDate;
import java.util.Scanner;

public class CanYouVote {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int actualYear = LocalDate.now().getYear();

        System.out.println("Você pode votar?");

        System.out.println("Digite o ano em que você nasceu (no formado AAAA)");
        int userInput = scanner.nextInt();

        if ((actualYear - userInput) < 16){
            System.out.println("Você não pode votar ainda!");
        } else {
            System.out.println("Parabéns, você já pode votar!");
        }

        scanner.close();
    }
}
