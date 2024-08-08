package CollectionsHomeTasks.CollectionsDemo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapHomeTask
{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of entries in the phone book");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        Map<String, String> phoneBook = new HashMap<>();

        System.out.println("Enter the phone book entries");
        for (int i = 0; i < n; i++) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Phone Number:");
            String phoneNumber = scanner.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        BufferedReader reader= new BufferedReader(new FileReader("src/main/resources/PhoneQueries.txt"));
        String line = reader.readLine();
        try {
            while(line!=null)
                {
                    if (phoneBook.containsKey(line)) {
                        System.out.println(line + "=" + phoneBook.get(line));
                    } else {
                        System.out.println("Not found");
                    }
                    line = reader.readLine();
                }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
