import java.util.Random;

public class Palace_gates {

    Random rand = new Random();
 
    int die1 = rand.nextInt(6) + 1;
 
    int die2 = rand.nextInt(6) + 1;
 
    int total = die1 + die2;

    int Turn = 0;

    int bankkonto1 = 1000;

    int bankkonto2 = 1000;

        public void palace_gates(){
        

        if (Turn == 0){
            if (total == 4){
                bankkonto1 = 100 + bankkonto1;
            }
            System.out.println("Du stjæler en halskæde fra en prinsesse uden for paladsets indgang, og sælger den for 100 penge. Din saldo er nu: " + bankkonto1); 
            
        } else Turn = 1;

        if (Turn == 1){
            if (total == 4){
                bankkonto2 = 100 + bankkonto2;
            }
            System.out.println("Du stjæler en halskæde fra en prinsesse uden for paladsets indgang, og sælger den for 100 penge. Din saldo er nu: " + bankkonto2);
        }else  Turn = 0;
        }
    }

