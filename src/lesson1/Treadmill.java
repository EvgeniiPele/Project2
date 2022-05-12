package lesson1;

public class Treadmill implements Obstacle {
    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean passObstacle(Member member) {
        if (member.run() >= length) {
            System.out.printf("%s пробежал дорожку длиной %d метров %n", member, length);
            return true;
        }
        System.out.printf("%s не смог пробежать дорожку длиной %d метров %n", member, length);
        return false;
    }
}
