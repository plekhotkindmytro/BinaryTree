package dmytro.test.data;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Animal animal) {
        return name().compareTo(animal.name());
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
