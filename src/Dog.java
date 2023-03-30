import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
