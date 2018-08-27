public class Hit {
    public void playerHit(int cardTotal) {
        Card pCardNew = new Card();
        BustCheck bc = new BustCheck();
        PromptUser prompt = new PromptUser();
        Hit newHit = new Hit();
        Stay stay = new Stay();

        System.out.println("New card: " + pCardNew.cardValue + " of " + pCardNew.cardSuite);

        int cardValArr[] = {cardTotal, pCardNew.cardValue};
        boolean over21 = bc.bustCheck(cardValArr);
        if(over21) {
            System.out.println("You busted!");
        }
        else {
            int newCardTotal = cardTotal + pCardNew.cardValue;
            System.out.println("Your new card total is: " + newCardTotal);
            String answer = prompt.hitOrStay();
            if(answer.equals("hit")) {
                newHit.playerHit(newCardTotal);
            } else {
                stay.stay(newCardTotal);
            }
        }
    }
    public void dealerHit(int cardValues, int cardTotal) {
        Card dCardNew = new Card();
        BustCheck bc = new BustCheck();
        EvaluateGame eval = new EvaluateGame();

        System.out.println("Dealer's new card: " + dCardNew.cardValue + " of " + dCardNew.cardSuite);

        int cardValArr[] = {cardTotal, dCardNew.cardValue};
        int newCardSum = cardTotal + dCardNew.cardValue;

        boolean over21 = bc.bustCheck(cardValArr);
        if(over21) {
            System.out.println("Dealer busts! You win!");
        } else if(newCardSum > 16) {
            eval.evaluateGame(cardValues, newCardSum);
        } else {
            System.out.println("Dealer has to hit again!");
            dealerHit(cardValues, newCardSum);
        }
    }
}
