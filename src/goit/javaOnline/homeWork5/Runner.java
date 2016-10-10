package goit.javaOnline.homeWork5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Square square = new Square();
    try {
        System.out.println("Enter base and height triangle: ");
        square.triangleSquare(scanner.nextInt(), scanner.nextInt());
        System.out.println("Enter sides rectengle: ");
        square.rectangleSquare(scanner.nextInt(), scanner.nextInt());
        System.out.println("Enter ridius: ");
        square.circleSquare(scanner.nextInt());
    } catch (InputMismatchException e ) {
        System.out.println("Please enter only integer!");
    }

        Temperature temperature = new Temperature();
     try {
         System.out.println("Enter temperature on Celsius");
         temperature.celsiusToFahrenheit(scanner.nextDouble());
         System.out.println("Enter temperature on Fahrenheit");
         temperature.fahrenheitToCelsius(scanner.nextDouble());
     } catch (InputMismatchException ex){
         System.out.println("Please enter only numbers!");
     }

         Distance distance = new Distance();

        System.out.println("Enter coordinate first dot = ");
        try{
        double a1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();
        System.out.println("Enter coordinate second dot = ");
        double b1 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
            distance.distanceDot(a1,a2,b1,b2);
        } catch (InputMismatchException e){
            System.out.println("Please  use ',' ");
        }




    }
}