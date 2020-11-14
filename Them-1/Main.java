package Them1;

public class Main {
    //Задание, метод main
    public static void main(String[] args){
        System.out.println(sum(3f, 6f,2f,4f));
        System.out.println();
        check(4, 7);
        System.out.println();
        positiveOnNegative(4);
        System.out.println();
        isNegative(-4);
        System.out.println();
        printHello("Mihail");
        System.out.println();
        isYear(2021);

    }

    //Создать переменные всех пройденных типов данных, и инициализировать их значения;

    int i = 1;
    byte bt = 16;
    boolean bul = true;
    char ch = 't';
    short sh = 265;
    long l = 313134541414l;
    double d = 3.0;
    float fl = 23423f;
    String s = "df";


    // Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат(аргументы этого метода, имеющие тип float)
    private static float sum(float a, float b, float c, float d){
        return a*(b + (c / d));
    }

    // Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    // в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    private static boolean check (int a, int b){
        int sum = a + b;
        if (10 <= sum && sum <= 20 ){
            return true;
        }else {
            return false;
        }
    }

    // Написать метод, которому в качестве параметра передается целое число, метод должен
    // напечатать в консоль, положительное ли число передали или отрицательное. ​
    // Замечание: ноль считаем положительным числом.
    private static void positiveOnNegative(int x){
        if (x < 0){
            System.out.println("Ваше число отрицательное");
        }else {
            System.out.println("Ваше число положительное");
        }
    }

    //Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное.
    private static boolean isNegative(int x){
        return (x < 0);
    }

    /**Написать метод, которому в качестве параметра передается строка, обозначающая имя.
     * Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     * */
    private static void printHello(String name){
        System.out.println("Привет, " + name);
    }

    // *Написать метод, который определяет, является ли год високосным, и выводит сообщение в
    // консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    private static boolean isYear(int year){
        return ((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0));

    }
}
