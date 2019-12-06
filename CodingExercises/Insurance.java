import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Current year: ");
        int currentYear = Integer.parseInt(reader.nextLine());

        System.out.print("Birth year: ");
        int birthYear = Integer.parseInt(reader.nextLine());

        int userAge = currentYear-birthYear;

        int decades = userAge/10;

        int premiumBase = decades+15;

        int premiumPaid = premiumBase*20;

        System.out.println("Your premium is $" + premiumPaid + ".");

    }
}
