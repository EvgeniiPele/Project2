package lesson1;

public class Test1 {
    public static void main(String[] args) {
        Human human = new Human("Иван");
        Cat cat = new Cat("Барсик");
        Robot robot = new Robot("Чаппи");

        Treadmill treadmill = new Treadmill(250);
        Wall wall = new Wall(4);

        Member[] members = {human, cat, robot};
        Obstacle[] obstacles = {treadmill, wall};

        for (Member member : members) {
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.passObstacle(member)) {
                    System.out.printf("Участник %s выбыл %n", member);
                    break;
                }

            }
        }
    }
}
