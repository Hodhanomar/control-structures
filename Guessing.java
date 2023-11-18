public class Guessing {

    public static void main(String[] args) {

        java.util.Random rand = new java.util.Random();
        int randomNumber = rand.nextInt(21);
        int guessCount = 0;
        int guess;

        System.out.println("Guess a number between 0 and 20: ");

        java.util.Scanner input = new java.util.Scanner(System.in);

        while (guessCount < 5) {
            guess = input.nextInt();
            guessCount++;

            if (guess == 17) {
                System.out.println("You win!");
                break;
            } else if (guessCount < 5) {
                if (guess > 20) {
                    System.out.println("Invalid choice. Guess a number between 0 and 20: ");
                } else {
                    System.out.println("Try again. Guess a number between 0 and 20: ");
                }
            } else {
                System.out.println("Sorry, you didn't guess the number. The number was " + 17+ ".");
            }
        }
    }
}