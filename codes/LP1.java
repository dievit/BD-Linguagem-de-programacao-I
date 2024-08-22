package codes;

import java.util.Scanner;

public class LP1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota P1: ");
        double p1 = scanner.nextDouble();
        System.out.println("Digite a nota E1: ");
        double e1 = scanner.nextDouble();
        System.out.println("Digite a nota E2: ");
        double e2 = scanner.nextDouble();
        System.out.println("Digite a nota da API: ");
        double api = scanner.nextDouble();
        System.out.println("Digite a nota da SUB (se houver): ");
        double sub = scanner.nextDouble();
        System.out.println("Digite a nota extra (Digite 0 ou 1): ");
        double x = scanner.nextDouble();

        double mediaLp1 = (p1*0.6+((e1+e2)/2)*0.4)*0.5+(Math.max(((p1*0.6+((e1+e2)/2)*0.4)-5.9),0)/((p1*0.6+((e1+e2)/2)*0.4)-5.9))*(api*0.5)+x+(sub*0.2);

        System.out.println("Média final de LP1: " + mediaLp1);
    }
}
