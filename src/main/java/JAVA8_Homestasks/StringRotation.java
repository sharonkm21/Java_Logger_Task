package JAVA8_Homestasks;

import java.util.function.BiPredicate;

public class StringRotation
{
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        System.out.println("Are the two strings rotations of each other? " + areRotationsWOLambda(str1, str2));

        BiPredicate<String, String> areRotations = (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return false;
            }
            return (s1 + s2).contains(s2);
        };

        boolean result = areRotations.test(str1, str2);
        System.out.println("Are the two strings rotations of each other? " + result);
    }

    public static boolean areRotationsWOLambda(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}
