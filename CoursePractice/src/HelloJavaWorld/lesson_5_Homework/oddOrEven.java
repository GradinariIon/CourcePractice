package HelloJavaWorld.lesson_5_Homework;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {

        System.out.println("Type a number: ");

        Scanner object = new Scanner(System.in);

        int number = object.nextInt();
        if (number % 2 == 0)
            System.out.println("Number " + number + " is odd");
        else System.out.println("Number " + number + " is even");

    }
}
