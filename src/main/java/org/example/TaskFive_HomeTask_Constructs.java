package org.example;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class TaskFive_HomeTask_Constructs {
    private static final Logger logger = LogManager.getLogger(TaskFive_HomeTask_Constructs.class);

    public static void main(String[] args) {

        //Task5.1 -assignTicket()
        //1. You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
        logger.info("Home Task 5 Constructs");
        System.out.println("\nTask 5.1"); //Determine the ticket rates
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the driven speed: ");
        int speed = Integer.parseInt(scanner.next());
        System.out.print("Is it your Birthday?: ");
        boolean isBirthday = Boolean.parseBoolean(scanner.next());
        System.out.println("Ticket result: " + assignTicket(speed, isBirthday));
        System.out.println();

        //Task5.2 - isGreatNumber()
        // The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is  6. Note: the function Math.abs(num) computes the absolute value of a number.

        System.out.println("\nTask 5.2"); //Determine if great number
        System.out.print("Enter num1: ");
        int num1 = Integer.parseInt(scanner.next());
        System.out.print("Enter num2: ");
        int num2 = Integer.parseInt(scanner.next());
        System.out.print(isGreatNumber(num1, num2));
        System.out.println();

        //Task5.3 - partyOutcome()
        //We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).

        System.out.println("\nTask 5.3"); //Tea and Candy party outcome
        System.out.print("Enter tea quantity: ");
        int tea = Integer.parseInt(scanner.next());
        System.out.print("Enter candy quantity: ");
        int candy = Integer.parseInt(scanner.next());
        System.out.println("Party Outcome: " + partyOutcome(tea, candy));
        System.out.println();

        //Task5.4 - blueLotteryTicket()
        //You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.

        System.out.println("\nTask 5.4"); //Blue Lottery Ticket
        System.out.print("Enter num1: ");
        int a = Integer.parseInt(scanner.next());
        System.out.print("Enter num2: ");
        int b = Integer.parseInt(scanner.next());
        System.out.print("Enter num3: ");
        int c = Integer.parseInt(scanner.next());
        System.out.println("Ticket result: " + blueLotteryTicket(a, b, c));
        System.out.println();

        //Task5.5 -inOrder()
        //Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.

        System.out.println("\nTask 5.5");
        System.out.print("Enter num1: ");
        int n1 = Integer.parseInt(scanner.next());
        System.out.print("Enter num2: ");
        int n2 = Integer.parseInt(scanner.next());
        System.out.print("Enter num3: ");
        int n3 = Integer.parseInt(scanner.next());
        System.out.print("Enter bOk value");
        boolean bOk = Boolean.parseBoolean(scanner.next());
        System.out.println("Ticket result: " + inOrder(n1, n2, n3, bOk));
        System.out.println();

        //Task5.6 -inOrder() -hasCommonDigit()
        // Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
        System.out.println("\nTask 5.6");

        System.out.print("Enter num1: ");
        int no1 = Integer.parseInt(scanner.next());
        System.out.print("Enter num2: ");
        int no2 = Integer.parseInt(scanner.next());
        System.out.println("Common Digit Result: " + hasCommonDigit(no1, no2));
        System.out.println();


        //Task5.7 -inOrder() -sumWithDigitCheck()
        //Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b.

        System.out.println("\nTask 5.7");
        System.out.print("Enter num1: ");
        int numb1 = Integer.parseInt(scanner.next());
        System.out.print("Enter num2: ");
        int numb2 = Integer.parseInt(scanner.next());
        System.out.println("Sum Digit Result: " + sumWithDigitCheck(numb1, numb2));
        System.out.println();

        //Task5.8 -removeSubString()
        System.out.println("\nTask 5.8");
        System.out.println(removeSubString("Hello there", "llo"));
        System.out.println();

        //Task5.9 -removeLargestBlock()
        //Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
        System.out.println("\nTask 5.9");
        System.out.println(removeLargestBlock("abbCCCddBBBxx")); // Output: 3
        System.out.println();

        //Task5.10 -sumOfNumbersInString()
        //Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
        System.out.println("\nTask 5.10");
        System.out.println(sumOfNumbersInString("aa11b33"));
        System.out.println();
    }

    public static int assignTicket(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }
        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }

    public static boolean isGreatNumber(int num1, int num2) {
        if (num1 == 6 || num2 == 6)
            return true;
        if (num1 + num2 == 6)
            return true;
        if (Math.abs(num1 - num2) == 6)
            return true;
        return false;
    }

    public static int partyOutcome(int tea, int candy) {
        if (tea < 5 || candy < 5)
            return 0;
        if (tea >= 2 * candy || candy >= 2 * tea)
            return 2;
        return 1;
    }

    public static int blueLotteryTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10)
            return 10;
        if (ab == bc + 10 || ab == ac + 10)
            return 5;
        return 0;
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk || b > a)
            if (c > b)
                return true;
        return false;
    }

    public static boolean hasCommonDigit(int a, int b) {
        int aLeft = a / 10;
        int aRight = a % 10;

        int bLeft = b / 10;
        int bRight = b % 10;

        if(aLeft==0||bLeft==0)  //One Digit Case
            return false;
        else
            return (aLeft == bLeft || aLeft == bRight || aRight == bLeft || aRight == bRight);
    }

    public static int sumWithDigitCheck(int a, int b) {
        int sum = a + b;

        int aDigits = String.valueOf(a).length();
        int sumDigits = String.valueOf(sum).length();

        if (sumDigits == aDigits) {
            return sum;
        } else {
            return a;
        }
    }

    public static String removeSubString(String str, String sub) {
        String lowerStr = str.toLowerCase();
        String lowerSub = sub.toLowerCase();
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < str.length())
        {
            if (i + sub.length() <= str.length() && lowerStr.substring(i, i + sub.length()).equals(lowerSub)) {
                i += sub.length();
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }

        return result.toString();
    }

    public static int removeLargestBlock(String str) {
        if (str.isEmpty())
            return 0;

        int maxBlockLength = 1;
        int currBlockLength = 1;

        for (int i = 1; i < str.length(); i++)
        {
            if (str.charAt(i) == str.charAt(i - 1))
                currBlockLength++;
            else {
                if (currBlockLength > maxBlockLength)
                    maxBlockLength = currBlockLength;
                currBlockLength = 1;
            }
        }
        if (currBlockLength > maxBlockLength) {
            maxBlockLength = currBlockLength;
        }
        return maxBlockLength;
    }

    public static int sumOfNumbersInString(String str) {
        int sum = 0;
        StringBuilder numberBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (Character.isDigit(currChar))
                numberBuilder.append(currChar);
            else {
                if (!numberBuilder.isEmpty()) {
                    sum += Integer.parseInt(numberBuilder.toString());
                    numberBuilder.setLength(0);
                }
            }
        }
        if (!numberBuilder.isEmpty()) {
            sum += Integer.parseInt(numberBuilder.toString());
        }
        return sum;
    }
}