public class Exercicio10 {

    public static void main(String[] args) {

        for (int contador = 100; contador >= 1; contador--) {

            System.out.print(contador);

            if (contador > 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
