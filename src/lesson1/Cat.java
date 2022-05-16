package lesson1;

public class Cat implements Member {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 50;
    }

    @Override
    public int jump() {
        return 5;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
