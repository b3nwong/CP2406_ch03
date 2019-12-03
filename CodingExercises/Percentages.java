public class Percentages {
    public static void main(String[] args) {
        float percentOne = (float) 2.0;
        float percentTwo = (float) 5.0;
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
