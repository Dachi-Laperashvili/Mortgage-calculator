import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int principal = (int) readNumber("Principal: ",1000,1000000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ",1,30);
        byte years = (byte) readNumber("Period (years): ",1,30);
        Mortgage client = new Mortgage(principal,annualInterest,years);
        client.printMortgage(principal,annualInterest,years);
        client.printPaymentSchedule(principal,annualInterest,years);
    }
    public static double readNumber(String prompt, double min, double max) {
        Scanner input = new Scanner(System.in);
        double number;
        while (true) {
            System.out.print(prompt);
            number = input.nextFloat();
            if (number >= min && number <= max) {
                break;
            }
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return number;
    }

}