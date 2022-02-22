/*
    Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana
    (sendo 1 = domingo, 2 = segunda, e assim por diante). Escrever na tela o dia da
    semana correspondente.
*/

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dia;

        System.out.print("Informe um dia da semana: ");
        int diaDaSemana = sc.nextInt();

        switch (diaDaSemana){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
                break;
        }

        System.out.println("Dia da semana: " + dia);

        sc.close();
    }
}
