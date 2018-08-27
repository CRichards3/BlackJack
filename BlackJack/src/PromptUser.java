import java.util.Scanner;

public class PromptUser {
    public String hitOrStay() {
        Scanner input = new Scanner(System.in);

        System.out.print("Hit or stay: ");
        String answer = input.next().toLowerCase();
        return answer;
    }
}
