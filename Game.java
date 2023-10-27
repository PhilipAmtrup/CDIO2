import java.util.Random;
import java.util.Scanner;

public class Game {

    Integer win = 3000;

    public String[] felterne = {"Tower: Du moeder en troldmand han fremtryller en blaa safir frem, som du saelger for 250 penge.", "Crater: Du gaar igennem et krater og braender dine foedder paa varmt rumstoev du betaler 100 penge for at faa behandling.", "Palace gates: Du stjaeler en halskaede fra en prinsesse uden for paladsets indgang, og saelger den for 100 penge.", "Cold desert: Du befinder dig i en kold oerken og bliver noedt til at varme dig, en lokal saelger dig et varmt gedeskind for 20 penge.", "Walled city: Du erobre en by sammen med en rigtig stor oproersbevaegelse. Du modtager 180 penge for din brave indsats.", "Monastery: Du er utroligt traet og har brug for et sted at hvile dig. Du kommer til et kloster hvor nogle munke giver dig mad og ly, foer du bevaeger dig videre.", "Black cave: Du går ind i en moerk hule hvor du taber 70 penge til en gammel mand i et underligt, men meget dramatisk hjemmelavet braetspil.", "Huts in the mountain: Du går igennem en japansk landsby i bjergene og bliver udfordret til duel af en samurai, men du snyder og skyder ham med din revolver. Du tager hans 60 penge", "The Werewolfwall: Du kommer til vareulvevaeggen og bliver bidt af en vareulv!. Du betaler en troldmand 80 penge for at loefte forbandelsen, men troldmanden er gavmild og giver dig en ekstra tur!", "The Pit: Din gambling afhaengighed slaar til igen og du taber 50 penge paa en gladiatorkamp.", "Goldmine: Du finder noget meget vaerdigfuldt guld i bjergene og vaelger at saelge det. Du faar 650 penge guldet!!"};
    public Integer[] values = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};

    Integer[] score = {1000, 1000};

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void spil(){


        System.out.println("Velkommen til det virtuelle terningespil!");


        System.out.print("Indtast spiller 1's navn: ");
        String player1Name = scanner.nextLine();
        System.out.print("Indtast spiller 2's navn: ");
        String player2Name = scanner.nextLine();

        Integer turn[] = {0, 1};

        while (score[0] < win && score[1] < win){ 
            int diceSum = dice();
            int diceSum2 = dice();
            
            String felter = felterne[diceSum - 2];
            String felter2 = felterne[diceSum2 - 2];
            int scorechange = values[diceSum - 2];
            int scorechange2 = values[diceSum2 - 2];

                if(score[0] <= 0){
                System.out.println(player1Name + " din pengebeholdning er paa " + score[0] + " og du har ikke flere penge tilbage og maa desværre udgaa spillet... Tillykke med sejren " + player2Name);
                break;
                                
                                
                } else if (score[1] <= 0){
                System.out.println(player2Name + " din pengebeholdning er paa " + score[1] + " og du har ikke flere penge tilbage og maa desværre udgaa spillet... Tillykke med sejren " + player1Name);
                break;
                                
                } 

            System.out.println(player1Name + "'s pengebeholdning er: " + score[0] + " og " + player2Name + "'s pengebeholdning er: " + score[1]);
            scanner.nextLine();
            System.out.println(player1Name + "'s tur. Tryk Enter for at rulle med terningerne.");
            scanner.nextLine();
            

            System.out.println(player1Name + " du rullede " + diceSum + " og har landet paa " + felter);
            score[turn[0]] += scorechange;


            scanner.nextLine();

            System.out.println(player2Name + "'s tur. Tryk Enter for at rulle med terningerne.");

            scanner.nextLine();

            System.out.println(player2Name + " du rullede " + diceSum2 + " og har landet paa " + felter2);
            score[turn[1]] += scorechange2;

            scanner.nextLine();


            // ekstra tur, men virker ikke
            // while (diceSum == 10){
            //     turn[0] = 0;
            // } if (diceSum2 == 10){
            //     turn[1] = turn[1];
            // } else {
            //     continue;
            // }

        }
            
          
       if (score[0] >= win && score[0] > 0){
        System.out.println(player1Name + "'s pengebeholdning er: " + score[0] + " og " + player2Name + "'s pengebeholdning er: " + score[1]);
        scanner.nextLine();
        System.out.println("Tillykke " + player1Name + " Du har vundet spillet!!!");

       } else if (score[1] >= win && score[1] > 0){
        System.out.println(player1Name + "'s pengebeholdning er: " + score[0] + " og " + player2Name + "'s pengebeholdning er: " + score[1]);
        scanner.nextLine();
        System.out.println("Tillykke " + player2Name + "! Du har vundet spillet!!!");
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


    
