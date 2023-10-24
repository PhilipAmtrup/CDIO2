import java.util.Random;

public class Crater {
    Random rand = new Random();
 
    int die1 = rand.nextInt(6) + 1;
 
    int die2 = rand.nextInt(6) + 1;
 
    int total = die1 + die2;

    int Turn = 0;

    int bankkonto1 = 1000;

    int bankkonto2 = 1000;

        public void crater(){
        
    

        if (Turn == 0){
            if (total == 3){
                bankkonto1 = bankkonto1 - 100;
            }
            System.out.println("Du går i gennem et krater og brænder dine fødder på varmt rumstøv du betaler 100 penge for at få behandling. Din saldo er nu: " + bankkonto1); 
            
        } else Turn = 1;

        if (Turn == 1){
            if (total == 3){
                bankkonto2 = bankkonto2 - 100;
            }
            System.out.println("Du går i gennem et krater og brænder dine fødder på varmt rumstøv du betaler 100 penge for at få behandling. Din saldo er nu: " + bankkonto2);
        }else  Turn = 0;
    }
}