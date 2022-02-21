/*
    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo
    que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de
    uma hora e máxima de vinte e quatro horas.
*/

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a hora inicial e final do jogo em inteiro: ");
        int HoraInicial = sc.nextInt();
        int HoraFinal = sc.nextInt();
        int DuracaoJogo;

        if (HoraInicial < HoraFinal){
            DuracaoJogo = HoraFinal - HoraInicial;
            System.out.println("O jogo durou " + DuracaoJogo + " hora(s).");
        } else {
            DuracaoJogo = 24 - HoraInicial + HoraFinal;
            System.out.println("O jogo durou " + DuracaoJogo + " hora(s).");
        }

        sc.close();
    }
}
