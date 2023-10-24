import java.util.Random;

public class Tower {
   

    Random rand = new Random();
 
    int die1 = rand.nextInt(6) + 1;
 
    int die2 = rand.nextInt(6) + 1;
 
    int total = die1 + die2;

    int Turn = 0;

    int bankkonto1 = 1000;

    int bankkonto2 = 1000;

        public void tower(){
        

        if (Turn == 0){
            if (total == 2){
                bankkonto1 = 250 + bankkonto1;
            }
            System.out.println("Du møder en troldmand han fremtryller en blå safir som du sælger for 250 penge. Din saldo er nu: " + bankkonto1); 
            
        } else Turn = 1;

        if (Turn == 1){
            if (total == 2){
                bankkonto2 = 250 + bankkonto2;
            }
            System.out.println("Du møder en troldmand han fremtryller en blå safir som du sælger for 250 penge. Din saldo er nu: " + bankkonto2);
        }else  Turn = 0;
    }
}
