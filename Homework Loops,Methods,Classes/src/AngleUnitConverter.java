import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Simeon on 9/2/2015.
 */
public class AngleUnitConverter {
    private static double DegreesToRadians(String number) {
        Double convertedNumber = Double.parseDouble(number);

        return convertedNumber * 0.0174532925;
    }

    private static double RadiansToDegrees(String number) {
        Double convertedNumber = Double.parseDouble(number);

        return convertedNumber * 57.2957795;
    }

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter the query number: ");
        Integer repeatTimes = inputReader.nextInt();

        for (Integer i = 0; i < repeatTimes; i++) {

            String[] firstArgument = inputReader.nextLine().split(" ");
            String[] secondArgument = inputReader.next().split(" ");

            String number = firstArgument[0];
            String measure = secondArgument[0];

            if(measure.equals("deg")){
                System.out.printf("%6f rad", DegreesToRadians(number));
            }
            else{
                System.out.printf("%6f deg", RadiansToDegrees(number));
            }
            System.out.println();
        }

    }


}
