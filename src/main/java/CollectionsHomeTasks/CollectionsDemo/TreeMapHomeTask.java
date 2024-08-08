package CollectionsHomeTasks.CollectionsDemo;
import java.util.*;

public class TreeMapHomeTask
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of Testcases:");
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++)
        {
            int Q = scanner.nextInt();
            scanner.nextLine();

            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            List<String> results = new ArrayList<>();

            String queriesLine = scanner.nextLine();
            String[] queries = queriesLine.split(" ");

            int index = 0;
            while (index < queries.length) {
                String command = queries[index];
                switch (command) {
                    case "a":
                        int x = Integer.parseInt(queries[++index]);
                        int y = Integer.parseInt(queries[++index]);
                        treeMap.put(x, y);
                        index++;
                        break;
                    case "b":
                        x = Integer.parseInt(queries[++index]);
                        if (treeMap.containsKey(x)) {
                            System.out.print(String.valueOf(treeMap.get(x))+" ");
                        } else {
                            System.out.printf(-1+" ");
                        }
                        index++;
                        break;
                    case "c":
                        System.out.print(treeMap.size()+" ");
                        index++;
                        break;
                    case "d":
                        x = Integer.parseInt(queries[++index]);
                        treeMap.remove(x);
                        index++;
                        break;
                    case "e":
                        if (!treeMap.isEmpty()) {
                            StringBuilder mapContent = new StringBuilder();
                            for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
                                mapContent.append(entry.getKey()).append(" ");
                            }
                            System.out.print(mapContent.toString().trim()+" ");
                        } else {
                            System.out.print("");
                        }
                        index++;
                        break;
                    default:
                        index++;
                        break;
                }
            }
            System.out.println(String.join(" ", results));
        }

        scanner.close();
    }
}
