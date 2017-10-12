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
    private int battleNo = 0;//count's Monster's battles
    private String name; //Monster's name
    private String opponent1, opponent2, opponent3; //store Monster's opponents
    private String result1,result2,result3; //store Monster's battles result
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
                return 0;
        }
    }
    
    //fight against opponent
    public void fightVs(Monster opponent)
    {
        battleNo++; //holds the battle number

        switch(battleNo) //records which opponent monster faced in each round
        {
        case 1 :
            this.opponent1 = opponent.name; 
            break;

        case 2 :
            this.opponent2 = opponent.name;
            break;

        case 3 :
            this.opponent3 = opponent.name;
            break; //just for cleaner code
        }
    }

    //records Monster's result
    public void setResult(String result)
    {
        /*
        //this part is for mainteadec  
        System.out.println("this is " + name +" battleNo:" + battleNo);
        */
        switch(battleNo)
        {
            case 1 :
                this.result1 = result;
                break;
            case 2 :
                this.result2 = result;
                break;
            case 3 :
                this.result3 = result;
                break;
            default :
                System.out.println("something is wrong");

        }
    }

    //prints Monster result
    public void showResults()
    {
        System.out.println("\n##################\n");
        System.out.println("I am " + name + ", I:");
        System.out.println(result1 + " My first battle VS " + opponent1);
        System.out.println(result2 + " the Second battle VS " + opponent2);
        System.out.println(result3 + " the third battle VS " + opponent3);
    }
}
