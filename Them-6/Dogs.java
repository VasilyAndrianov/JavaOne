package Them6;

public class Dogs extends Animals {
   protected static double jump = 0.5;  //максимальная высота прыжка
   protected static int sweem = 10;     //максимальное расстояние вплавь
    protected static int run = 500;      //максимальное рассотяние бегом

    public Dogs(String name){
        super.name = name;
//
    }

    void dogInfo() {
        System.out.println("dogName: " + name + " | runMax: " + run+ " | sweemMax:" + sweem + " | jumpMax: " +jump);
    }


    //метод - бег
    public static void dogRun(int i){
        int dogMax = run;
        if (i <= dogMax){
            System.out.println(true);
        }else if (i > dogMax) {
            System.out.println(false);
        }
    }
    //метод - прыжок
    public static void dogJump(double i){
        double dogMax = jump;
        if (i <= dogMax){
            System.out.println(true);
        }else if (i > dogMax) {
            System.out.println(false);
        }
    }
    //метод - плаванье
    public static void dogSweem(int i){
        int dogMax = sweem;
        if (i <= dogMax){
            System.out.println(true);
        }else if (i > dogMax) {
            System.out.println(false);
        }
    }

    @Override
    public void voise() {
        System.out.println("Собака гавкнула");
    }
}
