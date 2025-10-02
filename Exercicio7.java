import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int pessoasNoPesoIdeal = 0;
        double peso;
        double altura;
        double imc;

        for (int contador = 1; contador <= 10; contador++) {
            System.out.println("--- Pessoa " + contador + " ---");

            System.out.print("Digite o peso (em kg): ");
            peso = entrada.nextDouble();

            System.out.print("Digite a altura (em metros): ");
            altura = entrada.nextDouble();

            imc = peso / (altura * altura);

            System.out.printf("IMC calculado: %.2f\n", imc);

            if (imc >= 18.5 && imc <= 24.9) {
                pessoasNoPesoIdeal++;
                System.out.println("Status: Sem obesidade (Peso ideal).");
            } else {
                System.out.println("Status: Fora da faixa de peso ideal.");
            }
        }
        entrada.close();

        System.out.println("\n----------------------------------");
        System.out.println("Total de pessoas analisadas: 10");
        System.out.println("Pessoas com IMC entre 18.5 e 24.9: " + pessoasNoPesoIdeal);
        System.out.println("----------------------------------");
    }
}
