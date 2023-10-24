import java.util.Random;

public class Black_cave {
    Random rand = new Random();
 
    int die1 = rand.nextInt(6) + 1;
 
    int die2 = rand.nextInt(6) + 1;
 
    int total = die1 + die2;

    int Turn = 0;

    int bankkonto1 = 1000;

    int bankkonto2 = 1000;

        public void black_cave(){
        

        if (Turn == 0){
            if (total == 8){
                bankkonto1 = bankkonto1 - 70;
            }
            System.out.println( "Du går ind i en mørk hule hvor du taber 70 penge til en gammel mand i et underligt terningspil kaldet CDIO1. Din saldo er nu: " + bankkonto1); 
            
        } else Turn = 1;

        if (Turn == 1){
            if (total == 8){
                bankkonto2 = bankkonto2 - 70;
            }
            System.out.println("Du går ind i en mørk hule hvor du taber 70 penge til en gammel mand i et underligt terningspil kaldet CDIO1. Din saldo er nu: " + bankkonto2);
        }else  Turn = 0;
    } 
}
