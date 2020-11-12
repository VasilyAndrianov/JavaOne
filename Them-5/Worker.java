package Them5;

public class Worker {
    private String name;
    private String position;
    private String email;
    private String telNamber;
    private int salary;
    private int age;

    protected Worker(String name, String position, String email, String telNamber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.telNamber = telNamber;
        this.salary = salary;
        this.age = age;
    }

    void getFullInfo(){
        System.out.println("name: " + name + " | position: " + position + " | email: " + email + " | salary: " + salary + " | age: " + age);
    }

    int getAge(){
        return age;
    }

}
