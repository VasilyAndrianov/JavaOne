package Them2;
/**Задать пустой целочисленный массив размером 8.
 * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
 */

public class Task2 {
    public static void main(String[] args) {

        int[] n = new int[8];
        int j = 0;
        int max = n.length;
        for (int i = 0; i < max; i++, j = j + 3) {
            n[i] = j;
            System.out.print(n[i] + " ");
        }


    }
}
