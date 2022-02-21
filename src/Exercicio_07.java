/*
    Leia dois valores com uma casa de cimal (x e y), que devem representar as coordenadas
    de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
    ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0)

    Se o ponto estiver na origem, escreva "Origem"
    Se o ponto estiver sobre um dos eixos, escreva "Eixo X" ou "Eixo Y", conforme
    for a situação
*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe dois valores: ");
        double valor1 = sc.nextDouble();
        double valor2 = sc.nextDouble();

        if (valor1 > 0 && valor2 > 0){
            System.out.println("Q1");
        } else if (valor1 < 0 && valor2 > 0){
            System.out.println("Q2");
        } else if (valor1 < 0 && valor2 < 0){
            System.out.println("Q3");
        } else if (valor1 > 0 && valor2 < 0){
            System.out.println("Q4");
        } else if (valor1 == 0 && valor2 > 0 || valor2 < 0){
            System.out.println("Eixo Y");
        } else if (valor1 < 0 || valor1 > 0){
            System.out.println("Eixo X");
        } else {
            System.out.println("Origem");
        }

        sc.close();
    }
}
