package codes;

import java.util.Scanner;

public class CarConsumerPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo(a) à calculadora de custo de veículo para cliente final!");

        System.out.println("Digite o custo de fábrica do veículo: R$");
        double factoryCost = scanner.nextDouble();

        System.out.println("Digite o a alíquota de imposto (ex. 45 para 45%) :");
        double taxRate = scanner.nextDouble();

        System.out.println("Digite a margem de lucro do distribuidor (ex. 28 para 28%: ");
        double distributorMargin = scanner.nextDouble();

        double consumerFinalPrice = factoryCost + (factoryCost * (taxRate/100)) + (factoryCost + (distributorMargin/100));

        System.out.println("O preço final do veículo para o consumidor é: " + String.format("%.2f", consumerFinalPrice));

        scanner.close();
    }
}
