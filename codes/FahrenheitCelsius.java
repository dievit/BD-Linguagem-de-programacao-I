package codes;
import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao conversor de Graus F° para Graus C°");

        System.out.println("Digite a Temperatura em F° que deseja converter para C°: ");
        double fDegree = scanner.nextDouble();

        double cDegree = (fDegree - 32) / 1.8;

        System.out.println(fDegree + " É igual a: " + String.format("%.2f", cDegree));

        scanner.close();
    }
}
