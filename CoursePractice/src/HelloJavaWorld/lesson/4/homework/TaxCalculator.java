package HelloJavaWorld.Lesson_4_homework;

import java.util.Scanner;

public class TaxCalculator {

    public static void main (String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Introduce the price: ");
        a = new Scanner(System.in);
        double price = a.nextDouble();

        System.out.println("Introduce tax: ");
        a = new Scanner(System.in);
        double tax = a.nextDouble();

        System.out.println("Introduce quantity: ");
        a = new Scanner(System.in);
        int quantity = a.nextInt();

        a.close();

        double total;
        total = price * tax * quantity;
        System.out.println("Total cost with tax is: " + total);
    }

    }

