package codes;

import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a sua idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a sua idade em dias: ");
        int dias = scanner.nextInt();

        int idadeParaDias = (anos *365) + (meses *30) + dias;

        System.out.println("Sua idade em dias é: " + idadeParaDias);

        scanner.close();
    }
}
