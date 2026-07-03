import java.util.Scanner;
public class Task1{
    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32; }
    static double celsiusToKelvin(double c) {
        return c + 273.15; }
    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9; }
    static double fahrenheitToKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15; }
    static double kelvinToCelsius(double k) {
        return k - 273.15; }
    static double kelvinToFahrenheit(double k) {
        return (k - 273.15) * 9 / 5 + 32; }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Choose conversion type (1–6): ");
        int choice = input.nextInt();
        System.out.print("Enter temperature value: ");
        double temp = input.nextDouble();

        switch (choice) {
            case 1 :
                System.out.println(temp + " °C = " + celsiusToFahrenheit(temp) + " °F");
            case 2:
                System.out.println(temp + " °C = " + celsiusToKelvin(temp) + " K");
            case 3:
                System.out.println(temp + " °F = " + fahrenheitToCelsius(temp) + " °C");
            case 4 :
                System.out.println(temp + " °F = " + fahrenheitToKelvin(temp) + " K");
            case 5 :
                System.out.println(temp + " K = " + kelvinToCelsius(temp) + " °C");
            case 6:
                System.out.println(temp + " K = " + kelvinToFahrenheit(temp) + " °F");
                break;
            default:
                System.out.println("Invalid choice!");
        }
        input.close();
    }
}
