package CollectionsHomeTasks.CollectionsDemo.ComparatorTask;

import java.util.Arrays;
import java.util.Scanner;

public class JavaComparatorHomeTask
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add number of Players: ");
        int n = scanner.nextInt();
        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Add Name and score of Player "+(i+1));
            String name = scanner.next();
            int score = scanner.nextInt();
            players[i] = new Player(name, score);
        }

        scanner.close();
        Arrays.sort(players, new Checker());

        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }
    }
}
