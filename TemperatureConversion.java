import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTemperature Conversion Utility");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter temperature value: ");
            double temperature = scanner.nextDouble();

            try {
                switch (choice) {
                    case 1:
                        double celsiusToFahrenheit = celsiusToFahrenheit(temperature);
                        System.out.println("Result: " + celsiusToFahrenheit + " °F");
                        break;
                    case 2:
                        double fahrenheitToCelsius = fahrenheitToCelsius(temperature);
                        System.out.println("Result: " + fahrenheitToCelsius + " °C");
                        break;
                    case 3:
                        double celsiusToKelvin = celsiusToKelvin(temperature);
                        System.out.println("Result: " + celsiusToKelvin + " K");
                        break;
                    case 4:
                        double kelvinToCelsius = kelvinToCelsius(temperature);
                        System.out.println("Result: " + kelvinToCelsius + " °C");
                        break;
                    case 5:
                        double fahrenheitToKelvin = fahrenheitToKelvin(temperature);
                        System.out.println("Result: " + fahrenheitToKelvin + " K");
                        break;
                    case 6:
                        double kelvinToFahrenheit = kelvinToFahrenheit(temperature);
                        System.out.println("Result: " + kelvinToFahrenheit + " °F");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("Kelvin temperature cannot be negative.");
        }
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }
}
