// A guessing game where three players guesses a number between  1-9
// Any player who guesses the number correctly is declared the winner.
public class GuessGame {
    Player player1;
    Player player2;
    Player player3;


    public void startGame() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        //  instantiate variable for player guesses
        int player1Guess = 0;
        int player2Guess = 0;
        int player3Guess = 0;

        boolean player1Correct = false;
        boolean player2Correct = false;
        boolean player3Correct = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");


        while (true) {

            System.out.println("Number to guess is " + targetNumber);

            player1Guess =  player1.guess();
            player2Guess = player2.guess();
            player3Guess = player3.guess();

            if (player1Guess == targetNumber) {
                player1Correct = true;
            };

            if (player2Guess == targetNumber) {
                player2Correct = true;
            };

            if(player3Guess == targetNumber) {
                player3Correct = true;
            }

            System.out.println("Player one guessed " + player1Guess);
            System.out.println("Player two guessed " + player2Guess);
            System.out.println("Player three guessed " + player3Guess);

            if (player1Correct || player2Correct || player3Correct) {
                System.out.println("\nWe have a winner!\n");
                System.out.println("Player one got it right? " + player1Correct);
                System.out.println("Player two got it right? " + player2Correct);
                System.out.println("Player three got it right? " + player3Correct);
                System.out.println("Game is over!");
                System.exit(2);
            }else {
                System.out.println("\nNo player got it correct. Try again!\n");
            }


        }
    }
}
