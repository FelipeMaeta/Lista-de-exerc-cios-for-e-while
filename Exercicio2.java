import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int contador = 1; contador <= 10; contador++) {
            System.out.printf("Digite o %dº número inteiro: ", contador);

            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
               pares++;
            } else {
                impares++;
            }
        }
        entrada.close();

        System.out.println("\n--- Resultados Finais ---");
        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de ímpares é: " + impares);
    }
}
