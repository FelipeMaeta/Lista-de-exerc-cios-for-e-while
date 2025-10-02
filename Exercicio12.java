import java.util.Scanner;
import java.util.Locale;
public class Exercicio12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número inteiro (limite da sequência): ");
        int limite = entrada.nextInt();

        System.out.print("Sequência: ");

        for (int contador = 1; contador <= limite; contador++) {

            System.out.print(contador);
        }

        System.out.println();

        entrada.close();
    }
}
