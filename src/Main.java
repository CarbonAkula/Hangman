import java.util.Scanner;

public class Main {

    public static void main (String[]args){
        //declare
        Scanner keyboard;
        String A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;
        String _;
        int vs;
        String c;
        String p;
        String playerWord;
        String playerGuessWord;
        String playerGuess;
        String newPlayerGuessWord;


        //initialization phase

        keyboard = new Scanner(System.in);


        System.out.println("Welcome to Hangman! Would you like to play against the computer (Type C) or another player (Type P)?");
        vs = keyboard.nextLine();

        if keyboard.nextLine() = p, System.println("Type a word or phrase. Make sure the other player doesn't see!");

        playerWord = keyboard.nextLine().toLowerCase();

        String[] playerWordBreakdown = playerWord.split("");
        playerGuessWord = playerWord.substring(0,1)+playerGuess+playerWord.substring(1+1);
        newPlayerGuessWord.contains("_");


        else System.println("Choose a category you would like a word or phrase from: Food(1), Movies and TV(2), Animals(3), Sports(4), Hobbies(5)");
    }
}
