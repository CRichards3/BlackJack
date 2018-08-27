public class Stay {
    public void stay(int cardValues) {
        EvaluateGame eval = new EvaluateGame();
        Hit hit = new Hit();
        System.out.println("You chose to stay, with a total card value of " + cardValues);

        Card dealerCard1 = new Card();
        Card dealerCard2 = new Card();

        System.out.println("Dealer's cards: " + dealerCard1.cardValue + " of " + dealerCard1.cardSuite
                + ", " + dealerCard2.cardValue + " of " + dealerCard2.cardSuite);

        int initialTotal = dealerCard1.cardValue + dealerCard2.cardValue;

        if(initialTotal < 17) {
            System.out.println("Dealer has to hit!");
            hit.dealerHit(cardValues, initialTotal);
        } else {
            eval.evaluateGame(cardValues, initialTotal);
        }
    }
}
