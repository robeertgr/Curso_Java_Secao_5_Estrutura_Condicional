/*
    Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida,
    calcule e mostre o valor que esta pessoa deve pagar de imposto de renda, segundo a tabela abaixo.

    Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois
    a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de imposto de renda. No exemplo
    fornecido, a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total.
    O valor deve ser impresso com duas casas decimais.
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double imposto;

        System.out.println("RENDA \t\t\t\t\t\t IMPOSTO DE RENDA");
        System.out.println("de R$ 0.00 a R$ 2000.00 \t isento");
        System.out.println("de R$ 2000.00 a R$ 3000.00 \t 8%");
        System.out.println("de R$ 3000.00 a R$ 4500.00 \t 18%");
        System.out.println("acima de R$ 4500.00 \t\t 28%");

        System.out.print("Informe o salário da pessoa: R$ ");
        double salarioPessoa = sc.nextDouble();

        if (salarioPessoa < 2000){
            System.out.println("Isento de imposto.");
        } else if (salarioPessoa < 3000.0){
            imposto = (salarioPessoa - 2000.0) * 0.08;
            System.out.printf("8 de imposto: R$ %.2f", imposto);
        } else if (salarioPessoa < 4500){
            imposto = (salarioPessoa - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("18 de imposto: R$ %.2f", imposto);
        } else {
            imposto = (salarioPessoa - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("28 de imposto: R$ %.2f", imposto);
        }

        sc.close();
    }
}
