public class Cold_Desert {
    if (total = 5){
        

        if (Turn == 0){
            if (total == 5){
                bankkonto1 = bankkonto1 - 20;
            }
            System.out.println( "Du befinder dig i en kold ørken og bliver nødt til at varme dig, en lokal sælger dig et varmt gedeskind for 20 penge. Din saldo er nu: " + bankkonto1); 
            
        } else Turn = 1;

        if (Turn == 1){
            if (total == 5){
                bankkonto2 = bankkonto2 - 20;
            }
            System.out.println("Du befinder dig i en kold ørken og bliver nødt til at varme dig, en lokal sælger dig et varmt gedeskind for 20 penge. Din saldo er nu: " + bankkonto2);
        }else  Turn = 0;
    }
}

