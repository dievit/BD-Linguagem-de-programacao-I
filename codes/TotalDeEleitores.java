package codes;

import java.util.Scanner;

public class TotalDeEleitores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de votos brancos: ");
        int brancos = scanner.nextInt();

        System.out.print("Digite o total de votos nulos: ");
        int nulos = scanner.nextInt();

        System.out.print("Digite o total de votos válidos: ");
        int validos = scanner.nextInt();

        System.out.println();

        int totalDeEleitores = (brancos + nulos + validos);
        double percentualBrancos = ((double) brancos/ totalDeEleitores)*100;
        double percentualNulos = ((double) nulos / totalDeEleitores)*100;
        double percentualValidos = ((double) validos / totalDeEleitores)*100;

        System.out.println("O Total de eleitores é de: " + totalDeEleitores);
        System.out.println();
        System.out.println("O Percentual de votos em branco é de: " + String.format("%.2f", percentualBrancos) + "%");
        System.out.println("O Percentual de votos nulos é de: " + String.format("%.2f", percentualNulos) + "%");
        System.out.println("O Percentual de votos válidos é de: " + String.format("%.2f", percentualValidos) + "%");
    }
}
