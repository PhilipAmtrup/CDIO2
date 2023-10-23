import java.util.Random;
import java.util.Scanner;


public class terningespil {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Velkommen til terningespillet!");


        System.out.print("Indtast spiller 1's navn: ");
        String player1Name = scanner.nextLine();
        System.out.print("Indtast spiller 2's navn: ");
        String player2Name = scanner.nextLine();


        
    }




    
    public class Player {

       Integer player1score = 0;
       Integer player2score = 0;
   
       Integer turn = 0;
   
   
       public class Konto {
           int bankkonto1 = 1000;
           int bankkonto2 = 1000;
       }
   }
   
   

   public class Dice{
       Random rand = new Random();

       int die1 = rand.nextInt(6) + 1;

       int die2 = rand.nextInt(6) + 1;

       int total = die1 + die2;

   }

}
