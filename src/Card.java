import java.util.Random;

public class Card {
    int cardValue;
    String cardSuit;

    int values[] = {2,3,4,5,6,7,8,9,10,10,10,10};
    String suites[] = {"Hearts", "Diamonds", "Spades", "Clubs"};

   public Card() {
       int suiteArrMin = 0;
       int suiteArrMax = 3;
       Random r = new Random();
       int suiteArrIndex =  r.nextInt((suiteArrMax - suiteArrMin) + 1) + suiteArrMin;

       int numArrMin = 0;
       int numArrMax = 11;
       Random p = new Random();
       int numArrIndex =  p.nextInt((numArrMax - numArrMin) + 1) + numArrMin;

       this.cardValue = values[numArrIndex];
       this.cardSuit = suites[suiteArrIndex];

   }
}

