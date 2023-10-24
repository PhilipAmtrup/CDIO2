public class Walled_city {
    if (total = 6){
        

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