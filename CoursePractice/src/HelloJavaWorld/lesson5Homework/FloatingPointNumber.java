package HelloJavaWorld.lesson5Homework;

import java.util.Scanner;

public class FloatingPointNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value: ");

        double npc = input.nextDouble();

        if (npc == 0) {
            System.out.println("The vallue is zero");
        } else if (npc < 1 && npc > 0) {
            System.out.println("The value is small positive");
        } else if (npc >= 1 && npc <= 1_000_000) {
            System.out.println("The value is positive");
        } else if (npc > 1_000_000) {
            System.out.println("The value is large positive");
        } else {
            System.out.println("The value is negative");
        }

        }

    }

