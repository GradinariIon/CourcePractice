package HelloJavaWorld.lesson4homework;

import java.util.Scanner;

public class MinutesConverter {
    public static void main(String [] args){

        Scanner time = new Scanner(System.in);
        System.out.println("Enter minutes: ");
        long min = time.nextLong();

        double days;
        double years;

            days = min / 1440f;
            years = min / 525600f;

        System.out.println("Days: " + days);
        System.out.println("Years: " + years);
    }
}
