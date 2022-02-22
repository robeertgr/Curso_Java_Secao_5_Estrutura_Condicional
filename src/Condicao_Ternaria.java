import java.util.Scanner;

public class Condicao_Ternaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o preço do produto: ");
        double preco = sc.nextDouble();

        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println("Desconto do produto custando R$ " + preco + " foi de R$ " + desconto);

    }
}
