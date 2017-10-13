/** Author:Daniel Shamaeli, Student ID:201230464
    this is the second assigment for COMP517
    for version which shows opponents go to
    https://github.com/dshamaeli/battleQueen
    for this one go to:
    https://github.com/dshamaeli/BattleQueen-counter.git
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

        System.out.print("Please enter name for monster No." + ++counter +": ");
        monster.name = input.nextLine();

        monster.strength = getValidInt("strength", monster.name);

        monster.wrath = getValidInt("wrath",monster.name);

        //rerunting the created monster
        return monster;
    }

    //gets a number in 0-10 range
    public static int getValidInt(String tag,String name)
	{
		int var;
		Scanner input = new Scanner(System.in);

		do
		{   
			//prompting user for input
			System.out.print("Please enter " + name +"'s "+ tag+"(1-10): ");
				
			//check if input is an integer
			while(!input.hasNextInt())  
			{   
				System.out.print("The "+ name +"'s " + tag +" should be a number(1-10): ");
				input.next();
			}

			//getting user input
			var = input.nextInt();
		}
		while(var < 1 || var > 10); //checking unput until get a positive number

		return var;
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
        System.out.println("I am " + name + " :");
        System.out.println("I won " + win + " times") ;
        System.out.println("I lost " + lost + " times");
        System.out.println("I draw " + draw + " times");
    }
}
