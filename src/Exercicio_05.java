import java.util.Scanner;

/*
    Com base na tabela abaixo, escreva um programa que leia o código de um item e
    a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
*/
public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total;

        System.out.println("CÓDIGO \t ESPECIFICAÇÃO \t\t PREÇO");
        System.out.println("1 \t\t Cachorro Quente \t R$ 4.00");
        System.out.println("2 \t\t X-salada \t\t\t R$ 4.50");
        System.out.println("3 \t\t X-bacon \t\t\t R$ 5.00");
        System.out.println("4 \t\t Torrada Simples \t R$ 2.00");
        System.out.println("5 \t\t Refrigerante \t\t R$ 1.50");

        System.out.print("Informe o código e a quantidade do produto: ");
        int opcao = sc.nextInt();
        int quantidade = sc.nextInt();


        if (opcao == 1){
            total = quantidade * 4;
            System.out.printf("Total: R$ %.2f", total);
        } else if (opcao == 2){
            total = quantidade * 4.5;
            System.out.printf("Total: R$ %.2f", total);
        } else if (opcao == 3){
            total = quantidade * 5;
            System.out.printf("Total: R$ %.2f", total);
        } else if (opcao == 4){
            total = quantidade * 2;
            System.out.printf("Total: R$ %.2f", total);
        } else if (opcao == 5){
            total = quantidade * 1.5;
            System.out.printf("Total: R$ %.2f", total);
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
