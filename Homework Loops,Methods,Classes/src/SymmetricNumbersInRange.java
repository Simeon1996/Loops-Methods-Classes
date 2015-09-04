import java.util.Scanner;

/**
 * Created by Simeon on 9/1/2015.
 */
public class SymmetricNumbersInRange {
    public static void SymmetricFinder(Integer number){
        Integer numberLength = number.toString().length();

        if(numberLength == 1){
            System.out.print(number + " ");
        }
        if(numberLength == 2){
            Integer firstDigit = (number / 1) % 10;
            Integer secondDigit = (number / 10) % 10;

            if(firstDigit == secondDigit){
                System.out.print(number + " ");
            }
        }
        if(numberLength == 3){
            Integer firstDigit = (number / 1) % 10;
            Integer thirdDigit = (number / 100) % 10;

            if(firstDigit == thirdDigit){
                System.out.print(number + " ");
            }
        }
    }

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the numbers range [start end]: ");
        String[] numbers = reader.nextLine().split(" ");

        Integer startNumber = Integer.parseInt(numbers[0]);
        Integer endNumber = Integer.parseInt(numbers[1]);

        for(Integer i = startNumber;i <= endNumber;i++){
            SymmetricFinder(i);
        }
    }
}
