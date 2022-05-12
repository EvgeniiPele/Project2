package lesson1;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean passObstacle(Member member) {
        if (member.jump() >= height) {
            System.out.printf("%s перепрыгнул стену высотой %d метров %n", member, height);
            return true;
        }
        System.out.printf("%s не смог перепрыгнуть стену высотой %d метров %n" , member, height);
        return false;
    }
}
