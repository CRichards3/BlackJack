import java.util.Scanner;

public class ChipCheck {
    public void chipCheck(int chipCount) {
        BlackJack newGame = new BlackJack();

        if (chipCount <= 0) {
            Scanner in = new Scanner(System.in);
            System.out.println("Game over! Play again?");
            String ans = in.nextLine().toLowerCase();
            if(ans.equals("yes")) {
                newGame.newGame(100);
            } else {
                System.out.println("Thanks for playing!");
            }
        } else {
            BlackJack.newGame(chipCount);
        }
    }
}
