public class Stay {
    public void stay(int cardValues, int userBet, int chipCount) {
        EvaluateGame eval = new EvaluateGame();
        Hit hit = new Hit();
        System.out.println("Your total card value is " + cardValues);

        Card dealerCard1 = new Card();
        Card dealerCard2 = new Card();

        System.out.println("Dealer's cards: " + dealerCard1.cardValue + " of " + dealerCard1.cardSuit
                + ", " + dealerCard2.cardValue + " of " + dealerCard2.cardSuit);

        int initialTotal = dealerCard1.cardValue + dealerCard2.cardValue;

        if(initialTotal < 17) {
            System.out.println("Dealer has to hit!");
            hit.dealerHit(cardValues, initialTotal, userBet, chipCount);
        } else {
            eval.evaluateGame(cardValues, initialTotal, userBet, chipCount);
        }
    }
}
