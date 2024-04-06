import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido al conversor de temperaturas de Celsius a Fahrenheit");
        System.out.println("Ingresa tu temperatura en Celsius:");

        double tempCelsius = in.nextDouble();
        double tempFahrenheit = (tempCelsius * 1.8) + 32;
        int tempFahrenheitSinDecimales = (int) tempFahrenheit;

        System.out.println("La temperatura en Fahrenheit es: " + tempFahrenheit);
        System.out.println("La temperatura en Fahrenheit sin decimales es: " + tempFahrenheitSinDecimales);
    }
}
