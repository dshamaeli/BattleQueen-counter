/** Author:Daniel Shamaeli, Student ID:201230464
    this is the second assigment for COMP517
    https://github.com/dshamaeli/battleQueen
 */
 
 //BattleQueen arranges tournament
 public class BattleQueen
{
    private static final int TIE = 0; //shows Draw result
    private static final int WON = 1;  //shows win result
    private static final int LOST= -1; //shows lost result
    private static int battleNo = 0; //count battles
    Monster monster1, monster2, monster3, monster4;

        //constructor
    public BattleQueen(Monster monster1, Monster monster2, Monster monster3, Monster monster4)
    {
        this.monster1 = monster1;
        this.monster2 = monster2;
        this.monster3 = monster3;
        this.monster4 = monster4;
    }

    // start and judged the fight (could be splited at next refactor)
    private void fight(Monster monster1, Monster monster2)
    {
        //fight

        int opponent1_strength = monster1.getAttribute("strength");//get monster1 strength
        int opponent1_wrath = monster1.getAttribute("wrath"); //get monster 1 wrath
        int opponent2_strength = monster2.getAttribute("strength");//get monster1 strength
        int opponent2_wrath = monster2.getAttribute("wrath");//get monster 1 wrath

        battleNo++; //counts battles

        System.out.println("\n*********************\n");
        System.out.println("battle No."+ battleNo +" starts\n\n"+
                monster1.showName() + "(" + opponent1_strength +"," +
                opponent1_wrath +") VS " + monster2.showName() +"("+
                opponent2_strength + "," + opponent2_wrath + ")");

        //judgement
        
        //compare strenght
        if (opponent1_strength > opponent2_strength)
        {

            monster1.setResult(WON); //Monster 1 won
            monster2.setResult(LOST); //Monster 2 lose
        }
        else
        {
            if (opponent1_strength < opponent2_strength)
            {
                monster1.setResult(LOST);
                monster2.setResult(WON);
            }
            else
            {
                if (opponent1_wrath > opponent2_wrath)
               {
                   monster1.setResult(WON);
                   monster2.setResult(LOST);
               }
               else
               {
                   if (opponent1_wrath < opponent2_wrath)
                   {
                       monster1.setResult(LOST);
                       monster2.setResult(WON);
                   }
                   else
                   {
                       monster1.setResult(TIE); // tie situation
                       monster2.setResult(TIE); //tie situation
                   }
               }
            }
        }
    }

    //starts a tournament
    public void tournament()
    {
        System.out.println("\n\nThe Tournament begins...participants are:\n"+
                                                        monster1.showName()+",\n"+
                                                        monster2.showName()+",\n"+
                                                        monster3.showName()+"and\n"+
                                                        monster4.showName());
        fight( monster1 , monster2 );
        fight( monster1 , monster3 );
        fight( monster1 , monster4 );
        fight( monster2 , monster3 );
        fight( monster2 , monster4 );
        fight( monster3 , monster4 );
       
    }

    //asks Monsters for thier fight records
    public void showResults()
    {
        System.out.println("\n\nThe tournament if finished and the results are:");
        monster1.showResults();
        monster2.showResults();
        monster3.showResults();
        monster4.showResults();
    }
}
