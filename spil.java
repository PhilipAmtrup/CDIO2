import java.util.Random;
import java.util.Scanner;

public class spil {

    String[] felter ={"Tower: Du møder en troldmand han fremtryller en blå safir som du sælger for 250 penge.", "Crater: Du går i gennem et krater og brænder dine fødder på varmt rumstøv du betaler 100 penge for at få behandling.", "Palace gates: Du stjæler en halskæde fra en prinsesse uden for paladsets indgang, og sælger den for 100 penge.", "Cold desert: Du befinder dig i en kold ørken og bliver nødt til at varme dig, en lokal sælger dig et varmt gedeskind for 20 penge.", "Walled city: Du erobre en by med en høj mur og tager indbyggerne til slaver, som du sælger for 180 penge.", "Monastery: Du kommer til et kloster hvor munkene giver dig mad og ly før du bevæger dig videre.", "Black cave: Du går ind i en mørk hule hvor du taber 70 penge til en gammel mand i et underligt terningspil.", "Huts in the mountain: Du går igennem en japansk landsby i bjergene og bliver udfordret til duel af en samurai, men skyder ham med din revolver og vinder 70 penge.", "The Werewolfwall: Du kommer til vareulvevæggen og bliver bidt. Du betaler en troldmand 80 penge for at løfte forbandelsen, men troldmanden giver dig en ekstra tur!", "The Pit: Din gambling afhængighed slår til igen og du taber 50 penge på en gladiatorkamp.", "Goldmine: Du finder meget værdigfuldt guld i bjergene og sælger det. Du får 650 penge for det!"};
    Integer[] values = {250, 100, 100, 20, 180, 0, 70, 60, 80, 50, 650};
    Integer turn = 0;
    Integer player1win = 0;
    Integer player2win = 0;

    public static void main(String[] args){
        
        Player spiller = new Player();
        Konto konto = new Konto();
        Dice terning = new Dice();

        Integer player1win = 0;
        Integer player2win = 0;
        
        while(player1win < 1 && player2win < 1){
            spiller.player(args);
        }
        

        
        // if(terning.dice() == 7){
        //     System.out.println(konto.saldo());
        // } else {
        //     System.out.println("det var ikke en 7'er");
        // }

         
        

    }
    
}

class Dice {
    public Integer dice(){
        
        Random rand = new Random();

        int die1 = rand.nextInt(6) + 1;

        int die2 = rand.nextInt(6) + 1;

        int total = die1 + die2;

        return total;
        
        }
}
