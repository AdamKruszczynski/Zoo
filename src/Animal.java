import java.util.Objects;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name " + name + ", age " + age);
    }
}
