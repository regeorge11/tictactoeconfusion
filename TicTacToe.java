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

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your box, 1-9: ");
        int pos = scan.nextInt();

        System.out.println(pos); }


    pubic static void placePiece(char[] [] board, int pos, String user) {

        char symbol = 'X' ;

        if(user.equals("player 1")) {
            symbol = 'X';
        } else if(user.equals("player 2")) {
            symbol = 'O' ;

        }

        switch(pos) {
            case 1:
                board [0] [0] = 'X' ;
                break;
            case 2:
                board [0] [2] = 'X' ;
                break;
            case 3:
                board [0] [4] = 'X' ;
                break;
            case 4:
                board [2] [0] = 'X' ;
                break;
            case 5:
                board [2] [2] = 'X' ;
                break;
            case 6:
                board [2] [4] = 'X' ;
                break;
            case 7:
                board [4] [0] = 'X' ;
                break;
            case 8:
                board [4] [2] = 'X' ;
                break;
            case 9:
                board [4] [4] = 'X' ;
                break;
            default;
                break;

        }

        // print board with values???

    }
    public static String checkWins() {

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List lefCol = Arrays.asList(1, 2, 3);
        List midCol = Arrays.asList(7, 8, 9);
        List rihCol = Arrays.asList(3, 6, 9);
        List posLin = Arrays.asList(7, 5, 3);
        List negLin = Arrays.asList(1, 5, 9);

        List<List> wins = new ArrayList<List>();
        wins.add(topRow);
        wins.add(midRow);
        wins.add(botRow);
        wins.add(lefCol);
        wins.add(midCol);
        wins.add(rihCol);
        wins.add(posLin);
        wins.add(negLin);



        return;

    }




}

//public class Player {
//    mark playerMark;
//
//
//
//
//}
//
//enum mark {
//    char EX = 'x';
//    char O = 'O';
//}
