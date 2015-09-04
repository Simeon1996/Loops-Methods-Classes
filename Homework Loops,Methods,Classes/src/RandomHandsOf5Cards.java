import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Simeon on 9/2/2015.
 */
public class RandomHandsOf5Cards {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        String[] cardFaces = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] cardSuits = {"♣", "♦", "♠ ", "♥"};

        Random rnd = new Random();

        System.out.print("Random Hands.. : ");
        Integer repeatsNumber = reader.nextInt();

        for(Integer i = 0; i < repeatsNumber; i++){

            Integer firstCardFace = rnd.nextInt(cardFaces.length);
            Integer secondCardFace = rnd.nextInt(cardFaces.length);
            Integer thirdCardFace = rnd.nextInt(cardFaces.length);
            Integer fourthCardFace = rnd.nextInt(cardFaces.length);
            Integer fifthCardFace = rnd.nextInt(cardFaces.length);

            Integer firstCardSuit = rnd.nextInt(cardSuits.length);
            Integer secondCardSuit = rnd.nextInt(cardSuits.length);
            Integer thirdCardSuit = rnd.nextInt(cardSuits.length);
            Integer fourthCardSuit = rnd.nextInt(cardSuits.length);
            Integer fifthCardSuit = rnd.nextInt(cardSuits.length);

            String hand =
                    cardFaces[firstCardFace] + cardSuits[firstCardSuit] + " " +
                    cardFaces[secondCardFace] + cardSuits[secondCardSuit] + " " +
                    cardFaces[thirdCardFace] + cardSuits[thirdCardSuit] + " " +
                    cardFaces[fourthCardFace] + cardSuits[fourthCardSuit] + " " +
                    cardFaces[fifthCardFace] + cardSuits[fifthCardSuit];
            System.out.println();

            System.out.print(hand);
        }

    }
}
