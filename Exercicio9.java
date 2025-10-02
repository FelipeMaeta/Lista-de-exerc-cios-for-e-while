import java.util.Scanner;
import java.util.Locale;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int codigo;
        int quantidade;
        double precoUnitario = 0.0;
        double totalItem;
        double totalGeral = 0.0;
        int continuar = 1;

        System.out.println("----------------- Cardápio ------------------");
        System.out.println("Cód | Produto             | Preço");
        System.out.println("100 | Cachorro quente     | 1.20");
        System.out.println("101 | Bauru Simples       | 1.30");
        System.out.println("102 | Bauru com ovo       | 1.50");
        System.out.println("103 | Hambúrguer          | 1.20");
        System.out.println("104 | Cheeseburger        | 1.30");
        System.out.println("105 | Refrigerante        | 1.00");
        System.out.println("-------------------------------------------");

        while (continuar == 1) {
            System.out.print("\nDigite o código do produto: ");
            codigo = entrada.nextInt();

            System.out.print("Digite a quantidade: ");
            quantidade = entrada.nextInt();

            switch (codigo) {
                case 100:
                    precoUnitario = 1.20;
                    break;
                case 101:
                    precoUnitario = 1.30;
                    break;
                case 102:
                    precoUnitario = 1.50;
                    break;
                case 103:
                    precoUnitario = 1.20;
                    break;
                case 104:
                    precoUnitario = 1.30;
                    break;
                case 105:
                    precoUnitario = 1.00;
                    break;
                default:
                    System.out.println("Código inválido. Tente novamente.");
                    precoUnitario = 0.0;
            }

            if (precoUnitario > 0.0) {
                totalItem = precoUnitario * quantidade;
                totalGeral += totalItem;
                System.out.printf("Valor do item (cód %d): R$ %.2f\n", codigo, totalItem);
            }

            System.out.print("Deseja continuar comprando? (1 para Sim / 0 para Não): ");
            continuar = entrada.nextInt();
        }

        System.out.println("\n-------------------------------------------");
        System.out.printf("Valor Total da Compra: R$ %.2f\n", totalGeral);
        System.out.println("-------------------------------------------");

        entrada.close();
    }
}
