/**
 * Created by Simeon on 9/2/2015.
 */
import java.io.*;
public class SumNumbersFromTextFile {
    public static void main(String[] args) throws IOException{
        Integer sumOfElements = 0;

        try {
            FileReader fileReader = new FileReader("input.txt");

            BufferedReader reader = new BufferedReader(fileReader);

            String line = reader.readLine();

            while (line != null) {
                Integer value = Integer.parseInt(line);

                sumOfElements += value;

                line = reader.readLine();
            }

            System.out.print("Sum = " + sumOfElements);

        }catch(Exception ex){
            System.out.println("Error");
        }

    }
}
