public class Goat extends Animal implements Eat{
    String name;
    int age;

    public Goat(String name,int age) {
        super(name,age);

    }

    @Override
    public void eat() {
        System.out.println("I eat");
    }
}
