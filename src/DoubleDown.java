import java.util.Scanner;

public class DoubleDown {
    public void doubleDown(int totalCardVal, int bet, int chipCount) {
        Stay st = new Stay();

        Scanner input = new Scanner(System.in);
        System.out.print("Double down?");
        String ans = input.nextLine().toLowerCase();

        if(ans.equals("yes")) {
            System.out.println("Bet doubled! You receive one more card: ");
            Card newCard = new Card();
            System.out.println("New card: " + newCard.cardValue + " of " + newCard.cardSuite);
            int newCardTot = totalCardVal + newCard.cardValue;
            int newBet = bet*2;
            st.stay(newCardTot, newBet, chipCount);
        }
    }
}
