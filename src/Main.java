import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Welcome to my porject that converts degrees Celsius to Farenheit\n(Never ever done before)");

    System.out.print("Choose the temperature in Celsius ypu want to see in Farenheit: ");
    int temperature = Integer.parseInt(scanner.nextLine());

    double convertion = (temperature * 1.8) + 32;

        System.out.println("""
                Your temperature in Farenheit is: %s degrees!
                """.formatted(convertion));
    }
}