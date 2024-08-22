package codes;

import java.util.Scanner;

public class Balance {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Balanço Financeiro Trimestral");

        System.out.println("Digite o valor do mês 1: R$");
        double mes1 = scanner.nextDouble();

        System.out.println("Digite o valor do mês 2: R$");
        double mes2 = scanner.nextDouble();

        System.out.println("Digite o valor do mês 3: R$");
        double mes3 = scanner.nextDouble();

        double total = mes1+mes2+mes3;
        double media = (mes1 + mes2 + mes3)/3;

        System.out.println("Despesa trimestral total: R$" + String.format("%.2f", total));
        System.out.println("Despesa média mensal: R$" + String.format("%.2f", media));
    }
}
