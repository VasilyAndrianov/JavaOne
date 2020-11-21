package Them6;

public class Cats extends Animals {


    public Cats(String name, double maxJunp, int maxRunWay){
        super(name, maxJunp, maxRunWay, 0);
    }

    public Cats(String name, int appetite) {
        super(name, appetite);
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    void catInfo() {
        System.out.println("catName: " + name + " | runMax: " + maxRunWay + " | " + " jumpMax: " + maxJunp);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunWay){
            System.out.println("Кот пробежал " + dist);
        }else
            System.out.println("Кот не смог пробежать, расстояние больше его возможностей");
    }


    @Override
    public void swim(int dist) {
        System.out.println(false);
    }


    @Override
    public void jump(double dist){
        if (dist <= maxJunp){
            System.out.println("Кот прыгнул на высоту " + dist);
        }else
            System.out.println("Кот не смог прыгнуть, высота больше его возможностей");
    }

    @Override
    public void voise() {
        System.out.println("мяу мяу");
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            // если покушал - стал сытым
            System.out.println(name + " наелся");
            isFull = true;
        } else {
            System.out.println(name + " не стал есть, ему нужно больше еды");
            // если не покушал - остался голодным
            isFull = false;
        }
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean getIsFull() {
        return false;
    }
}