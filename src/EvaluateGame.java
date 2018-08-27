public class EvaluateGame {
    public void evaluateGame(int pCardTotal, int dCardTotal, int bet) {
        System.out.println("Dealer total is: " + dCardTotal);
        if(pCardTotal == dCardTotal) {
            System.out.println("It's a tie! You lose no chips");
        } else if(pCardTotal > dCardTotal) {
            int totalChips = (bet * 2) + 100;
            System.out.println("You win! Total chips: " + totalChips);

            BlackJack.newGame(totalChips);
        } else {
            int totalChips = 100 - bet;
            System.out.println("You lost! Total chips: " + totalChips);
            BlackJack.newGame(totalChips);
        }
    }
}
