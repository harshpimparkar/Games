import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class Rock {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 -> Rock\t\t2 -> Paper\t\t3 -> Scissor");
        System.out.println("There will be 5 rounds");


        int count1=0,count2=0;
        for (int i=1;i<=5;i++) {
            System.out.println("\n\nEnter Your choice :");
            int player = scanner.nextInt();

            if (player < 1 && player > 3) {

                System.out.println("Enter valid number");
            } else if (player == 1) {
                System.out.println("Rock");

            } else if (player == 2) {
                System.out.println("Paper");

            } else if (player == 3) {
                System.out.println("Scissor");

            }

            System.out.println("A.I choice : ");
            int choice = ThreadLocalRandom.current().nextInt(1, 4);
            if (choice == 1) {
                System.out.print(" Rock");

            } else if (choice == 2) {
                System.out.print(" Paper");

            } else if (choice == 3) {
                System.out.print(" Scissor");

            }


             if (player < choice) {
                 System.out.println("\nRound goes to Player");
                 count2++;
             } else if(choice > player) {
            System.out.println("\nRound goes to AI");
            count1++;}
             else {
                System.out.println("\nDraw");
            }

        }
        if (count1>count2){
            System.out.println("\n PLAYER IS DEFEATED");
        } else if (count1<count2) {
            System.out.println("\nPLAYER WINS");
        } else if (count1==count2) {
            System.out.println("\nOVERALL DRAW");

        }
    }
}
