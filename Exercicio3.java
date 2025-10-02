import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo (Limite da sequência): ");
        int limite = entrada.nextInt();

        int contador = 1;

        System.out.println("\nSequência de potências de 2 (até " + limite + "):");

        while (contador <= limite) {

            System.out.print(contador);

            if (contador * 2 <= limite) {

                System.out.print(", ");
            }
            contador = contador * 2;
        }

        System.out.println();

        entrada.close();
    }
}