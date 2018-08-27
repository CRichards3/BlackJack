public class EvaluateGame {
    public void evaluateGame(int pCardTotal, int dCardTotal) {
        System.out.println("Dealer total is: " + dCardTotal);
        if(pCardTotal == dCardTotal) {
            System.out.println("It's a tie!");
        } else if(pCardTotal > dCardTotal) {
            System.out.println("You win!");
        } else {
            System.out.println("You lost!");
        }
    }
}
