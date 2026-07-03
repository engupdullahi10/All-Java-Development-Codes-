import java.util.Scanner;

public class Temperature {

    // Conversion Methods
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        return celsiusToKelvin(celsius);
    }

    public static double kelvinToFahrenheit(double kelvin) {
        double celsius = kelvinToCelsius(kelvin);
        return celsiusToFahrenheit(celsius);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        double temp, result;

        do {
            // Show Menu
            System.out.println("\n=== Temperature Converter ===");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Celsius to Kelvin");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("4. Fahrenheit to Kelvin");
            System.out.println("5. Kelvin to Celsius");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1 to 7): ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    temp = input.nextDouble();
                    result = celsiusToFahrenheit(temp);
                    System.out.println("Result: " + result + " °F");
                    break;

                case 2:
                    System.out.print("Enter temperature in Celsius: ");
                    temp = input.nextDouble();
                    result = celsiusToKelvin(temp);
                    System.out.println("Result: " + result + " K");
                    break;

                case 3:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    temp = input.nextDouble();
                    result = fahrenheitToCelsius(temp);
                    System.out.println("Result: " + result + " °C");
                    break;

                case 4:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    temp = input.nextDouble();
                    result = fahrenheitToKelvin(temp);
                    System.out.println("Result: " + result + " K");
                    break;

                case 5:
                    System.out.print("Enter temperature in Kelvin: ");
                    temp = input.nextDouble();
                    result = kelvinToCelsius(temp);
                    System.out.println("Result: " + result + " °C");
                    break;

                case 6:
                    System.out.print("Enter temperature in Kelvin: ");
                    temp = input.nextDouble();
                    result = kelvinToFahrenheit(temp);
                    System.out.println("Result: " + result + " °F");
                    break;

                case 7:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 7);
    }
}
