public class NumbersDemo {
    public static void main(String[] args) {
        int firstNumber = 12;
        int secondNumber = 23;
        //declared the two variables

        System.out.print("The first number doubled is ");
        System.out.println(displayTwiceTheNumber(firstNumber));

        System.out.print("First number plus 5 is ");
        System.out.println(displayNumberPlusFive(firstNumber));

        System.out.print("Second number doubled is ");
        System.out.println(displayTwiceTheNumber(secondNumber));

        System.out.print("Second number plus 5 is ");
        System.out.println(displayNumberPlusFive(secondNumber));
    }

    public static int displayTwiceTheNumber(int number){
        int numberTwice = number*2;

        return numberTwice;
    }

    public static int displayNumberPlusFive(int number){
        int numberPlusFive = number+5;

        return numberPlusFive;
    }

}
