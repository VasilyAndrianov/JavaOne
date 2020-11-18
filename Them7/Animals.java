package Them6;

public abstract class Animals {
      protected String name;
      protected double maxJunp;
      protected int maxRunWay;
      protected int maxSwimWay;
      protected int appetite;
      protected boolean isFull;

      public Animals(String name, double maxJunp, int maxRunWay, int maxSwimWay) {
            this.name = name;
            this.maxJunp = maxJunp;
            this.maxRunWay = maxRunWay;
            this.maxSwimWay = maxSwimWay;
      }

    public Animals(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }


    public String getName(){
        return name;
    }

    public boolean getIsFull(){
        return false;
    }

    public abstract void voise();

      public void run(int dist){
            if (dist <= maxRunWay){
                  System.out.println();
            }else
                  System.out.println();
      }

      public void jump(double dist){
            if (dist <= maxJunp){
                  System.out.println();
            }else
                  System.out.println();
      }

      public void swim(int dist){

      }

}
