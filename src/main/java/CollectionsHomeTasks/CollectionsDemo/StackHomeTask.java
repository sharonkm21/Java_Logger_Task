package CollectionsHomeTasks.CollectionsDemo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Stack;

public class StackHomeTask
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader reader= new BufferedReader(new FileReader("src/main/resources/StackStringFile.txt"));
            String line = reader.readLine();
            while(line!=null)
            {
                System.out.println("Line: "+line);
                System.out.println(isBalanced(line));
                line = reader.readLine();
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
