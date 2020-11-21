package Them6;

public class Plate{

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food >= 0)
            food -= n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    int getFood() {
        return food;
    }

    public void addFood(int addFood){
        food += addFood;
    }

}

