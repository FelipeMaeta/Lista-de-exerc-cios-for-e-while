import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int menor = Integer.MAX_VALUE;
        int numero;

        for (int contador = 1; contador <= 10; contador++) {
            System.out.print("Digite o " + contador + "º número inteiro e positivo: ");
            numero = entrada.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }
        entrada.close();

        System.out.println("\nO menor número digitado foi: " + menor);
    }
}
