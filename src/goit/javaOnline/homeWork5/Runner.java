package goit.javaOnline.homeWork5;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Square square = new Square();
/*
        System.out.println("Enter base and height triangle: ");
        square.triangleSquare(scanner.nextInt(), scanner.nextInt());
        System.out.println("Enter sides rectengle: ");
        square.rectangleSquare(scanner.nextInt(),scanner.nextInt());
        System.out.println("Enter ridius: ");
        square.circleSquare(scanner.nextInt());

        Temperature temperature = new Temperature();

        System.out.println("Enter temperature on Celsius");
        temperature.celsiusToFahrenheit(scanner.nextDouble());
        System.out.println("Enter temperature on Fahrenheit");
        temperature.fahrenheitToCelsius(scanner.nextDouble());*/

         Distance distance = new Distance();
        distance.distanceDot(-2.3,8.5,4,0.7);


    }
}