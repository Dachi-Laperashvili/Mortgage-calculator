import java.text.NumberFormat;
public class Mortgage {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    int principal;
    float annualInterest;
    byte years;


    // constructor of class
    public Mortgage(int principal,float annualInterest,byte years){
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }
    // prints monthly mortgage payment
    public void printMortgage(int principal,float annualInterest,byte years){
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;
        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
    // prints remaining money to pay off mortgage each month
    public void printPaymentSchedule(int principal,float annualInterest,byte years){
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(short month = 1; month <= years * MONTHS_IN_YEAR; month++){
            double balance = principal *
                    (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, month))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }


}