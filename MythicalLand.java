/** Author:Daniel Shamaeli, Student ID:201230464
    this is the second assigment for COMP517
    for version which shows opponents go to
    https://github.com/dshamaeli/battleQueen
    for this one go to:
    https://github.com/dshamaeli/BattleQueen-counter.git
 */
class MythicalLand
{

    public static void main(String args[])
    {   
        //4 Monsters are created
        Monster monster1 = Monster.create();
        Monster monster2 = Monster.create();
        Monster monster3 = Monster.create();
        Monster monster4 = Monster.create();

        //Battle queen is created
        BattleQueen queen = new BattleQueen(monster1,monster2,monster3,monster4);

        //Tournament starts
        queen.tournament();

        //Queen asks for the results
        queen.showResults();
    }
}
