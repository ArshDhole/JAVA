//MAD LIBS GAME
import java.util.Scanner;
public class madlibs {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        
        //Declaring Variables
        String adjective1; //adjective = describes something (ex : fast,slow,expensive)
        String noun1; //noun = person,place,thing
        String adjective2;
        String verb1; //verb = action word
        String adjective3;

        //Taking Inputs
        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb: ");
        verb1 = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        adjective3 = scanner.nextLine();

        //Printing
        System.out.println("In a "+ adjective1 + " village, a young " + noun1 + " trained under the moon.");
        System.out.println("One night, a " + adjective2 + " dragon appeared in the sky.");
        System.out.println("The samurai " + verb1 + " an ancient spell to protect the kingdom.");
        System.out.println("From that day on, peace returned to the " + adjective3 + " lands.");

        /*
        Examples
        adjective1 = "mysterious"
        noun1 = "samurai"
        adjective2 = "glowing"
        verb1 = "whispered"
        adjective3 = "eternal"
        */

        scanner.close();
       
    }
}