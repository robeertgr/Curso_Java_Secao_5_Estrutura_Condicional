import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.print("Quantas horas? ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.print("Bom dia");
        } else if (hora < 18) {
            System.out.print("Boa tarde");
        } else {
            System.out.print("Boa noite");
        }

        sc.close();
    }
}
