package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
//will have a while loop here. while(true) will make an endless loop.
        VirtualPet pet = new VirtualPet("Salem", "cat");
        Scanner activeUser = new Scanner(System.in);
        int usersSelection = 1;

        System.out.println("Hello, " + pet.getPetName() + ", the cuddly " + pet.getSpecies() + ", is excited to see you. He is currently not doing well and needs attention.");

        while (usersSelection != 0) {
            System.out.println(pet.getPetName() + "'s need levels are:");
            System.out.println("Hunger: " + pet.getHunger());
            System.out.println("Boredom: " + pet.getBoredom());
            System.out.println("Tiredness: " + pet.getTiredness());
            System.out.println("What would you like to do?\n" + "Press 1 to feed\n" + "Press 2 to play\n" + "Press 3 to sleep\n" + "Press 0 to end game");

            usersSelection = activeUser.nextInt();

            pet.tick();

            if (usersSelection != 0) {
                System.out.println("You chose for " + pet.getPetName() + " to " + pet.defineSelection(usersSelection) + ". What would you like to do next?");
            }
            //add get help feature for numbers guest outside of 1-3
        }
        System.out.println("Thank you for taking care of " + pet.getPetName() + ". See you next time!");
    }
}
