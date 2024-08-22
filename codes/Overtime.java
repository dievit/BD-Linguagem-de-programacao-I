package codes;

import java.util.Scanner;

public class Overtime {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Calculadora de Horas extras");
        System.out.println("Digite o nome do colaborador: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor da hora do colaborador: R$");
        double valorHora = scanner.nextDouble();
        double valorHoraExtra = valorHora * 1.5;

        System.out.println("Digite as horas trabalhadas: ");
        int horaTrabalhada = scanner.nextInt();

        int horaExtra = Math.max(0, horaTrabalhada - 40);
        int horaNormal = (horaTrabalhada - horaExtra);

        System.out.println("Colaborador: " + nome);
        System.out.println("Total de horas trabalhadas: " + horaTrabalhada);
        System.out.println("Total de horas extras: " + horaExtra);

        if (horaExtra > 0){
            System.out.println("Valor total em horas extras: R$" + String.format("%.2f", horaExtra * valorHoraExtra));
        } else {
            System.out.println("Valor Total em horas extras: SEM HORA EXTRA!");
        }

        System.out.println("Valor total do Salário sem as horas extras: R$" + String.format("%.2f", horaNormal * valorHora));
        System.out.println("Valor total do Salário + Horas extras: R$" + String.format("%.2f", (horaNormal * valorHora) +(horaExtra * valorHoraExtra)));

    scanner.close();
    }


}
