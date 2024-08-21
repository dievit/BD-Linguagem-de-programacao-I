package codes;

import java.util.Scanner;

public class StudentDegrees {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de média do aluno");
        System.out.println("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        double mediaFinal = (nota1 + nota2)/2;

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média final: " + String.format("%.2f", mediaFinal));

        if (mediaFinal > 6){
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
        }
        scanner.close();
    }
}
