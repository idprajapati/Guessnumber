import java.util.*;

public class Main {
    public static void Guess() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int trail = 5;
        int i, guess;
        System.out.println("A number is choosen " + "between 1 to 100" + " Guess the number your want to Enter"
                + "within 5 trail");
        for (i = 0; i < trail; i++) {
            System.out.println("Guess the Number:");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("You guessed the Correct number");
                break;
            } else if (number > guess && i != trail - 1) {
                System.out.println("The number is " + "greater than " + guess);
            } else if (number < guess && i != trail - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
        }
        if (i == trail) {
            System.out.println("You have exhausted " + "Trails.");
            System.out.println("The number was :" + number);
        }
    }

    public static void main(String args[]) {
        Guess();
    }
}