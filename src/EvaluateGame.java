public class EvaluateGame {
    public void evaluateGame(int pCardTotal, int dCardTotal, int bet, int chipCount) {
        System.out.println("Dealer total is: " + dCardTotal);
        if(pCardTotal == dCardTotal) {
            System.out.println("It's a tie! You lose no chips");
            BlackJack.newGame(chipCount);
        } else if(pCardTotal > dCardTotal) {
            int totalChips = (bet * 2) + chipCount;
            System.out.println("You win! Total chips: " + totalChips);

            BlackJack.newGame(totalChips);
        } else {
            int totalChips = chipCount - bet;
            System.out.println("You lost! Total chips: " + totalChips);
            BlackJack.newGame(totalChips);
        }
    }
}
