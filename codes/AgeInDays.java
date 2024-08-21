package codes;

import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade em anos: ");
        int anos = scanner.nextInt();


        System.out.println("Digite a sua idade em meses: ");
        int meses = scanner.nextInt();

        while (meses > 12){
            System.out.println("O ano só tem 12 meses seu burro! Digite novamente: ");
            meses = scanner.nextInt();
        }
        System.out.println("Digite a sua idade em dias: ");
        int dias = scanner.nextInt();

        while (dias > 30) {
            System.out.println("Digite algo entre 1 e 30: ");
            dias = scanner.nextInt();
        }
        int idadeParaDias = (anos *365) + (meses *30) + dias;

        System.out.println("Sua idade em dias é: " + idadeParaDias);

        scanner.close();
    }
}
