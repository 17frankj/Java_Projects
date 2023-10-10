import java.util.Scanner;
import java.util.Random;

public class Duel {
    public static void main(String[] args) {

        // TODO 4: Create HogwartsStudent objects for Harry and Hermione
        int studentCount = 0;
        HogwartsStudent harry = new HogwartsStudent("Harry", "male", 1, "Gryffindor", " ");
        studentCount ++;
        HogwartsStudent hermione = new HogwartsStudent("Hermione", "female", 1, "Gryffindor", "stupefy");
        studentCount ++;
        // TODO 5: Prompt the user to choose a spell for Harry
        // Choose your spell to practice, either Expelliarmus, Stupefy, or Levicorpus: 
        Scanner scanner = new Scanner(System.in);
        // using a do while loop to give the user infinite attempts to input data correctly
        do
        {
            System.out.print(   "-----------------------------------" + '\n' +
                                "Expelliarmus: Disarming charm, knocks the victim's weapon out of their hands. \n" +
                                "Stupefy: Stunning spell, renders its target unconscious. \n" +
                                "Levicorpus: Dangles the target person upside-down by the ankle in mid-air. \n" +
                                "-----------------------------------" + '\n' +
                                "Choose a favorite spell for Harry: " );
            String chooseSpell = scanner.nextLine();
            // checking if choosespell was entered correctly
            if (chooseSpell.equalsIgnoreCase("expelliarmus") || chooseSpell.equalsIgnoreCase("stupefy") || chooseSpell.equalsIgnoreCase("levicorpus"))
            {
                harry.setFavoriteSpell(chooseSpell);
                break;
            }
            else
            {
                System.out.println( "------------------------\n" +
                                    "Wrong input, Try again\n" +
                                    "------------------------");
            }
        }
        while (true);
        scanner.close();
        
        // TODO 6: Set Hermione's favorite spell to "Stupefy"

        hermione.setFavoriteSpell("stupefy");

        // TODO 7: Create a spell object for each of Harry's and Hermione's favorite spells

        Spell harryFavoriteSpell = new Spell(harry.getFavoriteSpell());
        Spell hermioneFavoriteSpell = new Spell(hermione.getFavoriteSpell());
        
        // TODO 8: Check if Harry's favorite spell is "Expelliarmus" and print the spell's description if it is

        if (harryFavoriteSpell.toString("expelliarmus").equalsIgnoreCase("expelliarmus"))
        {
            System.out.println(harryFavoriteSpell.getDescription() + '\n');
        }

        // TODO 9: Print Hermione's favorite spell

        System.out.println('\n' + "Hermiones favorite spell is " + hermioneFavoriteSpell.getSpell() + "\n");

        // TODO 10: Print information about the duelers (Harry and Hermione)
        // Use the toString method

        System.out.println(harry.toString(harry.getName(), harry.getGender()) + '\n' +
                           "Gender: " + harry.getGender() + '\n' +
                           "Year: " + harry.getYear() + '\n' + 
                           "House: " + harry.getHouse() + '\n' +
                           "Favorite Spell: " + harry.getFavoriteSpell() + ": " + harryFavoriteSpell.getDescription() + '\n' +
                           "--------------------------------" + '\n' +
                           (hermione.toString(hermione.getName(), hermione.getGender())) +'\n' +
                           "Gender: " + hermione.getGender() + '\n' +
                           "Year: " + hermione.getYear() + '\n' + 
                           "House: " + hermione.getHouse() + '\n' +
                           "Favorite Spell: " + hermione.getFavoriteSpell() + ": " + hermioneFavoriteSpell.getDescription() + '\n' +
                           "--------------------------------" + '\n');
        // TODO 11: Check the number of HogwartsStudents in the duel for fairness 
        // Hint: this number should increase every time a new HogwartsStudent object is created
        if(studentCount == 2)
        {
            System.out.println("Fair Duel!" + '\n' +
                                "Amount of students: " + studentCount + '\n');
            
            
        }
        else
        {
            System.out.println("Unfair Duel" + '\n' +
                                "Amount of students: " + studentCount);
        }
        // TODO 13: Determine the winner of the duel based on the effectiveness of their favorite spells 
        System.out.println("The winner is " + Duel.determineWinner(harry, hermione) + '!');
    }

    // Method to determine the winner based on the effectiveness of their favorite spells
    public static String determineWinner(HogwartsStudent student1, HogwartsStudent student2) 
    {
        // TODO 11: Implement the logic to determine the winner
        
        HogwartsStudent harry = student1;
        HogwartsStudent hermione = student2;
        Random random = new Random();
        String winner = " ";

        //If both students have the same favorite spell, use a random number to determine the winner

        if(harry.getFavoriteSpell() == hermione.getFavoriteSpell())
        {
            int chance = random.nextInt(3);
            if(chance < 2)
            {
                winner = "Harry";
                return winner;
            }
            else
            {
                winner = "Hermione";
                return winner;
            }
        }
        //If one of them has "Expelliarmus" as their favorite spell, declare that person as the winner
        else if (harry.getFavoriteSpell().equalsIgnoreCase("expelliarmus"))
        {
            winner = "Harry";
            return winner;
        }
        else if (hermione.getFavoriteSpell().equalsIgnoreCase("expelliarmus"))
        {
            winner = "Hermione";
            return winner;
        }
        // Harry has levicorpus and hermione has supefy
        else
        {
            int chance = random.nextInt(3);
            if(chance < 2)
            {
                winner = "Harry";
                return winner;
            }
            else
            {
                winner = "Hermione";
                return winner;
            }
        }
    }
}
