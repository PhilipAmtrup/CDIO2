import java.util.Random;

public class Terningspil {
    public class Spiller1{




    }



    public class Spiller2{
        




    }

    public class Dice{
        Random rand = new Random();

        int die1 = rand.nextInt(6) + 1;

        int die2 = rand.nextInt(6) + 1;

        int total = die1 + die2;

    }

}
