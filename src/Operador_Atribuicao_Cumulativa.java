import java.util.Scanner;

public class Operador_Atribuicao_Cumulativa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double conta = 50;
        System.out.print("Informe a quantidade de minutos: ");
        double minutos = sc.nextDouble();

        if (minutos > 100) {
            conta += (minutos - 100) * 2;
            System.out.printf("Total da conta: R$ %.2f", conta);
        }else{
            System.out.printf("Total da conta: R$ %.2f", conta);
        }
        sc.close();
    }
}
