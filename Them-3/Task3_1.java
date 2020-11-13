package Them3;
/**Написать программу, которая загадывает случайное число от 0 до 9,
 * и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить
 *         больше ли указанное пользователем число чем загаданное, или меньше.
 *         После победы или проигрыша выводится запрос – «Повторить игру еще раз?
 *         1 – да / 0 – нет»(1 – повторить, 0 – нет).
  */


import java.util.Random;
import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int rnd = random.nextInt(9);
        Scanner sc = new Scanner(System.in);
        int player;
        boolean vic = false;

        for (int i = 1; i < 4; i++) {
            if (i==1)
                System.out.println("Угадайте число от 0 до 9 с трех попыток");
            player = sc.nextInt();

            if (rnd < player) {
                System.out.println("Ваше число больше");
            } else if (rnd > player) {
                System.out.println("Ваше число меньше");
            } else {
                System.out.println("Вы угадали " + rnd);
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

                vic = true;
                player = sc.nextInt();

                if (player==1){
                    i=0;
                    vic = false;
                    rnd = random.nextInt(9);
                }else if (player == 0)break;
            }

            if (i == 3 && !vic){
                System.out.println("Вы не угадали, это число " + rnd);
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

                rnd = random.nextInt();

                if (rnd ==1){
                    i=0;
                    vic = false;
                    rnd = random.nextInt(9);
                }else {
                    break;
                }
            }
        }
    }

}
