package codes;

import java.util.Scanner;

public class UpSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário atual: R$");
        double salarioAtual = scanner.nextDouble();

        System.out.println();

        System.out.print("Digite o percentual de aumento: (ex: 2,5): ");
        double percentualAumento = scanner.nextDouble();

        System.out.println();

        double novoSalario = salarioAtual + (salarioAtual * (percentualAumento/100));

        System.out.println("Seu salário atual era: R$" + String.format("%.2f", salarioAtual));
        System.out.println("Seu novo salário é: R$" + String.format("%.2f", novoSalario));
        System.out.println("Percentual de aumento: " + percentualAumento + "%");

        scanner.close();
    }
}
