import java.util.Scanner;
import java.io.*;

public class Class {
    Scanner sc = new Scanner(System.in);

    int skillPoints = (20);
    int agility, intelligence, strength, vitality, vigor, endurance, dexterity;

    void player(String username, String userClass) {
        System.out.println("Welcome " + username + "!");

        if (userClass.equalsIgnoreCase("Mage")) {
            System.out.println("Welcome, Promising Mage!");
        }
        else if (userClass.equalsIgnoreCase("Knight")) {
            System.out.println("Welcome, Promising Knight!");
        }
        else if (userClass.equalsIgnoreCase("Archer")) {
            System.out.println("Welcome, Promising Archer!");
        }
        else if (userClass.equalsIgnoreCase("Rouge")) {
            System.out.println("Welcome, Promising Rouge!");
        }

        //more else if for more classes

        //Skill allocating
        System.out.println("You have " + skillPoints + " Skill Points");
        System.out.println("We will begin by allocating your Skill Points");
        String reset;

        try {


            do {

                System.out.println("Agility: ");
                agility = sc.nextInt();

                System.out.println("Intelligence: ");
                intelligence = sc.nextInt();

                System.out.println("Strength: ");
                strength = sc.nextInt();

                System.out.println("Vitality: ");
                vitality = sc.nextInt();

                System.out.println("Vigor: ");
                vigor = sc.nextInt();

                System.out.println("Endurance: ");
                endurance = sc.nextInt();

                System.out.println("Dexterity: ");
                dexterity = sc.nextInt();

                if (dexterity+intelligence+endurance+vigor+vitality+strength+agility > skillPoints) {
                    System.out.println("You allocated too much Skill Points!");
                    System.out.println("You only have: " + skillPoints + " Skill Points");
                    System.out.print("You allocated: ");
                    System.out.println(dexterity+intelligence+endurance+vigor+vitality+strength+intelligence+agility);

                    reset = "yes";

                }
                else {
                    System.out.println("Reset? ");
                    System.out.println("Yes / No");
                    reset = sc.next();
                }


            } while (reset.equalsIgnoreCase("yes") || reset.equalsIgnoreCase("y"));

        } catch (Exception e) {
            System.out.println("An error occured");
        }

        //Writes data to file
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Username: " + username + "\n"
                    + "Class: " + userClass + "\n"
                    + "Agility: " + agility + "\n"
                    + "Intelligence: " + intelligence + "\n"
                    + "Strength: " + strength + "\n"
                    + "Vitality: " + vitality + "\n"
                    + "Vigor: " + vigor + "\n"
                    + "Endurance: " + endurance + "\n"
                    + "Dexterity: " + dexterity + "\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

    }

}
