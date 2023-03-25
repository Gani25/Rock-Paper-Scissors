package AGadget;
import java.util.Scanner;
class RockPaperScissior {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors Game.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("\nAre you ready? Write 'yes' if you are, otherwise quite the Game press Any key");
        String playing = "OK";
        while (!(playing.equals("n"))){
             playing = sc.nextLine().toLowerCase();
            if (playing.equals("yes") || playing.equals("y")) {
                System.out.println("\nGreat!");
                System.out.println("rock - paper - scissors, shoot!");
                String myChoice = sc.nextLine();
                String compChoice = computerChoice();
                printResult(myChoice, compChoice, result(myChoice, compChoice));
            }
        }
        System.out.println("\nQuite This Game!" +
                "Thanks for Playing this Game.. \n Codder: ALi G@te$ ");
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

    public static int wins;
    public static int lose;
    public static int ties;
    public static String result(String yourChoice, String computerChoice) {

        String result = "";
        if (yourChoice.equals("rock") && computerChoice.equals("scissors") || yourChoice.equals("paper")
                && computerChoice.equals("rock") || yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
            wins++;
        } else if (computerChoice.equals("rock") && yourChoice.equals("scissors") || computerChoice.equals("paper")
                && yourChoice.equals("rock") || computerChoice.equals("scissors") && yourChoice.equals("paper")) {
            result = "You lose";
            lose++;
        } else if (yourChoice.equals(computerChoice)) {
            result = "Tie!";
            ties++;
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
        System.out.println("You have Played " +(wins + lose + ties));
        System.out.println("You have Won " +wins+ " times \n");
        System.out.println("You have Lose " +lose+ " times \n ");
        System.out.println("The Ties happened " +ties+ " times ");
        System.out.println(result);
    }
}
