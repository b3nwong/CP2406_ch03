import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("enter a percentage: ");
        float percentOne = Float.parseFloat(reader.nextLine());

        System.out.print("enter another percentage: ");
        float percentTwo = Float.parseFloat(reader.nextLine());

        System.out.print(percentOne +  " is ");
        System.out.println(computePercent(percentOne,percentTwo) + " percent of " + percentTwo);

        System.out.print(percentTwo +  " is ");
        System.out.println(computePercent(percentTwo,percentOne) + " percent of " + percentOne);

    }

    public static int computePercent(float percentOne, float percentTwo){
        float result = (percentOne/percentTwo)*100;
        int number = (int)result;
        return number;
    }
}
