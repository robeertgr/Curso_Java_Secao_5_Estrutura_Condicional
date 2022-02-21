/*
    Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "São múltiplos" ou
    "Não são múltiplos", indicando se os valores lidos são múltiplos entre sí. Atenção: os números podem
    ser digitados em ordem crescente ou decrescente.
*/

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe dois números: ");
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos.");
        } else {
            System.out.println("Não são múltiplos.");
        }

        sc.close();
    }
}
