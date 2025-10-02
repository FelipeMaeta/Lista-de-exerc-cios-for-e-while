import java.util.Scanner;
import java.util.Locale;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        double nota1;
        double nota2;
        double media;

        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("--- Aluno " + contador + " ---");

            do {
                System.out.print("Digite a 1ª nota (0 a 10): ");
                nota1 = entrada.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.print("Digite a 2ª nota (0 a 10): ");
                nota2 = entrada.nextDouble();
            } while (nota2 < 0 || nota2 > 10);

            media = (nota1 + nota2) / 2;

            System.out.printf("Média aritmética: %.2f\n\n", media);
        }
        entrada.close();
    }
}

