import java.util.Scanner;
public class Tictactoe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                board[row][column] = ' ';
            }
        }
        char player = 'X';
        boolean gameover = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameover) {
            printBoard(board);
            System.out.println("Player "+player+" Enter:");
            int row =scanner.nextInt();
            int column =scanner.nextInt();
            if(board[row][column]==' '){
              board[row][column]=player;
              gameover=haveWon(board,player);
              if(gameover){
                  System.out.println("Player"+player+"\t has won !!!");
              }else {
                  if(player=='X'){
                      player='O';
                  }else{
                      player='X';
                  }




              }
            }else{
                System.out.println("Invalid move try again!");
            }
        }
    }
    public static boolean haveWon(char[][] board ,char player){
        for(int row=0;row<board.length;row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        for(int cloumn=0;cloumn<board.length;cloumn++) {
            if (board[0][cloumn] == player && board[1][cloumn] == player && board[2][cloumn] == player) {
                return true;
            }
        }
            if((board[0][0]==player && board[1][1]==player && board[2][2]==player)&&(board[0][2]==player && board[1][1]==player && board[2][0]==player)){
                return true;
            }else{
                return false;
            }



    }
    public static void printBoard(char[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                System.out.println(board[row][column] + '-');
            }
            System.out.println();
        }

    }
}