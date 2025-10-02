import java.util.Scanner;
import java.util.Locale;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int idade;
        double altura;

        double somaAlturas = 0.0;
        int contPessoasMais50 = 0;
        double mediaAlturas;

        for (int contador = 1; contador <= 10; contador++) {
            System.out.println("--- Pessoa " + contador + " ---");

            System.out.print("Digite a idade: ");
            idade = entrada.nextInt();

            System.out.print("Digite a altura (ex: 1.75): ");
            altura = entrada.nextDouble();

            if (idade > 50) {
                somaAlturas += altura;
                contPessoasMais50++;
            }
        }

        entrada.close();

        System.out.println("\n----------------------------------");

        if (contPessoasMais50 > 0) {
            mediaAlturas = somaAlturas / contPessoasMais50;
            System.out.println("Pessoas com mais de 50 anos: " + contPessoasMais50);
            System.out.printf("Média das alturas: %.2f metros\n", mediaAlturas);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi registrada.");
        }
        System.out.println("----------------------------------");
    }
}
