package HelloJavaWorld.lesson6homework;

import java.util.Scanner;

public class PorridgeTemp {

    public static void main(String[] args) {

        Scanner porridge = new Scanner(System.in);

        System.out.println("Please insert the temperature of the porridge: ");

        int temperature = porridge.nextInt();

        porridge.close();

        int maxTemp = 30;
        int minTemp = 10;

        if ( temperature < maxTemp && temperature > minTemp )
            System.out.println("The porridge is just right");
            if ( temperature < minTemp )
                System.out.println("The porridge is too cold");
            else if ( temperature > maxTemp )
                System.out.println("The porridge is too hot");


    }
}
