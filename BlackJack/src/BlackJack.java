import java.util.Scanner;

class BlackJack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BustCheck bc = new BustCheck();
        Hit hit = new Hit();
        Stay stay = new Stay();

        Card pCard1 = new Card();
        Card pCard2 = new Card();

        System.out.println("Your cards: " + pCard1.cardValue + " of " + pCard1.cardSuite
                                    + ", " + pCard2.cardValue + " of " + pCard2.cardSuite);

        System.out.print("Hit or stay: ");
        String firstAnswer = input.next().toLowerCase();
        int cardTotal = pCard1.cardValue + pCard2.cardValue;

        if(firstAnswer.equals("hit")) {
            hit.playerHit(cardTotal);
        } else {
            stay.stay(cardTotal);
        }
    }
}
