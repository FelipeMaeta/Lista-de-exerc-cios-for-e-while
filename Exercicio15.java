import java.util.Scanner;
import java.util.Locale;
public class Exercicio15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int totalEleitores = 10;
        int voto;

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int nulos = 0;
        int brancos = 0;

        for (int contador = 1; contador <= totalEleitores; contador++) {
            System.out.println("--- Eleitor " + contador + " ---");
            System.out.println("Códigos: 1-4 (Candidato), 5 (Nulo), 6 (Branco)");
            System.out.print("Digite seu voto: ");
            voto = entrada.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    nulos++;
                    break;
                case 6:
                    brancos++;
                    break;
                default:
                    System.out.println("Voto inválido e não contabilizado.");
            }
        }

        int totalNulosBrancos = nulos + brancos;
        double percentualNulosBrancos = (double) totalNulosBrancos / totalEleitores * 100;

        entrada.close();

        System.out.println("\n----------------------------------");
        System.out.println("Resultado da Eleição");
        System.out.println("----------------------------------");
        System.out.println("Total de votos para o Candidato 1: " + candidato1);
        System.out.println("Total de votos para o Candidato 2: " + candidato2);
        System.out.println("Total de votos para o Candidato 3: " + candidato3);
        System.out.println("Total de votos para o Candidato 4: " + candidato4);
        System.out.println("Total de votos NULOS: " + nulos);
        System.out.println("Total de votos EM BRANCO: " + brancos);
        System.out.println("----------------------------------");
        System.out.printf("Percentual de votos brancos e nulos: %.2f%%\n", percentualNulosBrancos);
        System.out.println("----------------------------------");
    }
}
