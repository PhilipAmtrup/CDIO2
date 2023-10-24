import java.util.Random;

public class Monastery {
    Random rand = new Random();
 
    int die1 = rand.nextInt(6) + 1;
 
    int die2 = rand.nextInt(6) + 1;
 
    int total = die1 + die2;

    int Turn = 0;

    int bankkonto1 = 1000;

    int bankkonto2 = 1000;

        public void monastery(){
        

        if (Turn == 0){
            if (total == 7){
                bankkonto1 = bankkonto1 + 0;
            }
            System.out.println( "Du kommer til et kloster hvor munkene giver dig mad og ly før du bevæger dig videre. Din saldo er stadig: " + bankkonto1); 
            
        } else Turn = 1;

        if (Turn == 1){
            if (total == 7){
                bankkonto2 = bankkonto2 + 0;
            }
            System.out.println("Du kommer til et kloster hvor munkene giver dig mad og ly før du bevæger dig videre. Din saldo er stadig: " + bankkonto2);
        }else  Turn = 0;
    }
}
