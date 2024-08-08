package CollectionsHomeTasks.CollectionsDemo;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListHomeTask
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of lines");
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number of Elements");
            int numOfIntegers = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < numOfIntegers; j++) {
                System.out.println("Enter number");
                line.add(scanner.nextInt());
            }
            lines.add(line);
        }
        System.out.println("Enter the number of queries");
        int q = scanner.nextInt();

        ArrayList<int[]> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            System.out.println("Enter x and y for query " + i+1);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            queries.add(new int[]{x, y});
        }

        for (int[] query : queries) {
            int x = query[0];
            int y = query[1];

            if (x <= lines.size() && y <= lines.get(x - 1).size() && y > 0) {
                System.out.println(lines.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}
