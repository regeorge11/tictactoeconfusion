import java.util.Scanner;

public class Board {
    int i,j;
    //ANSI_Colors ansi_colors = new ANSI_Colors();
    private char[][] playerSpace = {{'*','*','*'},{'*','*','*'},{'*','*','*'}};
    private int[] labels = {1,2,3,4,5,6,7,8,9};
    Scanner input = new Scanner(System.in);

    private void labeledVerticalBoarder(int segments, boolean newline){
        for (int i = 0; i < 3; i++) {
            System.out.printf("| %d ", labels[i + segments * 3]);
        }
        if (newline = true) System.out.println ("|");
    }
    private void spacedVerticalBoarder(int segments, boolean newline){
        for (int i = 0; i < 3; i++) {
            System.out.printf("| %c ", playerSpace[segments][i]);
        }
        if (newline = true) System.out.println ("|");
    }
    private void horizontalBoarder(){
        System.out.println("--------------");
    }
    public void printBoard() {
        labeledVerticalBoarder(0,true);
        spacedVerticalBoarder(0,true);
        horizontalBoarder();
        labeledVerticalBoarder(1,true);
        spacedVerticalBoarder(1,true);
        horizontalBoarder();
        labeledVerticalBoarder(2,true);
        spacedVerticalBoarder(2,false);
    }
}
