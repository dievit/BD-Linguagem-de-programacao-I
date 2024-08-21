package codes;

import java.util.Scanner;

public class SellerSalary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a) à calculadora de salário de vendedor!");

        System.out.println("Digite a quantidade de carros vendidos: R$");
        int selledCars = scanner.nextInt();

        System.out.println("Digite o valor total de vendas do vendedor: R$");
        double totalSelled = scanner.nextDouble();

        System.out.println("Digite o salário fixo do vendedor: R$");
        double sellerSalary = scanner.nextDouble();

        System.out.println("Digite (em reais) o valor fixo da comissão por veículo: R$");
        double carFixComission = scanner.nextDouble();

        double finalSalary = ((selledCars * carFixComission) + sellerSalary + (totalSelled * 0.05));

        System.out.println("O valor final do salário é de: R$" + String.format("%.2f", finalSalary));
    }
}
