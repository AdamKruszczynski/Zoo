public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", 4);
        Cat cat = new Cat("Kicia", 6);
        Turtle turtle = new Turtle("Tom", 35);
        Pig pig = new Pig("pigg", 7);

        dog.eat();
        cat.eat();
        pig.eat();

    }
}
