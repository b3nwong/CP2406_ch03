import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //ask for student name
        System.out.print("What is your name?: ");
        String name = reader.nextLine();

        //ask for student GPA
        System.out.print("What is your GPA?: ");
        float gpa = Float.parseFloat(reader.nextLine());

        //award student credit
        int studentCredit = (int) (gpa*10);
        System.out.println("You have earned $" + studentCredit + ".");

    }
}
