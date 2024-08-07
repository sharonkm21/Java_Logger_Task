package org.example;

import java.util.Scanner;

public class TaskThree_HomeTask_Loops
{
    public static void main(String[] args) {
        //Task3
        System.out.println("\nTask 3"); //Pattern print using different loops

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line = Integer.parseInt(scanner.next());

        System.out.print("Enter multiplier: ");
        int multiplier = Integer.parseInt(scanner.next());

        forLoopPattern(line, multiplier);
        System.out.println();
        whileLoopPattern(line, multiplier);
        System.out.println();
        doWhileLoopPattern(line, multiplier);
        System.out.println();
    }

    public static void forLoopPattern(int line,int multiplier)
    {
        int k=0;
        for(int i=0;i<=line;i++)
        {
            for(int j=0;j<i;j++,k++)
              System.out.print(" "+k*multiplier);
            System.out.println();
        }
    }

    public static void whileLoopPattern(int line,int multiplier)
    {
        int k = 0;
        int i = 0;

        while (i <= line) {
            int j = 0;
            while (j < i) {
                System.out.print(" " + k * multiplier);
                j++;
                k++;
            }
            System.out.println();
            i++;
        }
    }

    public static void doWhileLoopPattern(int line,int multiplier)
    {
        int k = 0;
        int i = 0;
        do {
            int j = 0;
            do {
                if (j < i) {
                    System.out.print(" " + k * multiplier);
                    k++;
                }
                j++;
            } while (j < i);
            System.out.println();
            i++;
        } while (i <= line);
    }
}
