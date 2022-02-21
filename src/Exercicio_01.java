/*
    Fazer um programa para ler um número inteiro e depois dizer se este
    número é negativo ou não.
*/

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double numero = sc.nextDouble();

        if (numero < 0){
            System.out.println("Número é negativo.");
        } else {
            System.out.println("Número é positivo.");
        }

        sc.close();
    }
}
