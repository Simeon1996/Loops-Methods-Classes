import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;


/**
 * Created by Simeon on 9/1/2015.
 */
public class DaysBetweenTwoDates {
    public static void main(String[] args) throws ParseException{
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Enter the first date: ");
        String dateOne = inputReader.nextLine();

        System.out.print("Enter the second date: ");
        String dateTwo = inputReader.nextLine();

        LocalDate firstDate = LocalDate.parse(dateOne, DateTimeFormatter.ofPattern("d-MM-yyyy"));
        LocalDate secondDate = LocalDate.parse(dateTwo, DateTimeFormatter.ofPattern("d-MM-yyyy"));

        System.out.print("Days: " + ChronoUnit.DAYS.between(firstDate,secondDate));
    }
}
