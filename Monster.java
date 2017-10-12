/** Author:Daniel Shamaeli, Student ID:201230464
    this is the second assigment for COMP517
    https://github.com/dshamaeli/battleQueen
 */

//import Scanner to get user input 
 import java.util.Scanner;

 //Monster class
public class Monster
{

    private int strength; //Monster's strength should be betWON 0-10
    private int wrath; //Monster's wrath should be betWON 0-10
    private String name; //Monster's name
    private int win,lost,draw = 0;
    private static int counter = 0; //to count monsters

    private static Scanner input = new Scanner(System.in);//input scanner

    //creats a monster based on user input
    public static Monster create()
    {
        Monster monster = new Monster();

        System.out.print("Please inter name for monster No." + ++counter +": ");
        monster.name = input.nextLine();

        System.out.print("Please inter " + monster.name + " strength(0-10): ");
        monster.strength = input.nextInt();

        System.out.print("Please inter " + monster.name + " wrath(0-10): ");
        monster.wrath = input.nextInt();

        input.nextLine();// skip unwanted return

        //rerunting the created monster
        return monster;
    }

    //gives Monster's name
    public String showName()
    {
        return name;
    }

    // gives given attribue(strength or wrath)
    public int getAttribute(String attribute)
    {
        switch (attribute)
        {
            case "strength":
                return strength;

            case "wrath" :
                return wrath;
            default :
                //in case something went wrong when I am coding
                System.out.println(attribute+" is not a valid attribute!!");
                return 0; //need to return something 
        }
    }
    
    //records Monster's result
    public void setResult(int result)
    {
        switch(result)
        {
            case 1 :
                win++; // 1 is code for win in battleQueen class
                break;
            case -1 :
                lost++; // -1 is code for lost in battleQueen class
                break;
            case 0 :
                draw++; // 0 is code for draw in battleQueen class
                break;
            default :
                System.out.println("something is wrong"); //just checking
        }
    }

    //prints Monster result
    public void showResults()
    {
        System.out.println("\n##################\n");
        System.out.println("I am " + name + ", I:");
        System.out.println("I won " + win + " times") ;
        System.out.println("I lost " + lost + " times");
        System.out.println("I draw " + draw + " times");
    }
}
