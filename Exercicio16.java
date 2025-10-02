import java.util.Scanner;
import java.util.Locale;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int totalPessoas = 10;
        int idade;
        double altura;
        double peso;

        int contMaisDe50 = 0;

        double somaAlturasEntre10E20 = 0.0;
        int contEntre10E20 = 0;

        int contAbaixoDe40kg = 0;
        double percentualAbaixoDe40kg;

        for (int contador = 1; contador <= totalPessoas; contador++) {
            System.out.println("--- Pessoa " + contador + " ---");

            System.out.print("Digite a idade: ");
            idade = entrada.nextInt();

            System.out.print("Digite a altura (ex: 1.75): ");
            altura = entrada.nextDouble();

            System.out.print("Digite o peso (em kg): ");
            peso = entrada.nextDouble();

            if (idade > 50) {
                contMaisDe50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturasEntre10E20 += altura;
                contEntre10E20++;
            }

            if (peso < 40) {
                contAbaixoDe40kg++;
            }
        }

        entrada.close();

        System.out.println("\n----------------------------------");
        System.out.println("Resultados da Análise");
        System.out.println("----------------------------------");

        System.out.println("a) Pessoas com mais de 50 anos: " + contMaisDe50);

        if (contEntre10E20 > 0) {
            double mediaAlturas = somaAlturasEntre10E20 / contEntre10E20;
            System.out.printf("b) Média das alturas (10 a 20 anos): %.2f metros\n", mediaAlturas);
        } else {
            System.out.println("b) Nenhuma pessoa entre 10 e 20 anos registrada.");
        }

        percentualAbaixoDe40kg = (double) contAbaixoDe40kg / totalPessoas * 100;
        System.out.printf("c) Percentual com peso < 40kg: %.2f%%\n", percentualAbaixoDe40kg);

        System.out.println("----------------------------------");
    }
}
