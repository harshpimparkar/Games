import java.util.Scanner;
public class tic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input , currentTurn=1;
        char turn='X';
        char[] pos = {' ',' ',' ',' ',' ',' ',' ',' ',' '};

        while(true) {
            System.out.println("Enter the position:");
            input = scanner.nextInt();//input will be from 1-9
            pos[input - 1] = turn;//turn will be from 0-8

            //printing the matrix
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");


            //condition for winning
            if ((pos[0] == turn && pos[1] == turn && pos[2] == turn) ||
                    (pos[3] == turn && pos[4] == turn && pos[5] == turn) ||
                    (pos[6] == turn && pos[7] == turn && pos[8] == turn) ||
                    (pos[6] == turn && pos[3] == turn && pos[0] == turn) ||
                    (pos[7] == turn && pos[4] == turn && pos[1] == turn) ||
                    (pos[8] == turn && pos[5] == turn && pos[2] == turn) ||
                    (pos[6] == turn && pos[4] == turn && pos[2] == turn) ||
                    (pos[8] == turn && pos[4] == turn && pos[0] == turn)) {

                System.out.println(turn +" is the Winner :)");
                break;
            }
            //changing turns
            if(turn=='X') {
                turn = 'O';

            } else if (turn=='O') {
                turn='X';
            }
            if((input==1) || (input==2)  || (input==3) || (input==4) || (input==5) || (input==6) || (input==7) || (input==8) || (input==9)) {
                currentTurn++;
            }
            if (currentTurn>9){
                System.out.println("Draw");

            }

        }





    }
}
