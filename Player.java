
import java.util.Random;
import java.util.Scanner;

// Spillernes score, tur og navn bliver sat i spil her
public class Player {
    public void player(String[] args){
   

   Integer Turn = 0;

   Scanner scanner = new Scanner(System.in);
   Random random = new Random();

   System.out.println("Velkommen til terningespillet!");


   System.out.print("Indtast spiller 1's navn: ");
   String player1Name = scanner.nextLine();
   System.out.print("Indtast spiller 2's navn: ");
   String player2Name = scanner.nextLine();

   if (Turn == 0) {
    System.out.println(player1Name + "'s tur. Tryk Enter for at rulle med terningerne.");
    scanner.nextLine();
    int die1 = rollDice(random);
    int die2 = rollDice(random);
    int sum1 = die1 + die2;
    System.out.println(player1Name + " rullede: " + die1 + " og " + die2 + " I alt: " + sum1);

   }else Turn = 1;{
        System.out.println(player2Name + "'s tur. Tryk Enter for at rulle med terningerne.");
        scanner.nextLine();
        int dice3 = rollDice(random);
        int dice4 = rollDice(random);
        int sum2 = dice3 + dice4;

        System.out.println(player2Name + " rullede: " + dice3 + " og " + dice4 + " I alt: " + sum2);

}
scanner.close();

    
       
    
   

} 

private static int rollDice(Random random) {
    return random.nextInt(6) + 1;
}
public class Konto1 {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    // public static void main (String[] args){

    //    int bankkonto1 = 1000;
    //    int bankkonto2 = 1000;
//    }

}
}
