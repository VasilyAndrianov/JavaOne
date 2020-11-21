package Them6;

public class Dogs extends Animals {

    public Dogs(String name, double maxJunp, int maxRunWay, int maxSwimWay){
        super(name, maxJunp, maxRunWay, maxSwimWay);
    }

    void dogInfo() {
        System.out.println("dogName: " + name + " | runMax: " + maxRunWay + " | sweemMax:" + maxSwimWay + " | jumpMax: " + maxJunp);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunWay){
            System.out.println("Пес пробежал " + dist);
        }else
            System.out.println("Пес не смог пробежать, расстояние больше его возможностей");
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimWay){
            System.out.println("Пес проплыл " + dist);
        }else
            System.out.println("Пес не смог проплыть, расстояние больше его возможностей");
    }


    @Override
    public void jump(double dist){
        if (dist <= maxJunp){
            System.out.println("Пес прыгнул на высоту " + dist);
        }else
            System.out.println("Пес не смог прыгнуть, высота больше его возможностей");
    }


    @Override
    public void voise() {
        System.out.println("гав гав");
    }
}
