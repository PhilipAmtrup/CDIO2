import java.util.Random;

public class Huts_in_the_mountain {
    Random rand = new Random();
 
    int die1 = rand.nextInt(6) + 1;
 
    int die2 = rand.nextInt(6) + 1;
 
    int total = die1 + die2;

    int Turn = 0;

    int bankkonto1 = 1000;

    int bankkonto2 = 1000;

        public void huts_in_the_mountain(){
        

        if (Turn == 0){
            if (total == 9){
                bankkonto1 = bankkonto1 + 60;
            }
            System.out.println( "Du går igennem en japansk landsby i bjergene og bliver udfordret til duel af en samurai, men skyder ham med din revolver og vinder 70 penge. Din saldo er nu: " + bankkonto1); 
            
        } else Turn = 1;

        if (Turn == 1){
            if (total == 9){
                bankkonto2 = bankkonto2 + 60;
            }
            System.out.println("Du går igennem en japansk landsby i bjergene og bliver udfordret til duel af en samurai, men skyder ham med din revolver og vinder 70 penge. Din saldo er nu: " + bankkonto2);
        }else  Turn = 0;
    }
}
