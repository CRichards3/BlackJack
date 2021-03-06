import java.util.Scanner;

class BlackJack {
    public static void main(String[] args) {
        newGame(100);
    }

    public static void newGame(int chipCount) {
        Scanner input = new Scanner(System.in);
        BustCheck bc = new BustCheck();
        Hit hit = new Hit();
        Stay stay = new Stay();
        PromptUser prompt = new PromptUser();
        DoubleDown dd = new DoubleDown();

        Card pCard1 = new Card();
        Card pCard2 = new Card();
        int cardTotal = pCard1.cardValue + pCard2.cardValue;

        System.out.println("----------New Game----------");
        System.out.println("Total chips: " + chipCount);
        System.out.print("Place starting bet: ");
        int initialBet = input.nextInt();

        System.out.println("Your cards: " + pCard1.cardValue + " of " + pCard1.cardSuit
                + ", " + pCard2.cardValue + " of " + pCard2.cardSuit);

        if(cardTotal < 12 && cardTotal > 8) {
            dd.doubleDown(cardTotal, initialBet, chipCount);
        }

        String firstAnswer = prompt.hitOrStay();
        if(firstAnswer.equals("hit")) {
            hit.playerHit(cardTotal, initialBet, chipCount);
        } else {
            stay.stay(cardTotal, initialBet, chipCount);
        }
    }
}
