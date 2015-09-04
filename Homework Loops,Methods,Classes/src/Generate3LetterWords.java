import java.util.Scanner;

/**
 * Created by Simeon on 9/1/2015.
 */
public class Generate3LetterWords {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            String letters = input.nextLine();

            String treeLetterWord = "";

            for (Integer i = 0; i < letters.length(); i++) {
                for (Integer j = 0; j < letters.length(); j++) {
                    for (Integer k = 0; k < letters.length(); k++) {
                        treeLetterWord = "" + letters.charAt(i) + letters.charAt(j) + letters.charAt(k);
                        System.out.print(treeLetterWord + " ");
                    }
                }
            }
        }
}
