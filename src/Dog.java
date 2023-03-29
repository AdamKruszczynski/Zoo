public class Dog extends Animal implements Eat{
    String name;
    int age;

    public Dog(String name,int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("I eat");
    }
}
