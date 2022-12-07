
 package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();

        Player player1 = new Player(random.nextInt(10) - 100);
        Player player2 = new Player(random.nextInt(10) - 100);
        Player player3 = new Player(random.nextInt(10) - 100);

        Player.info();

        Player player4 = new Player(random.nextInt(10) - 100);
        Player player5 = new Player(random.nextInt(10) - 100);

        Player.info();

        Player player6 = new Player(random.nextInt(10) - 100);

        Player.info();

        Player player7 = new Player(25);

        Player.info();

        for (int i = 0; i > player2.stamina; i++)
            player2.run();

        Player.info();
    }
}
