import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("\nAre you ready? Write 'yes' if you are.");

        String playing = sc.nextLine();
        if (playing.equals("yes")) {
            System.out.println("\nGreat!");
            System.out.println("rock - paper - scissors, shoot!");
            String myChoice = sc.nextLine();
            String compChoice = computerChoice();
            printResult(myChoice, compChoice, result(myChoice, compChoice));
        } else {
            System.out.println("\nDarn, some other time..!");
        }

        sc.close();
    }

    public static String computerChoice() {
        double num = Math.random() * 3;
        int computerChoice = (int) num;

        if (computerChoice == 0) {
            return "rock";
        } else if (computerChoice == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        if (yourChoice.equals("rock") && computerChoice.equals("scissors") || yourChoice.equals("paper")
                && computerChoice.equals("rock") || yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        }

        else if (computerChoice.equals("rock") && yourChoice.equals("scissors") || computerChoice.equals("paper")
                && yourChoice.equals("rock") || computerChoice.equals("scissors") && yourChoice.equals("paper")) {
            result = "You lose";
        } else if (yourChoice.equals(computerChoice)) {
            result = "Tie!";

        } else if (yourChoice != "rock" || yourChoice != "paper" || yourChoice != "scissors") {
            result = "INVALID CHOICE";
        } else {
            result = "You lose";
        }

        return result;
    }

    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\nYou chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
    }
}
