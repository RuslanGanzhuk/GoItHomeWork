package goit.javaOnline.homeWork5;

public class Temperature {

    public void fahrenheitToCelsius(double temperatureOnFahrenheit){

         double temperatureOnCelsius = (temperatureOnFahrenheit - 32) * 0.556;

        System.out.println("Celsius = " + temperatureOnCelsius);

    }

    public void celsiusToFahrenheit(double temperatureOnCelsius ){

        double temperatureOnFahrenheit = (temperatureOnCelsius * 1.8) + 32;

        System.out.println("Fahrenheit = " + temperatureOnFahrenheit);
    }
}
