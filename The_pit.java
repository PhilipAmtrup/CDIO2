import java.util.Random;

public class The_pit {
    
    Random rand = new Random();
 
    int die1 = rand.nextInt(6) + 1;
 
    int die2 = rand.nextInt(6) + 1;
 
    int total = die1 + die2;

    int Turn = 0;

    int bankkonto1 = 1000;

    int bankkonto2 = 1000;

    public void the_pit() {    

        if (Turn == 0){
           
                bankkonto1 = bankkonto1 - 50;
            
            System.out.println("Din gambling afhængighed slår til igen og du taber 50 penge på en gladiatorkamp. Din saldo er nu: " + bankkonto1); 
            
        } else Turn = 1;

        if (Turn == 1){
            
                bankkonto2 = bankkonto2 - 50;
            
            System.out.println("Din gambling afhængighed slår til igen og du taber 50 penge på en gladiatorkamp. Din saldo er nu: " + bankkonto2);
        }else  Turn = 0;
    }

}
