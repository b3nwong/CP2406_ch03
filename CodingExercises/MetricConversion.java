import java.util.Scanner;

public class MetricConversion {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a value: ");
        double userValue = Double.parseDouble(reader.nextLine());

        double toCentimetres = 2.54;
        double toLiters = 3.7854;

        double convertedCm = userValue*toCentimetres;
        double convertedLiters = userValue*toLiters;

        System.out.println("This is " + convertedCm + "cm and " + convertedLiters + " liters.");
    }
}
