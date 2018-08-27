public class Hit {
    public void playerHit(int cardTotal, int bet) {
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
            int totalChips = 100-bet;
            BlackJack.newGame(totalChips);

        }
        else {
            int newCardTotal = cardTotal + pCardNew.cardValue;
            System.out.println("Your new card total is: " + newCardTotal);
            String answer = prompt.hitOrStay();
            if(answer.equals("hit")) {
                newHit.playerHit(newCardTotal, bet);
            } else {
                stay.stay(newCardTotal, bet);
            }
        }
    }
    public void dealerHit(int cardValues, int cardTotal, int bet) {
        Card dCardNew = new Card();
        BustCheck bc = new BustCheck();
        EvaluateGame eval = new EvaluateGame();

        System.out.println("Dealer's new card: " + dCardNew.cardValue + " of " + dCardNew.cardSuite);

        int cardValArr[] = {cardTotal, dCardNew.cardValue};
        int newCardSum = cardTotal + dCardNew.cardValue;

        boolean over21 = bc.bustCheck(cardValArr);
        if(over21) {
            System.out.println("Dealer busts! You win!");
            int totalChips = (bet*2) + 100;
            BlackJack.newGame(totalChips);
        } else if(newCardSum > 16) {
            eval.evaluateGame(cardValues, newCardSum, bet);
        } else {
            System.out.println("Dealer has to hit again!");
            dealerHit(cardValues, newCardSum, bet);
        }
    }
}
