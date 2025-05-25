import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompound;
        int years;
        double amount;

        System.out.print("Enter the principla amount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the interest rate: ");
        rate = scanner.nextDouble();
        System.out.print("Enter the # of times compound per year: ");
        timeCompound = scanner.nextInt();
        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timeCompound,timeCompound * years);

        System.out.println(amount);
        scanner.close();

    }
}