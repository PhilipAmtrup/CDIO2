import java.util.Random;

public class Goldmine {
    Random rand = new Random();
 
    int die1 = rand.nextInt(6) + 1;
 
    int die2 = rand.nextInt(6) + 1;
 
    int total = die1 + die2;

    int Turn = 0;

    int bankkonto1 = 1000;

    int bankkonto2 = 1000;

        public void goldmine(){
        

        if (Turn == 0){
            if (total == 12){
                bankkonto1 = bankkonto1 + 650;
            }
            System.out.println("Du finder guld i bjergene og sælger det, Du er rig! Din saldo er nu: " + bankkonto1); 
            
        } else Turn = 1;

        if (Turn == 1){
            if (total == 12){
                bankkonto2 = bankkonto2 + 650;
            }
            System.out.println("Du finder guld i bjergene og sælger det, Du er rig! Din saldo er nu: " + bankkonto2);
        }else  Turn = 0;
    }
}
