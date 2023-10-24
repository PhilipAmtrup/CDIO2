import java.util.Random;

public class Walled_city {
    
    Random rand = new Random();
 
    int die1 = rand.nextInt(6) + 1;
 
    int die2 = rand.nextInt(6) + 1;
 
    int total = die1 + die2;

    int Turn = 0;

    int bankkonto1 = 1000;

    int bankkonto2 = 1000;

        public void walled_city(){
        

        if (Turn == 0){
            if (total == 6){
                bankkonto1 = bankkonto1 + 180;
            }
            System.out.println( "Du erobre en by med en høj mur og tager indbyggerne til slaver, som du sælger for 180 penge. Din saldo er nu: " + bankkonto1); 
            
        } else Turn = 1;

        if (Turn == 1){
            if (total == 6){
                bankkonto2 = bankkonto2 + 180;
            }
            System.out.println("Du erobre en by med en høj mur og tager indbyggerne til slaver, som du sælger for 180 penge. Din saldo er nu: " + bankkonto2);
        }else  Turn = 0;
    }
}
