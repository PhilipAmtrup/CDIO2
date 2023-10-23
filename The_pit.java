public class The_pit {
    if (total = 11){
        
    

        if (Turn == 0){
            if (total == 3){
                bankkonto1 = bankkonto1 - 50;
            }
            System.out.println("Din gambling afhængighed slår til igen og du taber 50 penge på en gladiatorkamp. Din saldo er nu: " + bankkonto1); 
            
        } else Turn = 1;

        if (Turn == 1){
            if (total == 3){
                bankkonto2 = bankkonto2 - 50;
            }
            System.out.println("Din gambling afhængighed slår til igen og du taber 50 penge på en gladiatorkamp. Din saldo er nu: " + bankkonto2);
        }else  Turn = 0;
    }
}
}
