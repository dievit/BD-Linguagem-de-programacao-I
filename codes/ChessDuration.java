package codes;

import java.util.Scanner;

public class ChessDuration {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Contador de horas de um jogo de xadrez");

        System.out.println("Digite a hora inicial do jogo: ");
        int hora1 = scanner.nextInt();

        System.out.println("Digite a hora final do jogo: ");
        int hora2 = scanner.nextInt();

        int horaTotal = (24 - hora1) + (24- hora2);

        System.out.println("A duração do jogo foi de: " + horaTotal + " horas");

        scanner.close();
    }
}
