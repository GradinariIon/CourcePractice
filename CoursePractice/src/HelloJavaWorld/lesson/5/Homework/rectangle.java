package HelloJavaWorld.lesson_5_Homework;

import java.util.Scanner;

public class rectangle {

    public static void main(String[] args) {

        Scanner rectangle1 = new Scanner(System.in);

        System.out.println("The width of rectangle1 is: ");
        System.out.println("The lenght of rectangle1 is: ");

        int width1 = rectangle1.nextInt();
        int lenght1 = rectangle1.nextInt();


        Scanner rectangle2 = new Scanner(System.in);

        System.out.println("The width of rectangle2 is: ");
        System.out.println("The lenght of rectangle2 is: ");

        int width2 = rectangle2.nextInt();
        int lenght2 = rectangle2.nextInt();

        rectangle1.close();
        rectangle2.close();

        int arrea1 = (width1 * lenght1);
        int arrea2 = (width1 * lenght2);
        if (arrea1 > arrea2)
            System.out.println("The rectangle1 is bigger");
        else if (arrea1 < arrea2)
            System.out.println("The rectangle2 is bigger");
        else
            System.out.println("The rectangle1 is equal to rectangle2");

    }

}
