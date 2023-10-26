import java.util.Random;
import java.util.Scanner;

public class Game {

    Integer win = 3000;
// måske ændre det til at der står et "final" efter static hvis det ikke virker (søg lige på det også)
    public static String[] felterne = {"Tower: Du møder en troldmand han fremtryller en blå safir som du sælger for 250 penge.", "Crater: Du går i gennem et krater og brænder dine fødder på varmt rumstøv du betaler 100 penge for at få behandling.", "Palace gates: Du stjæler en halskæde fra en prinsesse uden for paladsets indgang, og sælger den for 100 penge.", "Cold desert: Du befinder dig i en kold ørken og bliver nødt til at varme dig, en lokal sælger dig et varmt gedeskind for 20 penge.", "Walled city: Du erobre en by med en høj mur og tager indbyggerne til slaver, som du sælger for 180 penge.", "Monastery: Du kommer til et kloster hvor munkene giver dig mad og ly før du bevæger dig videre.", "Black cave: Du går ind i en mørk hule hvor du taber 70 penge til en gammel mand i et underligt terningspil.", "Huts in the mountain: Du går igennem en japansk landsby i bjergene og bliver udfordret til duel af en samurai, men skyder ham med din revolver og vinder 60 penge.", "The Werewolfwall: Du kommer til vareulvevæggen og bliver bidt. Du betaler en troldmand 80 penge for at løfte forbandelsen, men troldmanden giver dig en ekstra tur!", "The Pit: Din gambling afhængighed slår til igen og du taber 50 penge på en gladiatorkamp.", "Goldmine: Du finder meget værdigfuldt guld i bjergene og sælger det. Du får 650 penge for det!"};
    public static Integer[] values = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};

    Integer[] score = {1000, 1000};

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void spil(){

        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Velkommen til terningespillet!");


        System.out.print("Indtast spiller 1's navn: ");
        String player1Name = scanner.nextLine();
        System.out.print("Indtast spiller 2's navn: ");
        String player2Name = scanner.nextLine();


        Integer turn[] = {0, 1};

    
        

        while (score[0] < win && score[1] < win){
            System.out.println(player1Name + "'s pengebeholdning er: " + score[0] + " og " + player2Name + "'s pengebeholdning er: " + score[1]);
            scanner.nextLine();
            System.out.println(player1Name + "'s tur. Tryk Enter for at rulle med terningerne.");
            scanner.nextLine();
            
            int diceSum = dice();
            int diceSum2 = dice();
            
            String felter = felterne[diceSum - 2];
            String felter2 = felterne[diceSum - 2];

            int scoreændring = values[diceSum - 2];

            System.out.println(player1Name + " rullede " + diceSum + " - " + felter);
            score[turn[0]] += scoreændring;
            

            System.out.println(player2Name + "'s tur. Tryk Enter for at rulle med terningerne.");

            scanner.nextLine();

            System.out.println(player2Name + " rullede " + diceSum2 + " - " + felter2);
            score[turn[1]] += scoreændring;

            scanner.nextLine();

            // kan være turn skal stå et ekstra sted og skal ændres 

            System.out.println(player1Name + "'s pengebeholdning er nu: " + score[0]);
            System.out.println(player2Name + "'s pengebeholdning er nu: " + score[1]);

            if (turn[0] == 0 && diceSum == 10){
                System.out.println(player1Name + "Du får en ekstra tur!");
                turn[0] = 0;
            } else if (turn[1] == 1 && diceSum2 == 10){
                System.out.println(player2Name + "Du får en ekstra tur!");
                turn[1] = 1;
            }

            turn[0] = (turn[0] + 1) % 2;
            turn[1] = (turn[1] + 1) % 2;
            }
            
            // hvad foregår der her??
        // int spiller1vinder = score[0] >= win ? 0 : 1;
        // int spiller2vinder = score[1] >= win ? 0 : 1; 
        
       if (score[0] >= win){
        System.out.println(player1Name + score[0] + "Du har vundet!");

       } else if (score[1] >= win){
        System.out.println(player2Name + score[1] + "Du har vundet!");
       }
       scanner.close();
       }

       public static void main(String[] args){
        Game spil = new Game();
        spil.spil();
       }
        
    
  
    public Integer dice(){
        
        Random rand = new Random();

        int die1 = rand.nextInt(6) + 1;

        int die2 = rand.nextInt(6) + 1;

        int total = die1 + die2;

        return total;
        
        }
    }


    
