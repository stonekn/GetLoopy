//Dice Roller
import java.util.Random;
import java.util.Scanner;

void main()
{
    Random rnd = new Random();
    Scanner in = new Scanner(System.in);
    String playAgain = "";

    do
    {
        int rolls = 0;
        int dieOne;
        int dieTwo;
        int dieThree;
        int dieSum;


        System.out.printf("%-6s%-6s%-6s%-6s%-6s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("-----------------------------");


        do
        {
            rolls++;
            dieOne = rnd.nextInt(6) + 1;
            dieTwo = rnd.nextInt(6) + 1;
            dieThree = rnd.nextInt(6) + 1;
            dieSum = dieOne + dieTwo + dieThree;

            System.out.printf("%-6d%-6d%-6d%-6d%-6d%n", rolls, dieOne, dieTwo, dieThree, dieSum);
        } while (dieOne != dieTwo || dieTwo != dieThree);

        System.out.println("You got a triple in " + rolls + " rolls!");
        System.out.print("Do you want to roll again [YN]: ");
        playAgain = in.nextLine();

    } while (playAgain.equalsIgnoreCase("Y"));

}