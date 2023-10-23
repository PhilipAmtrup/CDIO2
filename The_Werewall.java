public class The_Werewall {
    if (total = 9){
        

        if (Turn == 0){
            if (total == 9){
                bankkonto1 = bankkonto1 - 80;
            }
            System.out.println("Du møder en troldmand han fremtryller en blå safir som du sælger for 250 penge. Din saldo er nu: " + bankkonto1); 
            
        } else {
            Turn = 0;
            System.out.println("Troldmanden giver dig en ekstra tur!");
        }
        if (Turn == 1){
            if (total == 9){
                bankkonto2 = bankkonto2 - 80;
            }
            System.out.println("Du møder en troldmand han fremtryller en blå safir som du sælger for 250 penge. Din saldo er nu: " + bankkonto2);
        }else {
            Turn = 1;
            System.out.println("Troldmanden giver dig en ekstra tur!");
        }
    }
}
