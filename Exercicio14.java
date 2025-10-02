import java.util.Scanner;
import java.util.Locale;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int totalAlunos = 6;
        double nota1;
        double nota2;
        double mediaAluno;

        double somaMediasClasse = 0.0;
        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;

        for (int contador = 1; contador <= totalAlunos; contador++) {
            System.out.println("--- Aluno " + contador + " ---");

            System.out.print("Digite a 1ª nota: ");
            nota1 = entrada.nextDouble();

            System.out.print("Digite a 2ª nota: ");
            nota2 = entrada.nextDouble();

            mediaAluno = (nota1 + nota2) / 2;
            somaMediasClasse += mediaAluno;

            System.out.printf("Média do aluno: %.2f\n", mediaAluno);

            if (mediaAluno <= 3.0) {
                System.out.println("Status: REPROVADO");
                reprovados++;
            } else if (mediaAluno < 7.0) {
                System.out.println("Status: EXAME");
                exame++;
            } else {
                System.out.println("Status: APROVADO");
                aprovados++;
            }
            System.out.println();
        }

        double mediaClasse = somaMediasClasse / totalAlunos;

        entrada.close();

        System.out.println("----------------------------------");
        System.out.println("Resumo da Classe");
        System.out.println("----------------------------------");
        System.out.println("Total de alunos aprovados: " + aprovados);
        System.out.println("Total de alunos de exame: " + exame);
        System.out.println("Total de alunos reprovados: " + reprovados);
        System.out.printf("Média geral da classe: %.2f\n", mediaClasse);
        System.out.println("----------------------------------");
    }
}
