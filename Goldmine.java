public class Goldmine {
    if (total = 12){
        

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
