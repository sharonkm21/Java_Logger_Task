package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class TaskOne_Hometask_Variables
{
    private static final Logger logger = LogManager.getLogger(TaskOne_Hometask_Variables.class);

   public static void main(String[] args) {
        //Task 1 //Adding apples using variables
        System.out.println("\nTask 1");
        addApples();
    }
    public static void addApples()
    {
        int a=3,b=2;
        double x=3.5;
        double y=2.5;
        int  intSum=a+b;
        double doubleSum=x+y;

        System.out.println("Integer Sum: "+intSum);
        System.out.println("Double Sum: "+doubleSum);
    }
}
