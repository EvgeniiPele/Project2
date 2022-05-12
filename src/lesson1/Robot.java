package lesson1;

public class Robot implements Member{
    private final String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 500;
    }

    @Override
    public int jump() {
        return 10;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                '}';
    }
}
