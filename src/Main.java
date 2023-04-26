import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Mortgage calculator
        Scanner input = new Scanner(System.in);
        // asking user for principle
        System.out.println("Enter your principle (1k-1m)");
        int principle = input.nextInt();
        // if principle isn't in 1k-1m range asking user to enter a valid number
        while(principle < 1000 || principle > 1000000 ){
            System.out.println("Please enter a valid number");
            principle = input.nextInt();
        }
        // asking user for yearly rate (0;100)
        System.out.println("Enter the yearly rate (0-100)");
        float r = input.nextInt();
        // if yearly rate isn't in 0-100 range asking user to enter a valid number
        while (r < 0 || r > 100) {
            System.out.println("Please enter a valid number");
            r = input.nextFloat();
        }
        // asking user to enter the number of years
        System.out.println("Enter the number of years (0-100)");
        byte num = input.nextByte();
        // if number of years isn't in 0-100 range asking user to enter a valid number
        while (num < 0 || num > 100) {
            System.out.println("Please enter a valid number");
            num = input.nextByte();
        }
        float R = r * 12 * 100;
        float N = num / 12;
        double mortgage = principle * (R * Math.pow(1 + R,N)) / (Math.pow(1 + R, N) - 1);

        System.out.println("Your monthly payment is " + mortgage);
    }
}
