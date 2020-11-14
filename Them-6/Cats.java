package Them6;

public class Cats extends Animals {
    String name;
    protected static double jump = 2.0;                //максимальная высота прыжка
    protected static boolean sweem =  false;          //максимальное расстояние вплавь
    protected static int run = 200;                  //максимальное рассотяние бегом



    public Cats(String name){
        this.name = name;

    }


    void catInfo() {
        System.out.println("catName: " + name + " | runMax: " + run+ " | sweemMax:" + sweem + " | jumpMax: " + jump);
    }

    //метод - бег
    public static void run(int i) {
        int catMax = run;
        if (i <= catMax){
            System.out.println(true);
        }else if (i > catMax) {
            System.out.println(false);
        }
    }
    //метод - плаванье
    public static void catSweem(int i) {
        System.out.println(false);
    }
    //метод - прыжок
    public static void catJump(int i){
        double catMax = jump;
        if (i <= catMax){
            System.out.println(true);
        }else if (i > catMax) {
            System.out.println(false);
        }
    }

    @Override
    public void voise() {
        System.out.println("Кот мяукнул");
    }
}
