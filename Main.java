import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        System.out.print("Welcome to tic-tac-toe!\nWhat is player 1's name? ");
        Scanner scanner = new Scanner(System.in);
        String name1;
        name1 = scanner.nextLine();
        System.out.println("Hello, " + name1 + "!\nWhat is player 2's name? ");
        String name2;
        name2 = scanner.nextLine();
        System.out.println("Hello, " + name2 + "!\nWho will going first?\n" +
                "1- Player 1\n2- Player 2\n0- I'll choose for you");
        Integer goingFirst;
        goingFirst = scanner.nextInt();
        if (goingFirst == 1){
            System.out.print(name1 + " will be going first.");}
        if (goingFirst == 2){
            System.out.print(name2 + " will be going first.");}
        if (goingFirst == 0) {
            int chosen;
            Random random = new Random();
            chosen = random.nextInt(2);
            if (chosen == 0) {
                System.out.println("I have chosen " + name1 + " to go first.");}
            if (chosen == 1) {
                System.out.println("I have chosen " + name2 + " to go first.");}
        }
        System.out.println("\nFirst player is X's\nSecond player is O's\nlets get started!");
        board.printBoard();
    }
}