package Them6;

public class Main {
    public static void main(String[] args) {

//        Cats cat = new Cats("Murzik", 2, 250);
//        Dogs dog = new Dogs("Kron", 1, 400, 30);
//        Dogs dogs = new Dogs("Kit", 1.5, 600, 25);
//        Dogs dogs1 = new Dogs("Bob", 0.7, 700, 23);
//
//        dog.dogInfo();
//        System.out.println("");
//        cat.catInfo();
//        System.out.println("");
//
//        cat.run(200);
//        cat.swim(2);
//        dog.run(400);
//        dogs.swim(50);
//        dogs.run(60);
//       dogs1.run(750);


        Cats[] cat = {
                new Cats("Pixel", 300),
                new Cats("Murzik", 200),
                new Cats("Bob", 150),
                new Cats("Leo", 200),
                new Cats("Dar", 200),
        };
        Plate plate = new Plate(1000);
        plate.info();
        for (Cats cats : cat) {
            cats.eat(plate);
            plate.info();
        }

        plate.addFood(500);
        plate.info();
    }
}
