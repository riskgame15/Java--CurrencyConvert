import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in USD: ");
        double usd = scanner.nextDouble();

        double vnd = usd * 25000;
        System.out.printf("Convert to vnd: " + vnd);
    }
}
