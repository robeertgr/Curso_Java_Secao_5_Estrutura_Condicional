/*
    Fazer um programa para ler um número inteiro e dizer se este número é par ou impar.
*/

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double numero = sc.nextDouble();

        if (numero % 2 == 0){
            System.out.println("Número é par.");
        } else {
            System.out.println("Número é impar.");
        }

        sc.close();
    }
}
