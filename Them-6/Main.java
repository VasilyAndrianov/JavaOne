package Them6;

public class Main {
    public static void main(String[] args) {

        Cats a = new Cats("Murzik");
        Dogs d = new Dogs("Kron");
        Dogs dogs = new Dogs("Kit");
        Dogs dogs1 = new Dogs("Bob");

        d.dogInfo();
        a.catInfo();

        a.run(200);
        a.catSweem(2);
        d.dogRun(400);
        d.dogSweem(50);
        dogs.dogRun(400);
       dogs1.dogRun(750);
    }

}
