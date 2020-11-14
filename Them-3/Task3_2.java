package Them3;

import java.util.Random;
import java.util.Scanner;

/**Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
         При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
         сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
         apple – загаданное
         apricot - ответ игрока
         ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
         Для сравнения двух слов посимвольно, можно пользоваться:
         String str = "apple";
         str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
         Играем до тех пор, пока игрок не отгадает слово
         Используем только маленькие буквы**/

public class Task3_2 {
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
